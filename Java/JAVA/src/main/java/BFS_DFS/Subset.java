package BFS_DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
    static int n;
    static int[] chk;
    static ArrayList<Integer> sumList;

    public ArrayList<Integer> DFS(int cur) {
        ArrayList<Integer> temp = new ArrayList<>();
        if (n + 1 == cur) {
            for (int i = 0; i <= n; i++) {
                if (chk[i] == 1)
                    temp.add(i);
            }
            return temp;
        } else {
            chk[cur] = 1;
            DFS(cur + 1);
            chk[cur] = 0;
            DFS(cur + 1);
        }
        return temp;
    }

    public String solution() {
        System.out.println(DFS(1));
        return "";
    }

    public static void main(String[] args) {
        Subset main = new Subset();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        chk = new int[n + 1];
        sumList = new ArrayList<>();
        main.solution();
    }
}
