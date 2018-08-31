package en.chessboard

import en.chessboard.Knight.BFS

fun main(args: Array<String>) {

    // If not written, create default 8x8 chessboard
    val chessboard = Chessboard()
    println(chessboard.toString())

    // Starting position of the Knight
    val src = Node(1, 7)

    // Target position
    val dest = Node(2, 7)

    // Draw the chessboard
    chessboard.create(src, dest)
    chessboard.draw()

    println("Minimum number of steps from ${Knight.toString()}(${src.x}, ${src.y}) to (${dest.x}, ${dest.y}) " +
            " is " + BFS(src, dest, chessboard.dimension))

}