package com.nit.arrays;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 25, 40);

       
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

      
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);

       
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);
    }
}

