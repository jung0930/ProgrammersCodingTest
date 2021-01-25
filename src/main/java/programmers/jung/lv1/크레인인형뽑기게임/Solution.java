package main.java.programmers.jung.lv1.크레인인형뽑기게임;

import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/64061
public class Solution {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		solution(board, moves);
		
		/*
		0	0	0	0	0
		0	0	1	0	3
		0	2	5	0	1
		4	2	4	4	2
		3	5	1	3	1
		*/
	}
	
	public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();	// 인형이 쌓일 바구니
		int count = 0;
        
		for(int move : moves) {
			for(int j = 0; j < board.length; j++) {
        		
				// 자리에 인형이 없을 경우
        		if(board[j][move-1] == 0) {
        			continue;
        		}
        		
        		if(!stack.isEmpty() && stack.peek() == board[j][move-1]) {
        			stack.pop();
        			board[j][move-1] = 0;
        			count+=2;
        			break;
        		}
        		
        		stack.push(board[j][move-1]);
        		board[j][move-1] = 0;
        		
        		break;
        		
        	}
		}
        
        return count;
    }
	
	/*
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
    */
	
}
