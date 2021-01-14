package main.java.programmers.jung.lv1.가운데글자가져오기;


// https://programmers.co.kr/learn/courses/30/lessons/12903
public class GetAmongCharacter {

	public static void main(String[] args) {
		String s = "abcde";
		solution(s);
	}
	
	  public static String solution(String s) {
	      
	      String answer = ""; 
	      int i = s.length()/2;
	      int j = s.length()%2;
	      
	      if(j==0){
	          answer = "" + s.charAt(i-1) + s.charAt(i);
	      }else{
	          answer = "" + s.charAt(i);
	      }
	      
	      return answer;
	  }

}
