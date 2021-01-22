package main.java.programmers.jung.lv1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12935
public class Solution {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		solution(arr);
	}

    public static Integer[] solution(int[] arr) {
    	
    	if(arr.length < 2) return new Integer[]{-1};
    	
    	List<Integer> list = new ArrayList<>();
        int arrLength = arr.length;
    	int min = arr[0];
        
        for(int i = 0; i < arrLength; i++) {
        	if(min > arr[i]) {
        		min = arr[i];
        	}
        	list.add(arr[i]);
        }
        
        while(list.contains(min)) {
        	int idx = list.indexOf(min);
            list.remove(idx);
        }
        
        return list.toArray(new Integer[list.size()]);
    }
	
}
