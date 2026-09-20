package com.nit.arrays;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1
{

	public static void main(String[] args)
	{
         ArrayList<Integer> arrayList = new  ArrayList<Integer>();
         arrayList.add(10);
         arrayList.add(20);
         arrayList.add(30);
         arrayList.add(10);
         arrayList.add(30);
         arrayList.add(100);
         Set<Integer>set = arrayList.stream()
        		 .filter(num -> num%2==0).collect(Collectors.toSet());
         set.forEach(System.out::println);
	}

}
