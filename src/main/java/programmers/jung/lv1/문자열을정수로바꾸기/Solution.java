package main.java.programmers.jung.lv1.문자열을정수로바꾸기;

// https://programmers.co.kr/learn/courses/30/lessons/12925
public class Solution {

	public static void main(String[] args) {
		String s = "-1234";
		solution(s);
	}

	public static int solution(String s) {
        int answer = Integer.parseInt(s);
        
        return answer;
	}
}
