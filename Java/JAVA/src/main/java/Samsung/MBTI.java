//package Samsung;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.LinkedList;
//
//class Person {
//    String mbti;
//    int cost;
//
//    public Person(String mbti, int cost) {
//        this.mbti = mbti;
//        this.cost = cost;
//    }
//}
//
//public class MBTI {
//    static Person[] people;
////    //    static char[] type = {'E', 'N', 'T', 'P', 'J', 'I', 'F', 'S'};
////    static boolean[] visit = new boolean[16];
////
////    public int bfs(int n, Person[] people) {
////        int total = 0;
////        LinkedList<Person> queue = new LinkedList<>();
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
////        // 모든 원소 넣기
////        for (int i = 0; i < 16; i++) {
//////            if (queue.contains(people[i])) continue;
////            queue.offer(people[i]);
////            String[] temp = people[i].mbti.split("");
////            total += people[i].cost;
////            for (int j = 0; j < temp.length; j++) {
////                hashMap.put(temp[j].charAt(0), hashMap.getOrDefault(temp[j].charAt(0), 0) + 1);
////            }
////        }
////
////        while (!queue.isEmpty()) {
////            // 원소 빼기
////            Person person = queue.poll();
////            String[] temp = person.mbti.split("");
////            for (int j = 0; j < temp.length; j++) {
////                hashMap.put(temp[j].charAt(0), hashMap.getOrDefault(temp[j].charAt(0), 0) - 1);
////            }
////            //check
////            for (int value : hashMap.values()) {
////                // 비교하기
////                if (value > n) return total -= person.cost;
////            }
////        }
////        //통과 한 경우
////    }
//
//}
//
//    public int solution(int n, int[] subjects) {
//        int answer = 0;
//        String[] mbti = {"ENFJ", "ENFP", "ENTJ", "ENTP", "ESFJ", "ESFP", "ESTJ", "ESTP", "INFJ", "INFP", "INTJ", "INTP", "ISFJ", "ISFP", "ISTJ", "ISTP"};
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
//        people = new Person[16];
//        for (int i = 0; i < 16; i++) {
//            people[i].mbti = mbti[i];
//            people[i].cost = subjects[i];
//        }
//
//        for
//
//
//
////        bfs(n, people);
//
//        return answer;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        MBTI mbti = new MBTI();
//        int T = Integer.parseInt(br.readLine());
//        int n = Integer.parseInt(br.readLine()); //cost
//        int[] subjects = new int[16];
//        for (int i = 0; i < T; i++) {
//            String[] temp = br.readLine().split(" ");
//            for (int j = 0; j < temp.length; j++) {
//                subjects[j] = Integer.parseInt(temp[i]);
//            }
//            mbti.solution(n, subjects);
//        }
//    }
//}
