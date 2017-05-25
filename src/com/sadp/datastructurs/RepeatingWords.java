package com.sadp.datastructurs;

import java.util.HashMap;
import java.util.Map;

//to get the repeated words in a given string using Hashmaps
public class RepeatingWords {

	public static void main(String[] args) {
		String sample = "This is sapient.This is bangalore";
		Map<String,Integer> map = new HashMap<>();
		String[] words = sample.split(" ");
		for (String word : words) {
			if(map.put(word, 1)!=null){
				map.put(word, map.get(word)+1);
			}
		}
		System.out.println(map);
	}

}
