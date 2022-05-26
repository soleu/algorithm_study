//a#b!GE*T@S
// string : array 없이 붙여서 저장 : String.valueOf(str)
// 특정 문자 바꾸기
// toCharArray -> 양끝에서 이진탐색 느낌으로
// 특정문자만 뒤집는다 -> 왼쪽이든 오른쪽이든 해당 문자만 넘기고, 대칭 신경 X

import java.util.Scanner;

public class reverseCertainChar {
    public String solution(String str) {
        String answer = "";
        char[] chr = str.toCharArray();
        int lt = 0;
        int rt = chr.length - 1;
        while (lt < rt) {
            if (String.valueOf(chr[lt]).matches("[^a-zA-Z0-9\\s]")) {
                lt++;
            } else if (String.valueOf(chr[rt]).matches("[^a-zA-Z0-9\\s]")) {
                rt--;
            } else {
                char tmp = chr[lt];
                chr[lt] = chr[rt];
                chr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chr);
        return answer;
    }

    public static void main(String[] args) {
        reverseCertainChar m = new reverseCertainChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}