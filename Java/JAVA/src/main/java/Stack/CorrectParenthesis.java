package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {
    public String solution(String str) {
        String answer = "NO";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.empty()) return "NO";
                stack.pop();
            }
        }
        if (stack.empty()) answer = "YES";

        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CorrectParenthesis main = new CorrectParenthesis();

        String str = scanner.next();
        System.out.println(main.solution(str));
    }
}
