package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int no;
    int prior;

    public Person(int no, int prior) {
        this.no = no;
        this.prior = prior;
    }
}

public class EmergencyRoom {
    public int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> queue = new LinkedList();

        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person person : queue) {
                if (temp.prior < person.prior) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }

            if (temp != null) {
                if (temp.no == m) return answer;
                answer++; // 이부분 (본인 차례일때는 순서를 더할 필요가 없음)
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmergencyRoom main = new EmergencyRoom();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}
