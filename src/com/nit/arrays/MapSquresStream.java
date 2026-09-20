package com.nit.arrays;

import java.util.ArrayList;
import java.util.List;

public class MapSquresStream
{
   public static void main (String[]args)
   {
	   List<Integer> list = new ArrayList<Integer>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.stream().map(v -> v*v).forEach(System.out::println);
   }
}
