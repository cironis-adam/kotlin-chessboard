package en.chessboard

import en.chessboard.Knight.BFS

fun main(args: Array<String>) {

    val chessboard = Chessboard()
    println(chessboard.toString())
    chessboard.create()
    chessboard.draw()

    // Starting position of the Knight
    val src = Node(4, 5)

    // Target position
    val dest = Node(1, 1)

    System.out.println("Minimum number of steps is " + BFS(src, dest, chessboard.dimension))

}