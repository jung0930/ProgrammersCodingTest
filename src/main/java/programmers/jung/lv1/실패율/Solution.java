package main.java.programmers.jung.lv1.실패율;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,3,3};
		
		solution(N, stages);

	}

	
	public static int[] solution(int N, int[] stages) {
        
        int[] answer = new int[N];
        HashMap<Integer, Double> failmap = new HashMap<Integer, Double>();
        
        for(int i = 1; i <= N; i++) {
            int stage = i;
            int incompletePlayers = 0;
            int curretStageTotalPlayers = 0;
            
            for(int j = 0; j < stages.length; j++) {
                int player = stages[j];
            }
        }
        
        
        return answer;
    }
}
