package main.java.programmers.jung.lv1.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

// https://programmers.co.kr/learn/courses/30/lessons/12933
public class Solution {

	public static void main(String[] args) {
		long n = 8000000000L;
		solution(n);
		
		System.out.println(solution(n));
		
	}
	
    public static long solution(long n) {
    	String s = "" + n;
    	Long[] array = new Long[s.length()];
        int index = 0;
    	
    	while(true) {
    		array[index++] = n%10;
    		if(n < 10) break;
    		n = n/10;
    	}
    	
        Arrays.sort(array,Collections.reverseOrder());
    	
    	StringBuffer buffer = new StringBuffer();
        
    	for(long l : array) {
    		buffer.append(l);
    	}
        
        return Long.parseLong(buffer.toString());
    }
    
}
