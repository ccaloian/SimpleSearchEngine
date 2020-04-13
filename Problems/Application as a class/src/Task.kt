class Application(val name: String) {

    fun run(args: Array<String>) {
        println(this.name)
        args.forEach { println(it) }
    }
}
