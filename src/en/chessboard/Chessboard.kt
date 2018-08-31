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
    fun create() {
        for (i in 1..dimension) {
            var square = arrayOf<Int>()

            for (j in 1..dimension) {
                square += 0
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
     * Overiding default toString method
     * Returns basic info about chessboard dimension
     */
    override fun toString(): String {
        return "Rozměr hrací desky je $dimension x $dimension."
    }

}