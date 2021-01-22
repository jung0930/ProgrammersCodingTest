package main.java.programmers.jung.lv1.핸드폰번호가리기;

// https://programmers.co.kr/learn/courses/30/lessons/12948
public class Solution {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		solution(phone_number);
	}
	
    public static String solution(String phone_number) {
    	StringBuffer buffer = new StringBuffer();
    	int length = phone_number.length();
    	
    	for(int i = 0; i < length-4; i++) {
    		buffer.append("*");
    	}
    	
    	buffer.append(phone_number.substring(length-4, length));
    	
        return buffer.toString();
        
        // 정규식
        // return phone_number.replaceAll(".(?=.{4})", "*");
    
        /* String -> char[] 로 변환
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
         */
    }
}
