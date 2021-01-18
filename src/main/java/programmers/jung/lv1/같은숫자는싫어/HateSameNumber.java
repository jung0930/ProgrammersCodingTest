package main.java.programmers.jung.lv1.같은숫자는싫어;

import java.util.ArrayList;

// https://programmers.co.kr/learn/courses/30/lessons/12906
public class HateSameNumber {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		solution(arr);
	}
	
	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer> ();
		int preNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				list.add(arr[i]);
				preNum = arr[i];
				continue;
			}else if(i == arr.length) {
				break;
			}
			
			if(preNum != arr[i]) {
				list.add(arr[i]);
				preNum = arr[i];
			}
			
		}
		
		int[] answers = new int[list.size()];
		int index = 0;
		
		for(Integer i : list) {
			answers[index++] = i;
		}
		
		return answers;
	}

}
