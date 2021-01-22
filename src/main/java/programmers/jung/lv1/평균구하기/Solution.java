package main.java.programmers.jung.lv1.평균구하기;

// https://programmers.co.kr/learn/courses/30/lessons/12944
public class Solution {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		solution(arr);
	}

    public static double solution(int[] arr) {
        int sum = 0;
        int arrLength = arr.length;
        
        for(int i : arr) {
        	sum += i;
        }
        
        return (double)sum/arrLength;
    }
}
