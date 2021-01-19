package main.java.programmers.jung.lv1.문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Collections;

// https://programmers.co.kr/learn/courses/30/lessons/12915
public class stringSort {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		solution(strings, n);

	}

	
	public static String[] solution(String[] strings, int n) {
		int stringsLength = strings.length;
		ArrayList<String> list = new ArrayList<String> ();
		
		for(int i = 0; i < stringsLength; i++) {
			list.add("" +strings[i].substring(n, n+1) + strings[i]);
		}
		
		Collections.sort(list);
		int listSize = list.size();
		String[] answers = new String[listSize];
		
		for(int i = 0; i < listSize; i++) {
			answers[i] = list.get(i).substring(1);
		}
		
		return answers;
	}
}
