package main.java.programmers.jung.lv1.신규아이디추천;

import java.util.Deque;
import java.util.LinkedList;

// https://programmers.co.kr/learn/courses/30/lessons/72410
public class Solution {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		solution(new_id);
	}

	
    public static String solution(String new_id) {
        String answer = "";
		Deque<Character> dq = new LinkedList<>();
		Deque<Character> newDq = new LinkedList<>();

		// 1. 모든 대문자를 소문자로 치환
		String str = new_id.toLowerCase();

		// 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z') {
				dq.offer(c);
			} else if ('0' <= c && c <= '9') {
				dq.offer(c);
			} else if (c == '-' || c == '_' || c == '.') {
				dq.offer(c);
			}
		}
        
        return answer;
    }
}
