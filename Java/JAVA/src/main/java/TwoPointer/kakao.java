package TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class kakao {
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, String> user = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] tempArr = record[i].split("");
            if (tempArr[0].equals("Enter")) {
                user.put(tempArr[1], tempArr[2]);
            } else if (tempArr[0].equals("Leave")) {
                String name = user.get(tempArr[1]);
                if (name != null){
                    arr.add(name+"님이 나갔습니다.");
                }
            } else { //change
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        kakao k = new kakao();
        String[] arr = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(k.solution(arr));
    }
}
