// 문자열 압축
//2진수 -> 10진수 변환 Integer.valueOf(string, 2);
//10진수 -> 2진수 변환 Integer.toBinaryString(int);
//아스키코드 : 문자 - getNumericValue, 십진법 - (int)
//개수만큼 자르기 : for 개수, str=str.subString(num)으로 시작 위치를 수정함

import java.util.Scanner;

public class Main {
    public String solution(int num, String str) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            String temp = str.substring(0, 7).replace('*', '0').replace('#', '1'); // 이부분에서 에러가 계속 발생함.
            answer += (char) Integer.parseInt(temp, 2);
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String answer = "";
        int num = sc.nextInt();
        String str = sc.next();
        answer = m.solution(num, str); // 이부분에서 에러가 계속 발생함.
        System.out.println(answer);
    }
}