package main.java.programmers.jung.lv1.모의고사;

import java.util.ArrayList;

// https://programmers.co.kr/learn/courses/30/lessons/42840
public class MathTest {

	public static void main(String[] args) {
		int[] input = {1,3,2,4,2,1,3,2,4,2};
		solution(input);
	}

	
    public static int[] solution(int[] answers) {
    	int[] answers1 = {1, 2, 3, 4, 5};
    	int[] answers2 = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] answers3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	int answers1Length = answers1.length;
    	int answers2Length = answers2.length;
    	int answers3Length = answers3.length;
    	int count1 = 0, count2 = 0, count3 = 0;
    	
    	int answersLength = answers.length;
    	
    	for(int i = 0; i < answersLength; i++) {
    		int num = answers[i];
    		if(answers1[i%answers1Length] == num) count1++;
    		if(answers2[i%answers2Length] == num) count2++;
    		if(answers3[i%answers3Length] == num) count3++;
    	}
    	
    	int max = Math.max(count1, Math.max(count2, count3));
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	if(max == count1) list.add(1);
    	if(max == count2) list.add(2);
    	if(max == count3) list.add(3);
    	
    	// return list.stream().mapToInt(i->i.intValue()).toArray();
    	
    	int[] answer = new int[list.size()];
    	int answerLength = answer.length;
    	
    	for(int i = 0; i < answerLength; i++) {
    		answer[i] = list.get(i);
    	}
    	
        return answer;
    }
    
    
}
