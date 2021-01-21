package main.java.programmers.jung.lv1.자연수뒤집어배열로만들기;

// https://programmers.co.kr/learn/courses/30/lessons/12932
public class Solution {

	public static void main(String[] args) {
		long n = 12345;
		solution(n);
	}

    public static int[] solution(long n) {
    	String s = "" + n;
    	int[] answer = new int[s.length()];
        int index = 0;
    	
        while(true) {
        	answer[index++] = (int)(n%10);
            if(n<10) break;
            n=n/10;
        }
        
        return answer;
    }
}
