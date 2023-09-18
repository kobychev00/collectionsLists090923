package com.example.collectionslists090923.service;

import com.example.collectionslists090923.exception.EmployeeIsAlreadyAdded;
import com.example.collectionslists090923.exception.EmployeeIsNotFoundException;
import com.example.collectionslists090923.exception.EmployeeStorageIsFullException;
import com.example.collectionslists090923.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

/*Объект Сервис Списка Сотрудников*/

@Service
public class EmployeeService {

    /*размер списков объектов типа Employee*/
    private final Map<String, Employee> employees = new HashMap<>();

    /*размер списка Employees*/
    private static final int MAX_SIZE = 2;

    /*добавить элемент в список employees*/
    public Employee add(String firstName, String lastName) {

        /*условие 1. Размер списка*/

        if (employees.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException("Массив сотрудников переполнен");
        }

        String key = getKey(firstName, lastName);

        Employee addedEmployee = new Employee(firstName, lastName);

        if (employees.containsKey(key)) {
            throw new EmployeeIsAlreadyAdded("Сотрудник уже добавлен");
        }

        employees.put(key, addedEmployee);

        return addedEmployee;
    }

    /*Убрать элемент из списка employees*/
    public Employee remove(String firstName, String lastName) {
//
//        /*создание локального объекта removedEmployee типа Employee для метода remove*/
//
//        Employee removedEmployee = new Employee(firstName, lastName);
//
//        /*условие 1.Сотрудник не найден*/
//
//        if (!employees.contains(removedEmployee)) {
//                throw new EmployeeIsNotFoundException("Сотрудник %s не найден");
//            }
//        /* Удаление из списока employee локального объекта метода remove (list)*/
//
//        employees.remove(removedEmployee);
//
//        /*Возвращаем локальный объект метода remove*/
//        return removedEmployee;
        return null;
    }
    public Employee get(String firstName, String lastName) {
//        Employee employeeToGet = new Employee(firstName, lastName);
//
//        /*условие 1.Сотрудник не найден*/
//        if (!employees.contains(employeeToGet)) {
//            throw new EmployeeIsNotFoundException(String.format("Сотрудник %s не найден", employeeToGet));
//        }
//
//        /*Создаем переменную result типа Emmployee и присваиваем ей значение null*/
//
//        Employee result = null;
//
//        /*Цикл for-each, проходимся по каждому элементу коллекции list*/
//
//        for (Employee employee : employees) {
//
//            /* если элемент коллекции равен локальному объекту возвращаем локальный объект метода*/
//
//            if (employee.equals(employeeToGet)) {
//                return employee;
//            }
//        }
//
//        /*задать вопрос в gpt и mattermost*/
//
//        return result;

        return null;
    }

    /*метод типа list, который возвращает все элементы list*/
    public Collection<Employee> getAll() {
        return employees.values();
    }

    private String getKey(String firstName, String lastName) {
        return firstName + lastName;
    }
}