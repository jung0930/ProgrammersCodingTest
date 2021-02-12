package main.java.programmers.jung.lv1.콜라츠추측;

// https://programmers.co.kr/learn/courses/30/lessons/12943
public class Solution {

	public static void main(String[] args) {
		int num = 626331;
		solution(num);
	}
	
    public static int solution(long num) {
    	int count = 0;
    	if(num==1) return 0;
    	
    	while(num != 1) {
    		if(count == 500) {
    			return -1;
    		}
    		
        	if(num%2 == 0) {
        		num = num/2;
            }else {
        		num = num*3+1;
            }
        	
        	count++;
    	}
    	
    	return count;
    	
    	/*
    	long n = (long)num;
	    for(int i =0; i<500; i++){      
	      if(n==1) return i;
	      n = (n%2==0) ? n/2 : n*3+1;            
	    }
	    return -1;
    	*/
    }
}
