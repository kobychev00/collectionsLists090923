package com.example.collectionslists090923.service;

import com.example.collectionslists090923.exception.EmployeeIsAlreadyAdded;
import com.example.collectionslists090923.exception.EmployeeIsNotFoundException;
import com.example.collectionslists090923.exception.EmployeeStorageIsFullException;
import com.example.collectionslists090923.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/*Объект Сервис Списка Сотрудников*/

@Service
public class EmployeeService {

    /*размер списков объектов типа Employee*/
    private final List<Employee> employees = new ArrayList<>();

    /*размер списка Employees*/
    private static final int MAX_SIZE = 2;

    /*добавить элемент в список employees*/
    public Employee add(String firstName, String lastName) {

        /*условие 1. Размер списка*/

        if (employees.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException("Массив сотрудников переполнен");
        }

        /*создание локального объекта addedEmployee типа Employee для метода add*/

        Employee addedEmployee = new Employee(firstName, lastName);

        /*условие 2. Повторное добавление*/

        if (employees.contains(addedEmployee)) {
            throw new EmployeeIsAlreadyAdded(String.format("Сотрудник %s уже добавлен", addedEmployee));
        }

        /* Добавление в список employee локального объекта метода add (list)*/

        employees.add(addedEmployee);

        /*Возвращаем локальный объект метода add*/

        return addedEmployee;
    }

    /*Убрать элемент из списка employees*/
    public Employee remove(String firstName, String lastName) {

        /*создание локального объекта removedEmployee типа Employee для метода remove*/

        Employee removedEmployee = new Employee(firstName, lastName);

        /*условие 1.Сотрудник не найден*/

        if (!employees.contains(removedEmployee)) {
                throw new EmployeeIsNotFoundException("Сотрудник %s не найден");
            }
        /* Удаление из списока employee локального объекта метода remove (list)*/

        employees.remove(removedEmployee);

        /*Возвращаем локальный объект метода remove*/
        return removedEmployee;
    }
    public Employee get(String firstName, String lastName) {
        Employee employeeToGet = new Employee(firstName, lastName);

        /*условие 1.Сотрудник не найден*/
        if (!employees.contains(employeeToGet)) {
            throw new EmployeeIsNotFoundException(String.format("Сотрудник %s не найден", employeeToGet));
        }

        Employee result = null;
        for (Employee employee : employees) {
            if (employee.equals(employeeToGet)) {
                return employee;
            }
        }
        return result;
    }

    public List<Employee> getAll() {
        return employees;
    }

    public int size () {
        return employees.size();
    }
}