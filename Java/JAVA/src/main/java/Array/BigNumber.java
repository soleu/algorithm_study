package Array;

import java.util.ArrayList;
import java.util.Scanner;
//최대한 main함수가 아닌 solution 함수를 바꾸는 방향으로 구현 -> 프로그래머스 문제 풀기 용이

public class BigNumber {
    public ArrayList<Integer> solution(int num, int[] str) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(str[0]);

        for (int i = 1; i < num; i++) {
            if (str[i - 1] < str[i]) answer.add(str[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        BigNumber m = new BigNumber();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] str = new int[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.nextInt();
        }
        for (int x : m.solution(num, str)) {
            System.out.print(x + " ");
        }
    }
}
