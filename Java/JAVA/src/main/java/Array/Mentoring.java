package Array;

import java.util.Scanner;

public class Mentoring {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
            }
            System.out.println();
        }
        return answer;
    }

    public static void main(String[] args) {
        Mentoring main = new Mentoring();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, m, arr));
    }
}
