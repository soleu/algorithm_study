package Array;
// 격자판 최대합
import java.util.Scanner;

public class MaxSumGrid {
    public int solution(int num, int[][] arr) {
        int answer = 0;
        int max = 0;
        int tempDiag1 = 0;
        int tempDiag2 = 0;
        for (int i = 0; i < num; i++) {
            int tempRow = 0;
            int tempCol = 0;
            tempDiag1 += arr[i][i];
            tempDiag2 += arr[i][num - i - 1];
            for (int j = 0; j < num; j++) {
                tempRow += arr[i][j];
                tempCol += arr[j][i];
            }
            if (tempRow > max) max = tempRow;
            if (tempCol > max) max = tempCol;
        }
        int diag = Math.max(tempDiag1, tempDiag2);
        answer =Math.max(diag, max);

        return answer;
    }

    public static void main(String[] args) {
        MaxSumGrid m = new MaxSumGrid();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(m.solution(n, arr));
    }
}
