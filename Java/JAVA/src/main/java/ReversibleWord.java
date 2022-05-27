// 회문 문자
//추가 ) StringBuilder.reverse.toString 으로 리버스가 같은지를 확인하는 방법도 있다
// 이때, str.equalsIgnoreCase를 사용하면 반복문을 바로 나갈 수 있다.

import java.util.Scanner;

public class ReversibleWord {
    public String solution(String str) {
        str = str.toLowerCase();
//        int lt = 0;
//        int rt = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "NO";
            }
//            lt++;
//            rt--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        ReversibleWord m = new ReversibleWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}