package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesis {
    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else if (x == ')') {
                stack.pop();
            } else {
                if (stack.empty()) answer += x;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoveParenthesis main = new RemoveParenthesis();

        String str = scanner.next();
        System.out.println(main.solution(str));
    }
}
