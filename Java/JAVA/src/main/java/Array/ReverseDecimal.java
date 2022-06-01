package Array;
//뒤집은 소수

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDecimal {
    public boolean isPrime(int num) { // 하나의 소수만을 검증할때는 그냥 for문으로 돌림
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num; i++) { //int reverse
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseDecimal m = new ReverseDecimal();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        for (int aNum : m.solution(num, arr)) {
            System.out.print(aNum + " ");
        }
    }
}
