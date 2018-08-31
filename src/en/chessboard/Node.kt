package en.chessboard

class Node {

    /**
     * (x, y) represents chess board coordinates
     * dist represent its minimum distance from the source
     */
    var x: Int = 0
    var y: Int = 0
    var dist: Int = 0

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    constructor(x: Int, y: Int, dist: Int) {
        this.x = x
        this.y = y
        this.dist = dist
    }

    /**
     * Object is used as a key in a HashMap
     * we need to implement hashCode() and equals()
    */
    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val node = o as Node?

        if (x != node!!.x) return false
        return if (y != node.y) false else dist == node.dist
    }

    /**
     * Object is used as a key in a HashMap
     * we need to implement hashCode() and equals()
     */
    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + dist
        return result
    }

}