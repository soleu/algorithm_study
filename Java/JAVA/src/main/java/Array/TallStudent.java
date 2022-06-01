package Array;// 보이는 학생
//8
//        130 135 148 140 145 150 150 153

import java.util.Scanner;

public class TallStudent {
    public int solution(int[] arr) {
        int top = arr[0];
        int cnt = 1;
        for (int person : arr) {
            if (person > top) {
                cnt++;
                top = person;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        TallStudent m = new TallStudent();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(m.solution(arr));
    }
}