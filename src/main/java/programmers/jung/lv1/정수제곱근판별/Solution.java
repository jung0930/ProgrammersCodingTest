package main.java.programmers.jung.lv1.정수제곱근판별;

// https://programmers.co.kr/learn/courses/30/lessons/12934?language=java
public class Solution {

	public static void main(String[] args) {
		long n = 121L;
		solution(n);
	}
	
    public static long solution(long n) {
        for(long i = 1; i <= n; i ++) {
        	if(i * i == n) {
        		return (i + 1) * (i + 1);
        	}
        }
        return -1;
    }

}
