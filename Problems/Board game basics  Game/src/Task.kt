object PlayingField {

    object Size {
        var width: Int = 0
        var height: Int = 0

        fun changeSize(width: Int, height: Int) {
            this.width = Math.max(0, width)
            this.height = Math.max(0, height)
        }
    }
}
