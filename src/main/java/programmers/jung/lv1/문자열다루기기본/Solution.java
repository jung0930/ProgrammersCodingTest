package main.java.programmers.jung.lv1.문자열다루기기본;

// https://programmers.co.kr/learn/courses/30/lessons/12918
public class Solution {

	public static void main(String[] args) {
		String s = "a234";
		solution(s);
	}

	public static boolean solution(String s) {
        boolean answer = false;
        int strLength = s.length();
        
        if(strLength == 4 || strLength == 6){
            answer = true;
            
            for(int i = 0; i < strLength; i++){
               if(!Character.isDigit(s.charAt(i))){
                   answer = false;
                   break;
               }
            }
            
        }
        
        return answer;
        
        // return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
    }
	
}
