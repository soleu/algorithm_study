package String;//4. 단어 뒤집기
//// reverse
// StringBuffer sb = new StringBuffer(str).reverse().toString();
// StringBuffer/StringBuilder 사용 : String의 대용량 처리,

import java.util.Scanner;

public class reverseWords {
    public String solution(String str) {
        String answer = "";
        answer = new StringBuilder(str).reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        reverseWords m = new reverseWords();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            strArr[i] = m.solution(str);
        }
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
