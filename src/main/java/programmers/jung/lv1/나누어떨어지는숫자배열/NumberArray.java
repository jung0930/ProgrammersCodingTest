package main.java.programmers.jung.lv1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12910
public class NumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub [5, 9, 7, 10]	5
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		solution(arr, divisor);

	}
	
	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) a1.add(arr[i]);
        }
        
        if(a1.isEmpty()) {
            a1.add(-1);
        }
        
        answer = new int[a1.size()];
        
        for(int i=0; i<a1.size(); i++) {
            answer[i] = a1.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
        
        // stream 풀이
        // return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); 
	}
    
}
