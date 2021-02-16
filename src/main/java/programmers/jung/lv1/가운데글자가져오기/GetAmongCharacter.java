package main.java.programmers.jung.lv1.가운데글자가져오기;


// https://programmers.co.kr/learn/courses/30/lessons/12903
public class GetAmongCharacter {

	public static void main(String[] args) {
		String s = "abcde";
		solution(s);
	}
	
	  public static String solution(String s) {
		  String answer = "";
		  int sLength = s.length();
		  
		  answer = sLength % 2 == 1?s.substring(sLength/2, sLength/2+1):s.substring(sLength/2-1, sLength/2+1);
		  
		  return answer;
	  }
	  
}
