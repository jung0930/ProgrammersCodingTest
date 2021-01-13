package main.java.programmers.jung.lv1.K번째수;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42748
public class KNumber {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
    	
    	for(int i = 0; i < commands.length; i++) {
    		
    		int arrMax = commands[i][1];
    		int arrMin = commands[i][0]-1;
    		
    		int arr[] = new int [arrMax - arrMin];
    		
    		int arrIndex = 0;
    		
    		for(int j = arrMin; j < arrMax; j++) {
    			arr[arrIndex] = array[j];
    			arrIndex++;
    		}
    		
    		Arrays.sort(arr);
    		
    		answer[i] = arr[commands[i][2]-1];
    		
    	}
        
        return answer;
    }
	
	

}
