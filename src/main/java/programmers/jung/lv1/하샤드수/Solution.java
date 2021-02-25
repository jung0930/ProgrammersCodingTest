package main.java.programmers.jung.lv1.하샤드수;

// https://programmers.co.kr/learn/courses/30/lessons/12947
public class Solution {

	public static void main(String[] args) {
		int x = 10;
		solution(x);
	}

	/*
	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	*/
    public static boolean solution(int x) {
    	int num = x;
    	int sum = 0;
    	
    	while(true) {
    		sum+=x%10;
            if(x<10) break;
            x=x/10;
    	}
    	
        return num%sum==0?true:false;
        
        
        /*
        int sum = 0;
	    for (String s : temp) {
	        sum += Integer.parseInt(s);
	    }
	
	    if (num % sum == 0) {
	            return true;
	    } else { 
	      return false;
	    }
    	*/
    }
}
