package main.java.programmers.jung.lv1.수박수박수박수박수박수;

// https://programmers.co.kr/learn/courses/30/lessons/12922
public class Solution {

	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}

    public static String solution(int n) {
    	StringBuffer buffer = new StringBuffer();
    	
    	for(int i = 1; i <= n; i++) {
    		buffer.append(i % 2 == 0 ? "박" : "수");
    	}
    	
        return buffer.toString();
    }
    
}
