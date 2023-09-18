package com.example.collectionslists090923.model;

import java.util.Objects;

public class Employee {
    private final String firstName;

    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /*переопределение метода equals*/

    @Override
    public boolean equals(Object o) {
        /*условие 1 - равенство объектов, возращаем true*/
        if (this == o) {
            return true;
        }
        /*условие 2 - равенство классов и не null, возвращаем false */
        if (this == null || getClass() != o.getClass())
            return false;


        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
