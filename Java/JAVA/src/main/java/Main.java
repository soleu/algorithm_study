// 가장 짧은 문자거리
// 왼쪽에서부터 거리 : int p를 입력값보다 크게 넣음, 해당 문자와 같다면 0, 아니라면 +1씩 증가
// 오른쪽에서부터 거리 : indexOf를 사용 / for문 역순으로


import java.util.Scanner;

public class Main {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0; //어차피 왼쪽에서 같은 경우는 처리해줬기 때문
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : m.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}