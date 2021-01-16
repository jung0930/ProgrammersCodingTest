package main.java.programmers.jung.lv1.두정수사이의합;


// https://programmers.co.kr/learn/courses/30/lessons/12912
public class TwoNumberAdd {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		solution(a, b);
	}    
	
	public static long solution(int a, int b) {
		long answer = 0;
        
        int minNum = 0;
        int maxNum = 0;
        
        if(a > b) {
        	maxNum = a;
        	minNum = b;
        }else if(a < b) {
        	maxNum = b;
        	minNum = a;
        }else {
        	return a;
        }
        
        for(int i = minNum; i < maxNum+1; i++) {
        	answer = answer + i;
        }
        
        return answer;
    }

}
