package com.test;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

	public static void main(String[] args) {

		Map<Integer, Integer>map = new HashMap<>();
		int []arr = {1,2,8,9,12,46,76,82,15,20,30};

		for(int i=1; i<=9; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]%i==0)
					count++;
			}
			map.put(i, count);
		}
		System.out.println(map);
	}

}
