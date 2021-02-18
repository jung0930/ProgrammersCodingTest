package main.java.programmers.jung.lv1.최대공약수와최소공배수;

// https://programmers.co.kr/learn/courses/30/lessons/12940
public class Solution {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		solution(n, m);
	}

    public static int[] solution(int n, int m) { 
    	int[] answer = new int[2];
    	int max = n<m?m:n;
    	int min = n>m?m:n;
    	int a = 0;
    	int b = 0;
    	
    	for(int i = max; i > 0; i--) {
    		if(max%i == 0 && min%i ==0) {
    			a = i;
    			b = i * (max/i) * (min/i);
    			break;
    		}
    	}
        
    	answer[0] = a;
    	answer[1] = b;
    	
        return answer;
    }

    
    /* 재귀함수
    public static int[] solution(int a, int b) {
        int[] answer = new int[2];
        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

	public static int gcd(int p, int q) {
		if (q == 0) return p;
    	return gcd(q, p%q);
	}
    */
    
}
