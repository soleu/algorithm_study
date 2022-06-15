package TwoPointer;

import java.util.Scanner;

// 최대 길이 연속 부분 수열
public class MaxLength {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lp = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) temp++;
            if (k == 0 && arr[i] == 0) {
                while (k == 0) {
                    lp++;
                    if (arr[lp] == 0) k++;
                }
            }
            if (k != 0 && arr[i] == 0) {
                k--;
            }
            temp = i - lp;
            answer = Math.max(answer, temp);
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxLength main = new MaxLength();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(main.solution(n, k, arr));
    }
}
