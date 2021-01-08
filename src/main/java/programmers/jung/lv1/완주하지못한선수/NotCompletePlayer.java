package main.java.programmers.jung.lv1.완주하지못한선수;

import java.util.HashMap;

// https://programmers.co.kr/learn/courses/30/lessons/42576
public class NotCompletePlayer {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		solution(participant, completion);
	}
	
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        
        return answer;
    }
}

/*
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) {
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        
        for (String player : completion) {
        	hm.put(player, hm.get(player) - 1);	
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}
*/