package Samsung.SWAcademy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.Math.max;

//public class water {
class Solution {
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int answer = 0;

    public void bfs(int x, int y, int level) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int curX = data[0];
            int curY = data[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dirX[i];
                int ny = curY + dirY[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (!visited[nx][ny] && map[nx][ny] > level) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String args[]) throws Exception {
        Solution main = new Solution();
        Scanner sc = new Scanner(System.in);
        int T;

        T = sc.nextInt();
        int[] answers = new int[T];

        for (int test_case = 1; test_case <= T; test_case++) {
            n = sc.nextInt();
            map = new int[n][n];

            int max = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                    max = Math.max(max, map[i][j]);
                }
            }

            for (int level = 0; level < max; level++) {
                visited = new boolean[n][n];
                count = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (map[i][j] > level && !visited[i][j]) {
                            main.bfs(i, j, level);
                            count++;
                        }
                    }
                }
                answer = Math.max(answer, count);
            }
            answers[test_case - 1] = answer;
        }
        for (int i = 0; i < answers.length; i++) {
            System.out.println("#" + (i + 1) + " " + answers[i]);
        }
    }
}

