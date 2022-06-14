package TwoPointer;

import java.util.Scanner;

import static java.lang.Math.max;

public class MaximumOutput {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            temp += arr[i];
        }
        answer = temp;
        for (int i = k; i < n; i++) {
            temp += arr[i] - arr[i - k];
            answer = max(answer, temp);
        }
        return answer;
    }

    public static void main(String[] args) {
        MaximumOutput main = new MaximumOutput();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println(main.solution(n, k, arr1));
    }
}
