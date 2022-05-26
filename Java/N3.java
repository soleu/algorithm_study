import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > answer.length()) answer = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}