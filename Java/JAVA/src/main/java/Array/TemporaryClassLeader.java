package Array;

import java.util.Scanner;

public class TemporaryClassLeader {
    public int solution(int n, int[][] arr) {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        TemporaryClassLeader m = new TemporaryClassLeader();
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
