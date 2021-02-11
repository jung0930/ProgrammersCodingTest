package main.java.programmers.jung.lv1.가운데글자가져오기;


// https://programmers.co.kr/learn/courses/30/lessons/12903
public class GetAmongCharacter {

	public static void main(String[] args) {
		String s = "abcde";
		solution(s);
	}
	
	  public static String solution(String s) {
		  int sLength = s.length();
		  String answer = "";
		  
		  if(sLength % 2 == 0) { // 짝수
			  answer = s.substring(sLength/2-1, sLength/2+1);
		  }else { // 홀수
			  answer = s.substring(sLength/2, sLength/2+1);
		  }
		  
		  return answer;
		  
		  // return word.substring((word.length()-1) / 2, word.length()/2 + 1); 
	  }
	  
}
