package Array;

import java.util.Scanner;

public class Peak {
    public int solution(int num, int[][] arr) {
        int answer = 0;
        int[][] map = new int[num + 2][num + 2];

        for (int i = 0; i < num + 2; i++) {
            for (int j = 0; j < num + 2; j++) {
                if (i == 0 || j == 0 || i == num + 1 || j == num + 1) map[i][j] = 0;
                else map[i][j] = arr[i - 1][j - 1];
            }
        }
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                if (map[i][j] > map[i - 1][j] && map[i][j] > map[i + 1][j] && map[i][j] > map[i][j - 1] && map[i][j] > map[i][j + 1])
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Peak m = new Peak();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(m.solution(n, arr));
    }
}
