package main.java.programmers.jung.lv1.자릿수더하기;

// https://programmers.co.kr/learn/courses/30/lessons/12931
public class Solution {

	public static void main(String[] args) {
		int n = 987;
		System.out.println(solution(n));
		// solution(n);
	}
	
    public static int solution(int n) {
    	int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10) break;

            n=n/10;
        }
        
        return answer;
    	
    	/* 내 풀이 비효율적인 코드임
        int answer = 0;
        
        String[] arr = Integer.toString(n).split("");
        
        for(String s : arr) {
        	answer += Integer.parseInt(s);
        }
        
        return answer;
        */
    }
    
}
