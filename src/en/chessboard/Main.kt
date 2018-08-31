package en.chessboard

import en.chessboard.Knight.BFS

fun main(args: Array<String>) {

    val chessboard = Chessboard()
    println(chessboard.toString())
    chessboard.create()
    chessboard.draw()

    // Starting position of the Knight
    val src = Node(3, 4)

    // Target position
    val dest = Node(4, 3)

    System.out.println("Minimální počet kroků je " + BFS(src, dest, chessboard.dimension))

}