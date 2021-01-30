package main.java.programmers.jung.lv1.다트게임;

// https://programmers.co.kr/learn/courses/30/lessons/17682
public class Solution {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		
		solution(dartResult);
	}
	
    public static int solution(String dartResult) {

        char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;
 
        for(int i = 0; i < darts.length; i++) {
            if(darts[i] >= '0' && darts[i] <= '9') {
                cnt++;
                if(darts[i] == '1' && darts[i+1] == '0') {
                    score[cnt] = 10;
                    i++;
                } else {
                    score[cnt] = darts[i] - '0';
                }
            } else if(darts[i] == 'D') {
                score[cnt] *= score[cnt];
            } else if(darts[i] == 'T') {
                score[cnt] *= score[cnt] * score[cnt];
            } else if(darts[i] == '*') {
                if(cnt > 0) {
                    score[cnt-1] *= 2;
                }
                score[cnt] *= 2;
            } else if(darts[i] == '#') {
                score[cnt] *= -1;
            }
        }
        
        return score[0] + score[1] + score[2];
    }
    
    
    /*
    public int solution(String dartResult) {
        String[] arrTemp = dartResult.split("");
          String sTarget = "";
          int nBeforeScore = 0;
          int nPresentScore = 0;
          int nTotalScore = 0;
          for (int i = 0; i < arrTemp.length; i++) {
              if(arrTemp[i].equals("1") || arrTemp[i].equals("2") || arrTemp[i].equals("3") || arrTemp[i].equals("4") || arrTemp[i].equals("5") ||
                      arrTemp[i].equals("6") || arrTemp[i].equals("7")|| arrTemp[i].equals("8") || arrTemp[i].equals("9") || arrTemp[i].equals("0")) {
                  sTarget += arrTemp[i];
              }else if(arrTemp[i].equals("S") || arrTemp[i].equals("D") || arrTemp[i].equals("T")){
                  nTotalScore += nBeforeScore;
                  nBeforeScore = nPresentScore;
                  nPresentScore = Integer.parseInt(sTarget);
                  sTarget = "";
                  if(arrTemp[i].equals("D")) {
                      nPresentScore = (int) Math.pow(nPresentScore, 2);
                  }else if(arrTemp[i].equals("T")) {
                      nPresentScore = (int) Math.pow(nPresentScore, 3);
                  }
              }else if(arrTemp[i].equals("*") || arrTemp[i].equals("#")){
                  if(arrTemp[i].equals("*")) {
                      nBeforeScore = nBeforeScore * 2;
                      nPresentScore = nPresentScore * 2;
                  }else if(arrTemp[i].equals("#")) {
                      nPresentScore = nPresentScore * -1;
                  }
              }
          }
          nTotalScore += nBeforeScore;
          nTotalScore += nPresentScore;

          return nTotalScore;
    }
    */
    
    

}
