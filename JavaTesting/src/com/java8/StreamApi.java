package com.java8;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class StreamApi {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
	list.stream().filter(p->p/2==0).collect(Collectors.toList());
      for(Integer a:list){
    	  System.out.println(a);
      }
}
}
