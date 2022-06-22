package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Pos {
    int x;
    int y;
    int cost;

    public Pos(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}

public class Excalibur {
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static char[][] map;

    public Pos bfs(int n, int m, int r, int k, char item, boolean earn) {
        boolean[][] visited = new boolean[n][m];
        LinkedList<Pos> queue = new LinkedList<>();

        queue.add(new Pos(r, k, 0));
        visited[r][k] = true;
        while (!queue.isEmpty()) {
            Pos curPos = queue.poll();
            if (map[curPos.x][curPos.y] == item)
                return curPos;

            for (int i = 0; i < 4; i++) {
                int nx = curPos.x + dirX[i];
                int ny = curPos.y + dirY[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (earn == false && map[nx][ny] == 'X') continue;
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new Pos(nx, ny, curPos.cost + 1));
                    }
                }
            }
        }
        return null;
    }

    public int solution(int n, int m, int r, int k) {
        int answer = Integer.MAX_VALUE;
        char[] items = {'A', 'B', 'C'};
        Pos pos;

        for (int i = 0; i < 3; i++) {
            Pos[] poses = new Pos[4];
            int sum = 0;
            poses[0] = bfs(n, m, r, k, items[i], false);
            if (poses[0] == null) continue;
            for (int j = 0; j < 3; j++) {
                if (i == j) continue;
                poses[1] = bfs(n, m, poses[0].x, poses[0].y, items[j], false);
                if (poses[1] == null) continue;
                for (int l = 0; l < 3; l++) {
                    if (l == j || l == i) continue;
                    poses[2] = bfs(n, m, poses[1].x, poses[1].y, items[l], false);
                    if (poses[2] == null) continue;
                    poses[3] = bfs(n, m, poses[2].x, poses[2].y, 'S', true);
                    if (poses[3] == null) continue;
                    sum = poses[0].cost + poses[1].cost + poses[2].cost + poses[3].cost;
                  answer = Math.min(answer, sum);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Excalibur main = new Excalibur();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n, m, r, k;
            String[] temp = br.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            r = Integer.parseInt(temp[2]);
            k = Integer.parseInt(temp[3]);
            map = new char[n][m];

            for (int j = 0; j < n; j++) {
                String[] temp1 = br.readLine().split("");
                for (int l = 0; l < m; l++) {
                    map[j][l] = temp1[l].charAt(0);
                }
            }
            System.out.println("#" + (i + 1) + " " + main.solution(n, m, r - 1, k - 1));
        }
    }
}
