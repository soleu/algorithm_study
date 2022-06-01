package Array;// 소수
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Main {
    public int solution(int num,String str) {
        String[] strArr = str.split("");
        System.out.println(strArr.length);
        return 0;
//        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        String str = sc.nextLine();
        System.out.println(str);
//        System.out.print(m.solution(num,str));
    }
}