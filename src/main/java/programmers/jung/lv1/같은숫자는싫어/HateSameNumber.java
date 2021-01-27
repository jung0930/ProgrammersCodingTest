package main.java.programmers.jung.lv1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12906
public class HateSameNumber {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		solution(arr);
	}
	
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] != arr[i]) {
				list.add(arr[i]);
			}
		}
		
		int[] answers = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answers[i] = list.get(i);
		}
		
		return answers;
	}

}
