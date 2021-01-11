package main.java.programmers.jung.lv1.체육복;

import java.util.HashMap;

// https://programmers.co.kr/learn/courses/30/lessons/42862
public class ExersizeWear {

	public static void main(String[] args) {
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		System.out.println("@@@@@@solution : " + solution(5, lost, reserve));
		
	}

	
    public static int solution(int n, int[] lost, int[] reserve) {
    	int answer = 0;
    	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer> ();
    	
    	for(int i = 1; i <= n; i++) {
    		int count = 1;
    		
    		for(int j = 0; j < reserve.length; j++) {
    			if(i == reserve[j]) count++;
    		}
    		
    		hashMap.put(i, count);
    	}
    	
    	System.out.println("@@@@@@ hashMap1 : " + hashMap);
    	System.out.println("@@@@@@ " + hashMap.get(1));
    	System.out.println("@@@@@@ " + hashMap.get(2));
    	System.out.println("@@@@@@ " + hashMap.get(3));
    	System.out.println("@@@@@@ " + hashMap.get(4));
    	System.out.println("@@@@@@ " + hashMap.get(5));
    	
    	// 2 1 2 1 2
    	// lost : 2, 4
    	
    	for(int i = 0; i < lost.length; i++) {
    		int index = hashMap.get(lost[i]);
    		int preIndex = (hashMap.get(lost[i]) == 1) ? 1 : hashMap.get(lost[i]-1);
    		int nextIndex = (hashMap.get(lost[i]) == n) ? 1 : hashMap.get(lost[i]+1);
    		
    		System.out.println("@@@@@@ index : " + index);
    		System.out.println("@@@@@@ preIndex : " + preIndex);
    		System.out.println("@@@@@@ nextIndex : " + nextIndex);
    		
    		if(index == 1) {
    			if(preIndex != 1) {
    				hashMap.put(preIndex, 1);
    			}else if(nextIndex != 1) {
    				hashMap.put(nextIndex, 1);
    			}else {
    				hashMap.put(index, 0);
    			}
    		}else {
    			hashMap.put(index, 1);
    		}
    	}
    	
    	System.out.println("@@@@@@ hashMap2 : " + hashMap);
    	// 2 1 2 1 2
    	
        
        return answer;
    }
    
    
}
