import java.util.Scanner;

public class ComposeString {
    // 문자열 압축
// 방법 1 : cnt 사용 ( i와 i+1 지점이 같은지 확인), 뒤에 무조건 일치하지 않는 것을 넣어둠
// 방법 2 : 2중 for 문 : 다른것이 나오면 반환, 뒤에 무조건 일치하지 않는 것을 넣어둠

    public String solution(String str) {
        String answer = "";
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        // 방법 2
//        str+=" ";
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i; j < str.length(); j++) {
//                if (str.charAt(j) != str.charAt(i)) {
//                    answer += (str.charAt(i));
//                    if (j - i != 1) answer += String.valueOf(j - i);
//                    i = j;
//                }
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        ComposeString m = new ComposeString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
