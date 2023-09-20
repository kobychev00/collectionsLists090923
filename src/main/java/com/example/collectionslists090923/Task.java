package com.example.collectionslists090923;

import com.example.collectionslists090923.model.Employee;

import java.util.*;

public class Task {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(77, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> strings = new ArrayList<>(List.of("hello", "hello", "u", "u", "man"));
        task3(strings);
        task4(strings);

        Employee employee1 = new Employee("Sidr", "Sidrov");
        Employee employee2 = new Employee("Kedr", "Kedrov");
        Employee employee3 = new Employee("Al", "Alov");

        Map<Integer, Employee> map1 = new HashMap<>();

        map1.put(77, employee1);
        map1.put(46, employee2);
        map1.put(43, employee3);

        System.out.println("hashmap" + map1);

        Map<Integer, Employee> map2 = new LinkedHashMap<>();
        Employee employee4 = new Employee("Sidr", "Sidrov");
        Employee employee5 = new Employee("Kedr", "Kedrov");
        Employee employee6 = new Employee("Al", "Alov");

        map2.put(55, employee4);
        map2.put(45, employee5);
        map2.put(75, employee6);

        System.out.println("linkedhashmap" + map2 );

        Map<Integer, Employee> map3 = new TreeMap<>(
                (x, y) -> x.compareTo(y) * -1
        );
        Employee employee7 = new Employee("Sidr", "Sidrov");
        Employee employee8 = new Employee("Kedr", "Kedrov");
        Employee employee9 = new Employee("Al", "Alov");

        map3.put(3, employee7);
        map3.put(8, employee8);
        map3.put(5, employee9);

        System.out.println("treemap" + map3 );
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

    public static void task4(List<String> strings) {
        //создаем мапу
        Map<String, Integer> countByWord = new HashMap<>();
        // проходимся циклом по листу, str - локал
        for (String str : strings) {
            // если нет элемента, кладем в мапу, присваем кол-во
            if (!countByWord.containsKey(str)) {
                countByWord.put(str, 1);
            } else {
                // если есть, кладем в мапу, увеличиваем кол-во
                countByWord.put(str, countByWord.get(str) + 1);
            }
        }
        for (Map.Entry<String, Integer> e : countByWord.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e);
            }
        }
    }
}
