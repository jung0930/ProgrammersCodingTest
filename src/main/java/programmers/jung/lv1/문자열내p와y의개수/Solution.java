package main.java.programmers.jung.lv1.문자열내p와y의개수;

// https://programmers.co.kr/learn/courses/30/lessons/12916
public class Solution {

	public static void main(String[] args) {
		String s = "pPoooyY";
		solution(s);
	}

    public static boolean solution(String s) {
    	
        String str = s.toUpperCase();
        int strLength = str.length();
        int count = 0;
        
        for(int i = 0; i < strLength; i++) {
        	if(str.charAt(i) == 'P') {
        		count++;
        	}else if(str.charAt(i) == 'Y') {
        		count--;
        	}
        }

        return count == 0;
    }
    
}
