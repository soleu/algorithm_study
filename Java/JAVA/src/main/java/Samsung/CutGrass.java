package Samsung;

import java.util.Scanner;

public class CutGrass {
    public long solution(int n, int m, int d, int[][] place, int[] oil) {
        long answer = 0;

        for (int i = 0; i < d; i++) {
            //일차마다 1cm씩 자라기
            for (int l = 0; l < n; l++) {
                for (int j = 0; j < m; j++) {
                    place[l][j]++;
                }
            }
            //최고 순위 일수만큼 뽑기
            int sum = 0;
            for (int j = 0; j < oil[i]; j++) {
                long max = place[0][0];
                int x = 0, y = 0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        if (place[k][l] > max) {
                            max = place[k][l];
                            x = k;
                            y = l;
                        }
                    }
                }
                sum += max - 1;
                place[x][y] = 1;
            }
            answer += (i + 1) * sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        CutGrass main = new CutGrass();
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int n, m, d;
        long[] answers = new long[T];
        for (int t = 0; t < T; t++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            d = scanner.nextInt();
            int[][] place = new int[n][m];
            int[] oil = new int[d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    place[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < d; i++) {
                oil[i] = scanner.nextInt();
            }
            answers[t] = main.solution(n, m, d, place, oil);
        }
        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + answers[i]);
        }
    }
}
