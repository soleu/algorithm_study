package Samsung.SWAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WaterShort {
    private static int N;
    private static int[][] m;
    private static boolean[][] visited;
    private static boolean[] check_num;
    private static int max;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        int[] answers = new int[T];

        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st;
            check_num = new boolean[100 + 1];
            m = new int[N + 2][N + 2];
            int hmax = 0;
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 1; j <= N; j++) {
                    m[i][j] = Integer.parseInt(st.nextToken());
                    if (!check_num[m[i][j]]) check_num[m[i][j]] = true;
                    if (hmax < m[i][j]) hmax = m[i][j];
                }
            }
            max = 1;

            for (int v = 1; v <= hmax; v++) {
                if (!check_num[v]) continue;
                visited = new boolean[N + 2][N + 2];
                int tmpMax = 0;
                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (!visited[i][j] && m[i][j] > v) {
                            dfs(i, j, v);
                            tmpMax++;
                        }
                    }
                }
                if (tmpMax > max) max = tmpMax;
            }
            answers[test_case-1] = max;
        }
        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + answers[i]);
        }
    }

    private static void dfs(int y, int x, int h) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (m[ny][nx] > h && !visited[ny][nx]) {
                dfs(ny, nx, h);
            }
        }
    }

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};
}

