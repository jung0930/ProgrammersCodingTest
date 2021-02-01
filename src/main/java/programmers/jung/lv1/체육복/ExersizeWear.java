package main.java.programmers.jung.lv1.체육복;

// https://programmers.co.kr/learn/courses/30/lessons/42862
public class ExersizeWear {

	public static void main(String[] args) {
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		System.out.println("@@@@@@solution : " + solution(5, lost, reserve));
		
	}

	
    public static int solution(int n, int[] lost, int[] reserve) {
    	int answer = 0;
    	int[] arr = new int[n];
    	
    	// 여분
    	for(int i : reserve) arr[i-1]++;
    	
    	// 도난
    	for(int i : lost) arr[i-1]--;
    	
    	for(int i = 0; i < n; i++) {
    		if(arr[i] == -1) {
    			if(i != 0 && arr[i-1] == 1) {
    				arr[i]++;
    				arr[i-1]--;
    			}else if(i+1 != n && arr[i+1] == 1) {
    				arr[i]++;
    				arr[i+1]--;
    			}
    		}
    	}
    	
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] < 0)) {
				answer++;
			}
		}	
	
		return answer;
    }
    
    /*
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    */
}
