package main.java.programmers.jung.lv1.내적;

// https://programmers.co.kr/learn/courses/30/lessons/70128?language=java
public class Solution {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = {-3, -1, 0, 2};
		solution(a, b);
	}

    public static int solution(int[] a, int[] b) {
    	int answer = 0;
    	int aLength = a.length;
    	
    	for(int i = 0; i < aLength; i++) {
    		answer += a[i] * b[i];
    	}
        
        return answer;
    }
    
}
