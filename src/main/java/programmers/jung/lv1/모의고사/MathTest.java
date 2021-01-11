package main.java.programmers.jung.lv1.모의고사;

import java.util.ArrayList;

// https://programmers.co.kr/learn/courses/30/lessons/42840
public class MathTest {

	public static void main(String[] args) {
		int[] input = {1,3,2,4,2,1,3,2,4,2};
		solution(input);
	}

	
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int answersLength = answers.length;
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int person1Length = person1.length;
        int person2Length = person2.length;
        int person3Length = person3.length;
        
        int answer1=0, answer2 =0, answer3 =0;
        
        for(int i =0; i<answersLength; i++) {
            if(person1[i%person1Length] == answers[i]) answer1++;
            if(person2[i%person2Length] == answers[i]) answer2++;
            if(person3[i%person3Length] == answers[i]) answer3++;
        }
        
        int max = Math.max(Math.max(answer1, answer2),answer3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max==answer1) list.add(1);
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
        
        // return list.stream().mapToInt(i->i.intValue()).toArray();
        
    }
    
    
}
