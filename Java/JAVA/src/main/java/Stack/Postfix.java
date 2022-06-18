package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public int solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '+' || x == '-' || x == '*' || x == '/') {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (x == '+') stack.push(num2 + num1);
                else if (x == '-') stack.push(num2 - num1);
                else if (x == '*') stack.push(num2 * num1);
                else stack.push(num2 / num1);
            } else {
                stack.push(Integer.parseInt(String.valueOf(x)));
            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Postfix main = new Postfix();

        String str = scanner.next();
        System.out.println(main.solution(str));
    }
}
