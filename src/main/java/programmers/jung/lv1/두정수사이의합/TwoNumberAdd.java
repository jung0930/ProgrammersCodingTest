package main.java.programmers.jung.lv1.두정수사이의합;


// https://programmers.co.kr/learn/courses/30/lessons/12912
public class TwoNumberAdd {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		solution(a, b);
	}    
	
	public static long solution(int a, int b) {
		if(a == b) return a;
		
		long answer = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(; min <= max; min++) {
			answer += min;
		}
		
		return answer;
    }
	
	
	/* 등차수열 이용
    public static long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
	 */

}
