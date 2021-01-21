package main.java.programmers.jung.lv1.서울에서김서방찾기;

// https://programmers.co.kr/learn/courses/30/lessons/12919
public class Solution {

	public static void main(String[] args) {
		String[] seoul = {};
		solution(seoul);
	}

	public static String solution(String[] seoul) {
        String answer = "";
        int seoulLength = seoul.length;
        
        for(int i = 0; i < seoulLength; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "김서방은 " + i + "에 있다";
        		break;
        	}
        }
        
        return answer;
  }
	
}
