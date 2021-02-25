package main.java.programmers.jung.lv1.이천십육년;

// https://programmers.co.kr/learn/courses/30/lessons/12901
public class Solution {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		solution(a,b);
	}
	
	public static String solution(int a, int b) {
        String answer = " ";
        int[] monthDay={31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i < a; i++) {
            b+=monthDay[i-1];
        }
        switch(b%7){
        case 3:answer="SUN";break;
        case 4:answer="MON";break;
        case 5:answer="TUE";break;
        case 6:answer="WED";break;
        case 0:answer="THU";break;
        case 1:answer="FRI";break;
        case 2:answer="SAT";break;
        }
 
        return answer;
    }

}
