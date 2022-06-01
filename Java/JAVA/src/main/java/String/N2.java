package String;

import java.util.Scanner;

public class N2 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            //  if ((byte) x >= 65 && x < 97) str1.add(Character.toLowerCase(x));
            if (Character.isLowerCase(x))
                answer += Character.toUpperCase(x);
            else
                answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        N2 m = new N2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}