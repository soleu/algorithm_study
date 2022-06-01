package Array;// 소수
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//소수 방법 중 에라토스테네스 방법이 제일 빠름
// N+1크기의 배열을 만들어서 2~자기자신까지 만약 나누어지는지 체크 (된다면 1)

import java.util.Scanner;

public class Decimal {
    public int solution(int num) {
        int[] arr = new int[num + 1]; //idx 번호가 n 까지 필요
        int answer = 0;

        for (int i = 2; i <= num; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= num; j = j + i) { // 배수로 움직인다
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Decimal m = new Decimal();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(m.solution(num));
    }
}