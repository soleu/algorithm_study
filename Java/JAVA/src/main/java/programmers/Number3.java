package programmers;

import java.util.LinkedList;

class Pos {
    int x;
    int y;
    int cost;

    public Pos(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}
public class Number3 {
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static char[][] map;

    public int bfs(int rows, int columns, int[][] lands){
        boolean[][] visited = new boolean[columns][rows];
        LinkedList<Pos> queue = new LinkedList<>();



        return 0;
    }

    public int[] solution(int rows, int columns, int[][] lands) {
        int[] answer = {};
        int[][] map = new int[columns][rows];

        //호수 첫 부분 찾기
//        for (int i = 0; i < columns; i++) {
//            for (int j = 1; j < rows; j++) {
//                if()
//            }
//        }
//

        return answer;
    }

    public static void main(String[] args) {
        Number3 main = new Number3();
        int[][] arr = {{2, 2}, {2, 3}, {2, 5},
                {3, 2}, {3, 4}, {3, 5}, {3, 6},
                {4, 3}, {4, 6},
                {5, 2}, {5, 5},
                {6, 2}, {6, 3}, {6, 4}, {6, 6},
                {7, 2}, {7, 6},
                {8, 3}, {8, 4}, {8, 5}};
        System.out.println(main.solution(5, 7, arr));
    }
}
