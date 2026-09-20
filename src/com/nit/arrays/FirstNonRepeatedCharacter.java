package com.nit.arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Character result = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
        	if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
        scanner.close();
    }
}