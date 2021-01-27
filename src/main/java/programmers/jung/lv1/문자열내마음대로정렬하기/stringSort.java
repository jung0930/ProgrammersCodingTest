package main.java.programmers.jung.lv1.문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://programmers.co.kr/learn/courses/30/lessons/12915
public class stringSort {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		solution(strings, n);

	}

	
	public static String[] solution(String[] strings, int n) {
		for(int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		
		Arrays.sort(strings);
		
		for(int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].substring(1);
		}
		
		return strings;
	}
}
