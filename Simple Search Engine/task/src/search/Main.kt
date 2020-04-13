package search

import java.util.*
import java.io.File

fun showMenu() {
    val menuText = """
        
        === Menu ===
        1. Find a person
        2. Print all people
        0. Exit
        
    """.trimIndent()
    println(menuText)
}

enum class QueryStrategy {
    ALL {
        /**
         * Set intersection of all part's indices
         */
        override fun find(query: String): Set<Int> {
            var out = setOf<Int>()
            out = out union (0 until People.entries.size).toSet()
            for (part in query.split(" ")) {
                out = out intersect ((People.InvertedIndex.index[part])?.toSet() ?: setOf<Int>())
            }
            return out
        }
    },
    ANY {
        /**
         * Set union of all part's indices
         */
        override fun find(query: String): Set<Int> {
            var out = setOf<Int>()
            for (part in query.split(" ")) {
                out = out union (People.InvertedIndex.index[part]?.toSet() ?: setOf<Int>())
            }
            return out
        }
    },
    NONE {
        /**
         * Set difference of all line and part's indices
         */
        override fun find(query: String): Set<Int> {
            var out = setOf<Int>()
            out = out union (0 until People.entries.size).toSet()
            for (part in query.split(" ")) {
                out = out subtract (People.InvertedIndex.index[part]?.toSet() ?: setOf<Int>())
            }
            return out
        }
    };

    abstract fun find(query: String): Set<Int>;
}

object People {
    var entries = listOf<String>()

    fun printAll() {
        println("\n=== List of people ===")
        for (entry in this.entries) println(entry)
    }

    fun search(query: String, strategy: String) {
        var result = listOf<String>()
        val indices = when (strategy) {
            "ALL" -> QueryStrategy.ALL.find(query)
            "ANY" -> QueryStrategy.ANY.find(query)
            "NONE" -> QueryStrategy.NONE.find(query)
            else -> setOf<Int>()
        }
        if (indices.isEmpty()) {
            println("No matching people found.")
        }
        else {
            entries.slice(indices).forEach { println(it) }
        }

    }

    object InvertedIndex {
        var index = mutableMapOf<String, MutableList<Int>>()

        fun buildIndex() {
            index = mutableMapOf()
            for (i in 0..entries.lastIndex) {
                val parts = entries[i].split(" ")
                for (part in parts) {
                    if (index.containsKey(part.toLowerCase())) index[part.toLowerCase()]?.add(i)
                    else index[part.toLowerCase()] = mutableListOf(i)
                }
            }
        }

        fun updateIndex(newEntries: List<String>) {
            for (i in 0..newEntries.lastIndex) {
                val j = entries.size + i
                val parts = newEntries[j].split(" ")
                for (part in parts) {
                    if (index.containsKey(part.toLowerCase())) index[part.toLowerCase()]?.add(j)
                    else index[part.toLowerCase()] = mutableListOf(j)
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    /* Read records from file */
    val filename = args[1]
    People.entries = File(filename).readLines()
    People.InvertedIndex.buildIndex()

    var userInput: Int
    do {
        showMenu()
        userInput = scanner.nextInt()
        when(userInput) {
            1 -> {
                println("\nSelect a matching strategy: ALL, ANY, NONE")
                val strategy = readLine()!!.toUpperCase()
                println("\nEnter a name or email to search all suitable people.")
                val query = readLine()!!.toLowerCase()
                People.search(query, strategy)
            }
            2 -> People.printAll()
            0 -> println("\nBye!")
            else -> println("\nIncorrect option! Try again.")
        }
    } while (userInput != 0)

}
