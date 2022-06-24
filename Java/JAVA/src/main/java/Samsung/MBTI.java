package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Person {
    String mbti;
    int cost;

    public Person(String mbti, int cost) {
        this.mbti = mbti;
        this.cost = cost;
    }
}

public class MBTI {
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    char[] alphabet = {'E', 'I', 'N', 'S', 'T', 'F', 'P', 'J'};
//    static Person[] people;

    public Pos bfs(int n,Person[] people) {
        boolean[] visited = new boolean[16];
        LinkedList<Person> queue = new LinkedList<>();

        queue.add(people[0]);
        visited[0] = true;
        while (!queue.isEmpty()) {
            Pos curPos = queue.poll();
            if (map[curPos.x][curPos.y] == item)
                return curPos;

            for (int i = 0; i < 4; i++) {
                int nx = curPos.x + dirX[i];
                int ny = curPos.y + dirY[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (earn == false && map[nx][ny] == 'X') continue;
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new Pos(nx, ny, curPos.cost + 1));
                    }
                }
            }
        }
        return null;
    }

    public int solution(int n, int[] subjects) {
        int answer = 0;
        String[] mbti = {"ENFJ", "ENFP", "ENTJ", "ENTP", "ESFJ", "ESFP", "ESTJ", "ESTP", "INFJ", "INFP", "INTJ", "INTP", "ISFJ", "ISFP", "ISTJ", "ISTP"};
        people = new Person[16];
        for (int i = 0; i < 16; i++) {
            people[i].mbti = mbti[i];
            people[i].cost = subjects[i];
        }

        bfs(n, people);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MBTI mbti = new MBTI();
        int T = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine()); //cost
        int[] subjects = new int[16];
        for (int i = 0; i < T; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                subjects[j] = Integer.parseInt(temp[i]);
            }
            mbti.solution(n, subjects);
        }
    }
}
