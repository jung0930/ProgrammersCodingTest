package main.java.programmers.jung.lv1.행렬의덧셈;

// https://programmers.co.kr/learn/courses/30/lessons/12950
public class Solution {

	public static void main(String[] args) {
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		solution(arr1, arr2);
	}
	
    public static int[][] solution(int[][] arr1, int[][] arr2) {
    	int xLength = arr1.length;
    	int yLength = arr1[0].length;
    	
    	int[][] answer = new int[xLength][yLength];
    	
    	for(int i = 0; i < xLength; i++) {
    		for(int j = 0; j < yLength; j++) {
    			answer[i][j] = arr1[i][j] + arr2[i][j];
    		}
    	}
    	
        return answer;
        
        /*
        int row = Math.max(arr1.length, arr2.length);
        int col = Math.max(arr1[0].length, arr2[0].length);
        int[][] answer = new int[row][col];
        for(int i=0; i<row ; i++){
          for(int j=0; j<col; j++){
            answer[i][j] = arr1[i][j] + arr2[i][j];
          }
        }

        return answer;
        */
    }
}
