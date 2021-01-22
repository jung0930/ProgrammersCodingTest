package main.java.programmers.jung.lv1.삼진법뒤집기;

// https://programmers.co.kr/learn/courses/30/lessons/68935
public class Solution {

	public static void main(String[] args) {
		int n = 45;
		solution(n);
	}

    public static int solution(int n) {
    	int answer = 0;
    	int num = n;
    	String str = "";
    	
    	while(num != 1) {
    		str += num%3;
    		num = num/3;
    		if(num == 1) {
    			str += 1;
    		}
    	}
    	
    	String[] arr = str.split("");
    	int arrLength = arr.length;
    	
    	for(String s : arr) {
    		answer += (int)Math.pow(Integer.parseInt(s) * 3, arrLength-1) ;
    		arrLength--;
    	}
    	
        return answer;
    }
}
