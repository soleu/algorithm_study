package Array;
// 멘토링
//짝을 지어질 수 있는 경우의 수  : N*N
//검증 : M

import java.util.Scanner;

public class Mentoring {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < m; k++) {
//                    System.out.println(k + " " + i + arr[k][i] + "  " + k + " " + j + arr[k][j]);
                    if (arr[k][i] >= arr[k][j]) flag = false;
                }
                if (flag) {
                    answer++;
                    System.out.println(i + " " + j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Mentoring main = new Mentoring();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //4
        int m = scanner.nextInt(); //3
        int[][] arr = new int[m][n]; //34
        for (int i = 0; i < m; i++) { //3
            for (int j = 0; j < n; j++) { //4
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, m, arr));
    }
}
