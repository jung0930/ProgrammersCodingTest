package main.java.programmers.jung.lv1.이상한문자만들기;

// https://programmers.co.kr/learn/courses/30/lessons/12930
public class Solution {

	public static void main(String[] args) {
		String s = "try hello world";
		solution(s);
	}
	
    public static String solution(String s) {
    	
    	StringBuffer buffer = new StringBuffer ();
    	String[] array = s.split("");
    	int cnt = 0;
    	
    	for(String str : array) {
    		cnt = str.contains(" ") ? 0 : cnt + 1;
    		buffer.append(cnt%2 == 0 ? str.toLowerCase() : str.toUpperCase());
    	}
    	
    	return buffer.toString();
    	
        /* 내 풀이
        for(int i = 0; i < s.length(); i ++) {
        	char c = s.charAt(i);
        	String str = String.valueOf(c);
        	
        	if(c == ' ') {
        		index = 0;
        	}else {
            	if(index%2 == 0) { // 짝수
            		str = str.toUpperCase();
            	}else {
            		str = str.toLowerCase();
            	}
            	index++;
        	}
        	
        	strBuffer.append(str);
        }
        
        
        return strBuffer.toString();
        */
        
    }

}
