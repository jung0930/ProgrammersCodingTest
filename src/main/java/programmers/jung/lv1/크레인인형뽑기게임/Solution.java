package main.java.programmers.jung.lv1.크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		solution(board, moves);
	}
	
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] == 0) {
                    continue;
                }
                if (stack.isEmpty()) {
                    stack.push(board[i][move - 1]);
                    board[i][move - 1] = 0;
                    break;
                }
                if (stack.peek() == board[i][move - 1]) {
                    // 바구니(stack)에 이미 들어있는 값과 지금 잡는 값이 같으면
                    stack.pop();
                    answer += 2;
                    board[i][move - 1] = 0;
                    break;
                } 
                // 바구니(stack) 에 들어있는 값과 지금 잡는 값이 다르면
                stack.push(board[i][move - 1]);
                board[i][move - 1] = 0;
                break;
            }
        }
        
        return answer;
    }
}
