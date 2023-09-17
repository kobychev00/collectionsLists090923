package com.example.collectionslists090923;

import java.util.*;

public class Task {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(77, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> strings = new ArrayList<>(List.of("hello", "hello", "u", "u", "man"));
        task3(strings);

    }

    // метод принимает коллекцию лист со значениями типа Integer
    // заадача – нечетные числы вывести в консоль
    public static void task1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    public static void task2(List<Integer> nums) {
        List<Integer> filteredNums = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 == 0) {
                filteredNums.add(i);
            }
        }
        Set<Integer>result = new TreeSet<>(filteredNums);
        System.out.println(result);
    }

    public static void task3(List<String> strings) {
        Set<String> uniqueStrings = new HashSet<>(strings);
        System.out.println(uniqueStrings);
    }
}
