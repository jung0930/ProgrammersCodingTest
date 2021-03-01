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
		
		// 3. 마침표(.)가 2번 이상 연속되면 하나로 치환
		char prev = dq.poll();
		newDq.offer(prev);
			
		while (!dq.isEmpty()) {
			char ch = dq.poll();
			if (ch == '.' && ch == prev) {
				continue;
			} else {
				newDq.offer(ch);
			}
			prev = ch;
		}
		
		// 4. 마침표가 처음이나 끝에 위치한다면 제거
		if (newDq.size() == 1) {
			if (newDq.peekFirst() == '.') {
				newDq.pollFirst();
			}

		} else if (newDq.size() > 1) {
			if (newDq.peekFirst() == '.') {
				newDq.pollFirst();
			}
			if (newDq.peekLast() == '.') {
				newDq.pollLast();
			}
		}
		
        return answer;
    }
}
