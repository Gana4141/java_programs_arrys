package com.nit.arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class DublicateCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        
        for (char ch : input.toCharArray()) {

            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate characters:");

        boolean found = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(
                    entry.getKey() + " = " + entry.getValue() + " times"
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate characters found.");
        }

        scanner.close();
    }
}