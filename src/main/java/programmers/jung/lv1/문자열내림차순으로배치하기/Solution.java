package main.java.programmers.jung.lv1.문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12917
public class Solution {

	public static void main(String[] args) {
		String s = "zZzbcdefg";
		solution(s);
	}

    public static String solution(String s) {
    	
    	List<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
    	int listSize = list.size();
    	Collections.sort(list, Comparator.reverseOrder());
    	StringBuffer buffer = new StringBuffer("");
    	
    	for(int i = 0; i < listSize; i++) {
    		buffer.append(list.get(i));
    	}
    	
        return buffer.toString();
        
        /*
        char[] sol = str.toCharArray();
    	Arrays.sort(sol);
    	return new StringBuilder(new String(sol)).reverse().toString();
        */
    }
}
