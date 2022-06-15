package TwoPointer;

import java.util.Scanner;

public class ContinuousNumber {
    public int solution(int n) {
        int answer = 0;
        int lp = (n / 2);
        int rp = lp + 1;
        int temp = rp;
        while (lp > 0 && rp > 0) {
            temp += (lp--);
            if (temp == n) answer++;
            if (temp >= n) {
                while (temp > n) {
                    if (temp == n) answer++;
                    temp -= (rp--);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousNumber main = new ContinuousNumber();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(main.solution(n));
    }
}
