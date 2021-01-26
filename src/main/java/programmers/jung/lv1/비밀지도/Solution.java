package main.java.programmers.jung.lv1.비밀지도;

// https://programmers.co.kr/learn/courses/30/lessons/17681
public class Solution {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		solution(n, arr1, arr2);
	}

    public static String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] map1 = new String[n];
    	String[] map2 = new String[n];
    	String[] answer = new String[n];
    	
    	// map1
    	for(int i = 0; i < n; i++) {
    		map1[i] = Integer.toBinaryString(arr1[i]);
    	}

    	// map2
    	for(int i = 0; i < n; i++) {
    		map2[i] = Integer.toBinaryString(arr2[i]);
    	}
    	
    	for(int i = 0; i < n; i++) {
    		StringBuffer buffer = new StringBuffer();
    		
    		char[] char1 = String.format("%"+n+"s", map1[i]).toCharArray();
    		char[] char2 = String.format("%"+n+"s", map2[i]).toCharArray();
    		
    		for(int j = 0; j < n; j++) {
        		if((char1[j] == '0'||char1[j] == ' ') && (char2[j] == '0'||char2[j] == ' ')  ) {
        			buffer.append(" ");
        		}else {
        			buffer.append("#");
        		}
    		}
    		
    		answer[i] = buffer.toString();
    	}
    	
        return answer;
    }
}
