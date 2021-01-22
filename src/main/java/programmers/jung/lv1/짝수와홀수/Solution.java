package main.java.programmers.jung.lv1.짝수와홀수;

// https://programmers.co.kr/learn/courses/30/lessons/12937
public class Solution {

	public static void main(String[] args) {
		int num = 3;
		solution(num);
	}

    public static String solution(int num) {
    	return num%2==0?"Even":"Odd";
    }
}
