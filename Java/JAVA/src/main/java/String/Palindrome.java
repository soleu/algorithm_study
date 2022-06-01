package String;

import java.util.Scanner;

// 유효한 팰린드롬
// replaceAll + 정규식 이용
//[안에 ^을 쓰면 부정]
// upperCase를 먼저 붙여서 정규식을 줄임


public class Palindrome {
    public String solution(String str) {
        String str2 = "";
//        for (char aChar : str.toCharArray()) {
//            if (Character.isAlphabetic(aChar)) str2 += Character.toUpperCase(aChar);
//        }
        str2 = str.toUpperCase().replaceAll("[^A-Z]", "");
        String str3 = new StringBuilder(str2).reverse().toString();
        System.out.println(str2);
        if (str2.equals(str3)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Palindrome m = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}