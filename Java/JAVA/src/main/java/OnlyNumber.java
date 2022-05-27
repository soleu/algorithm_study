// 숫자만 추출
// Integer.parseInt 를 사용하면 자리수에 구애받지 않고 String을 정수로 수정한다.
// 처음부터 자릿수를 계산하는 방법도 있지만, 뒤에 숫자가 더 있다면 이전 숫자를 * 10하여 키워주는 방법도 있다.

import java.util.Scanner;

public class OnlyNumber {
    public int solution(String str) {
        int answer = 0;
        str = str.toUpperCase().replaceAll("[^0-9]", "");
        answer=Integer.parseInt(str);
//        for (int i = 0; i < str.length(); i++) {
//            answer += (Character.getNumericValue(str.charAt(i)) * (int) Math.pow(10, str.length() - i - 1));
//        }
        return answer;
    }

    public static void main(String[] args) {
        OnlyNumber m = new OnlyNumber();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}