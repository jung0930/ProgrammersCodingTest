package main.java.programmers.jung.lv1.직사각형별찍기;

import java.util.Scanner;

// https://programmers.co.kr/learn/courses/30/lessons/12969
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 1; i <= b; i++ ) {
            for(int j = 1; j <= a; j++ ) {
            	System.out.print("*");
            }
            System.out.println();
        }
        
	}
	
}
