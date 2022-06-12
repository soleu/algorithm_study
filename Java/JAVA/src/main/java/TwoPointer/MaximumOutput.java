package TwoPointer;

import java.util.Scanner;

import static java.lang.Math.max;

public class MaximumOutput {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int days = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            if (days == m) {
                answer = max(answer, temp);
                days = 0;
                temp = 0;
            }
            temp+=
            days++;
        }
        return answer;
    }

    public static void main(String[] args) {
        MaximumOutput main = new MaximumOutput();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println(main.solution(n, m, arr1));
    }
}
