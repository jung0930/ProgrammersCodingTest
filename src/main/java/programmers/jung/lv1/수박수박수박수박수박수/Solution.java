package main.java.programmers.jung.lv1.수박수박수박수박수박수;

// https://programmers.co.kr/learn/courses/30/lessons/12922
public class Solution {

	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}

    public static String solution(int n) {
        StringBuffer strBuffer = new StringBuffer();
        
        if(n == 1) return "수";
        
        for(int i = 0; i < n/2; i++) {
        	strBuffer.append("수박");
        }
        
        if(n%2 == 1) strBuffer.append("수");
        
        return strBuffer.toString();
    }
    
    /*
	for (int i = 0; i < n; i++)
      result += i % 2 == 0 ? "수" : "박";
        return result;
    }
    */
}
