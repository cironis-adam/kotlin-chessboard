package en.chessboard

import java.util.*

internal object Knight {

    /**
     * Variables initialization
     */
    private val row = arrayOf<Int>(2, 2, -2, -2, 1, 1, -1, -1)
    private val col = arrayOf<Int>(-1, 1, 1, -1, 2, -2, 2, -2)

    /**
     * Check if (x, y) is valid chess board coordinates
     * Knight cannot go out of the chessboard
     */
    private fun valid(x: Int, y: Int, N: Int): Boolean = !(x < 0 || y < 0 || x >= N || y >= N)

    /**
     * Find minimum number of steps taken by the knight
     * from source to reach destination using BFS
     */
    fun BFS(src: Node, dest: Node, N: Int): Int {
        // Map to check if matrix cell is visited before or not
        val visited = HashMap<Node, Boolean>()

        // Create a queue and enqueue first node
        val queue = ArrayDeque<Node>()
        queue.add(src)

        // Run until queue is not empty
        while (!queue.isEmpty()) {
            // Pop front node from queue and process it
            val node = queue.poll()

            val x = node.x
            val y = node.y
            val dist = node.dist

            // If destination is reached, return distance
            if (x == dest.x && y == dest.y)
                return dist

            // Skip if location is visited before
            if (visited[node] == null) {
                // Mark current node as visited
                visited[node] = true

                /**
                 * Check for all 8 possible movements for a knight
                 * and enqueue each valid movement into the queue
                  */
                for (i in 0..7) {
                    /**
                     * Get the new valid position of Knight from current
                     * position on chessboard and enqueue it in the
                     * queue with +1 distance
                     */
                    val x1 = x + row[i]
                    val y1 = y + col[i]

                    if (valid(x1, y1, N))
                        queue.add(Node(x1, y1, dist + 1))
                }
            }
        }

        // Return infinity if path is not possible
        return Integer.MAX_VALUE
    }

    /**
     * Overiding default toString method
     * Returns a Knight icon
     */
    override fun toString(): String {
        return "\u2658"
    }

}