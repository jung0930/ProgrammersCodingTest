package main.java.programmers.jung.lv1.예산;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		solution(d, budget);
		
	}

	
    public static int solution(int[] d, int budget) {
        //answer는 예산을 지원해준 부서의 개수이다.
        int answer = 0;
        Arrays.sort(d); //오름차순

        for(int i=0; i<d.length; i++) { 
          //예산이 0이 되거나 지원해주려는 부서보다 작으면 종료한다.
          if(budget == 0 || budget < d[i]) {
              break;
          }
          budget -= d[i];
          answer++;
        }
        return answer;
        
        /*
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) break;

            answer++;
        }

        return answer;
        */
    }
    
    
}
