package main.java.programmers.jung.lv1.완주하지못한선수;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42576
public class NotCompletePlayer {

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        solution(participant, completion);
    }
    
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int completionLength = completion.length;
        
        for(int i = 0; i < completionLength; i++) {
            String text = participant[i];
            
            if(!completion[i].equals(text)) {
                return text;
            }
        }
        
        return participant[participant.length-1];
    }
}

/*
class Solution {
    public String solution(String[] participant, String[] completion) {
    	String answer = "";
    	HashMap<String, Integer> hm = new HashMap<>();
    	
    	for(String value : participant) {
    		hm.put(value, hm.getOrDefault(value, 0) + 1);
    	}
    	for(String value : completion) {
    		hm.put(value, hm.get(value)-1);
    	}
    	
    	for(Entry<String, Integer> entry : hm.entrySet()) {
    		if(entry.getValue() != 0) {
    			answer = entry.getKey();
    			break;
    		}
    	}
    	
    	return answer;
    }
}
*/
