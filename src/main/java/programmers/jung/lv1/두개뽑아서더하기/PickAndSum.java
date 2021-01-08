package main.java.programmers.jung.lv1.두개뽑아서더하기;

import java.util.TreeSet;

// https://programmers.co.kr/learn/courses/30/lessons/68644
public class PickAndSum {

	public static void main(String[] args) {
		int[] input = {2,1,3,4,1}; // 2,3,4,5,6,7
		// int[] input = {5,0,2,7}; // 2,5,7,9,12 
		solution(input);
	}
	
	public static int[] solution(int[] numbers) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		int numbersLength = numbers.length;
		
		for(int i = 0; i < numbersLength; i++) {
			for(int j = 0; j < numbersLength; j++) {
				if(i == j) continue;
				treeSet.add(numbers[i] + numbers[j]); 
			}
		}

		// case 1
		int[] answer = new int[treeSet.size()];
		int index = 0;
		
		for(Integer i : treeSet) {
			answer[index++] = i;
		}
		
		return answer;
		
		// case 2 stream 사용
//		return treeSet.stream().sorted().mapToInt(Integer::intValue).toArray();
//		return treeSet.stream().mapToInt(Integer::intValue).toArray();	// TreeSet의 경우 기본오름차순 정렬이기 때문에 sorted()가 필요없다.
    }
	
}
