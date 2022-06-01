package String;

import java.util.Scanner;

public class N3 {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > answer.length()) answer = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        N3 m = new N3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}