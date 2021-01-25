package main.java.programmers.jung.lv1.x만큼간격이있는n개의숫자;

// https://programmers.co.kr/learn/courses/30/lessons/12954
public class Solution {

	public static void main(String[] args) {
		int x = 10000000;
		int n = 1000;
		
		solution(x, n);
	}
	
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
    
}
