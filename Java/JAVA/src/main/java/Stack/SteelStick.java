package Stack;

import java.util.Scanner;
import java.util.Stack;

// 쇠막대기
public class SteelStick {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == '(' && str.charAt(i + 1) == ')') {
                answer += stack.size();
                i++;
            } else if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                answer++;
                stack.pop();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SteelStick main = new SteelStick();

        String str = scanner.next();
        System.out.println(main.solution(str));
    }
}
