package TwoPointer;

import java.util.Scanner;
//8 6
//1 2 1 3 1 1 1 2

// 연속 수열
// sliding window + while 문으로 앞으로 전진
public class ContinuousSubsequences {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int temp = 0;
        int lp = 0;

        for (int i = 0; i < n; i++) {
            temp += arr[i];
            if (temp == m) {
                answer++;
            }
            if (temp >= m) {
                while (temp > m) {
                    temp = temp - arr[lp++];
                    if (temp == m) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequences main = new ContinuousSubsequences();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }
}
