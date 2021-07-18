package com.string;
import java.util.HashMap;
import java.util.Map;
//value of convert int to Integer object
//convert Integer into int -Integer.intValue(9);

public class CountDuplicate {
	public static void main(String[] args) {
		 String s = "geeksforgeeks";
		 char[] c= s.toCharArray();
		 Map<Character, Integer>map=new HashMap<>();
		 for(char x:c){
			 if(map.containsKey(x))
					 map.put(Character.valueOf(x), map.get(Character.valueOf(x))+1);
			 else
				 map.put(Character.valueOf(x), 1);
			}
		 for(Map.Entry<Character, Integer> x:map.entrySet()){
			  if(x.getValue()>1){
				  System.out.println(x.getKey());
			  }
		  }
		 }
			

}
