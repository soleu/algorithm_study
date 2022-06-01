package String;// 중복 문자 제거
// - 이중 포문 / indexOf 사용 가능
// indexOf :검색된 문자열이 '첫번째'로 나타나는 위치 index를 리턴
// indexOf와 같지 않다면 저장을 안한다. (맨 처음만 저장하게 하는 법 : indexOf 사용)

import java.util.Scanner;

public class DeleteDuplicateChar {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

// 이중 포문 작성 방법
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            boolean flag = false;
//            for (int j = 0; j < i; j++) {
//                if (chars[j] == chars[i]) flag = true;
//            }
//            if (flag == false) answer += chars[i];
//        }

        return answer;
    }

    public static void main(String[] args) {
        DeleteDuplicateChar m = new DeleteDuplicateChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}