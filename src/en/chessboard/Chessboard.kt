package en.chessboard

class Chessboard(val dimension: Int) {

    var chessboard = arrayOf<Array<Int>>()

    /**
     * Initializes a chessboard with default dimension
     */
    constructor() : this(8)

    /**
     *  Creates a new chessboard with n lines based on dimension
     *  and fill with zeroes
     */
    fun create(src : Node, dist : Node) {
        for (i in 0 until dimension) {
            var square = arrayOf<Int>()

            (0 until dimension).forEach { j ->
                square += if (i == src.y && j == src.x) {
                    1
                } else if (i == dist.y && j == dist.x) {
                    2
                } else {
                    0
                }
            }

            chessboard += square
        }
    }

    /**
     * Draws chessboard
     */
    fun draw() {
        for (square in chessboard) {
            for (value in square) {
                print("$value ")
            }

            println()
        }
    }

    /**
     * Overriding default toString method
     * Returns basic info about chessboard dimension
     */
    override fun toString(): String {
        return "Rozměr hrací desky je $dimension x $dimension."
    }

}