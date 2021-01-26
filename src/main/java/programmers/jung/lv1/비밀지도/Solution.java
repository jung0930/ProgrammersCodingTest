package main.java.programmers.jung.lv1.비밀지도;

// https://programmers.co.kr/learn/courses/30/lessons/17681
public class Solution {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		solution(n, arr1, arr2);
	}

    public static String[] solution(int n, int[] arr1, int[] arr2) {
    	int[][] map1 = new int[n][n];
    	int[][] map2 = new int[n][n];
    	String[] answer = new String[n];
    	// int answerLength = answer.length;
    	
    	// map1
    	for(int i = 0; i < n; i++) {
    		int index = n-1;
    		int num = arr1[i];
    		
            if(num == 0) {
    			continue;
    		}
            
    		// 2진법셋팅
        	while(true) {
        		if(num == 1) {
        			map1[i][index] = 1;
        			break;
        		}
        		map1[i][index] = num%2;
        		num = num/2;
        		index--;
        	}
    	}

    	// map2
    	for(int i = 0; i < n; i++) { 
    		int index = n-1;
    		int num = arr2[i];
    		
            if(num == 0) {
    			continue;
    		}
            
    		// 2진법셋팅
        	while(true) {
        		if(num == 1) {
        			map2[i][index] = 1;
        			break;
        		}
        		map2[i][index] = num%2;
        		num = num/2;
        		index--;
        	}
    	}
    	
    	for(int i = 0; i < answer.length; i++) {
    		String s = "";
    		for(int j = 0; j < answer.length; j++) {
        		if(map1[i][j] == 0 && map2[i][j] == 0 ) {
        			s += " ";
        		}else {
        			s += "#";
        		}
        	}
    		answer[i] = s;
    	}
    	
        return answer;
    }
}
