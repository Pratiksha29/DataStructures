package com.sadp.datastructurs;

import java.util.HashMap;
import java.util.Map;

public class RepeatingWordsApproach2 {
public static void main(String[] args) {
	String sample = "This is sapient.This is bangalore";
	Map<String,Integer> map = new HashMap<>();
	String[] words = sample.split(" ");
	for (String word : words) {
		if(map.containsKey(word)){
			map.put(word, map.get(word)+1);
		}
		else{
			map.put(word, 1);
		}
	}
	System.out.println(map);
}
}
