// Last updated: 8/22/2025, 4:44:42 PM
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] result = new int[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize the queue and result array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isWater[i][j] == 1) {
                    result[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    result[i][j] = -1; // Mark unvisited cells
                }
            }
        }

        // Directions for BFS (up, down, left, right)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && result[newX][newY] == -1) {
                    result[newX][newY] = result[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        return result;
    }
}
