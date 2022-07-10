package Samsung.SWAcademy;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileInputStream;

import static java.lang.Math.max;

public class water {
    /*
       사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
       이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
     */
//    class Solution
//    {
    class Pos {
        int x;
        int y;
        int cost;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    public int bfs(int[][] arr, int cnt, int n) {
        boolean[][] visited = new boolean[n][n];
        LinkedList<Pos> queue = new LinkedList<>();

        queue.add(new Pos(0,0)); // 이 부분 cnt 로 수정
        visited[0][0]= true;

        while(!queue.isEmpty()){
            Pos curPos = queue.poll();

            for(int i=0;i<4;i++){
                int nx= curPos.x+dirX[i];
                int ny= curPos.y+dirY[i];
                
            }
        }

        return 0;
    }

    public void solution(int[][] arr, int n) {
        int answer = 1;
        int cnt = 1;
        while (cnt == n) {
            max(1, bfs(arr, cnt, n));
            cnt++;
        }
    }

    public static void main(String args[]) throws Exception {
        water main = new water();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            main.solution(arr, n);
        }
    }
}

