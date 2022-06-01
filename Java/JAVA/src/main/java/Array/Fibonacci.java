package Array;

import java.util.Scanner;

public class Fibonacci {

    public int[] solution(int num) {
        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < num; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Fibonacci m = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int aNum : m.solution(num)) {
            System.out.print(aNum + " ");
        }
    }
}
