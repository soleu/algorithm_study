//package Samsung;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class Main {
//    public long solution(int n, int m, int d, int[][] place, int[] oil) {
//        long answer = 0;
//
//        for (int i = 0; i < d; i++) {
//            //일차마다 1cm씩 자라기
//            for (int l = 0; l < n; l++) {
//                for (int j = 0; j < m; j++) {
//                    place[l][j]++;
//                }
//            }
//            //최고 순위 일수만큼 뽑기
//            int sum = 0;
//            for (int j = 0; j < oil[i]; j++) {
//                long max = place[0][0];
//                int x = 0, y = 0;
//                for (int k = 0; k < n; k++) {
//                    for (int l = 0; l < m; l++) {
//                        if (place[k][l] > max) {
//                            max = place[k][l];
//                            x = k;
//                            y = l;
//                        }
//                    }
//                }
//                sum += max - 1;
//                place[x][y] = 1;
//            }
//            answer += (i + 1) * sum;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) throws IOException {
//        Main main = new Main();
////        Scanner scanner = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
////        int T = scanner.nextInt();
//        int n, m, d;
//        long[] answers = new long[T];
//        for (int t = 0; t < T; t++) {
////            n = scanner.nextInt();
////            m = scanner.nextInt();
////            d = scanner.nextInt();
//            String[] token = br.readLine().split(" ");
//            n = Integer.parseInt(token[0]);
//            m = Integer.parseInt(token[1]);
//            d = Integer.parseInt(token[2]);
//            int[][] place = new int[n][m];
//            int[] oil = new int[d];
//            for (int i = 0; i < n; i++) {
//                String[] token1 = br.readLine().split(" ");
//                for (int j = 0; j < token1.length; j++) {
//                    place[i][j] = Integer.parseInt(token1[j]);
//                }
//            }
//            String[] token2 = br.readLine().split(" ");
//            for (int i = 0; i < token2.length; i++) {
//                oil[i] = Integer.parseInt(token2[i]);
//            }
//            answers[t] = main.solution(n, m, d, place, oil);
//        }
//        for (int i = 0; i < T; i++) {
//            System.out.println("#" + (i + 1) + " " + answers[i]);
//        }
//    }
//}
