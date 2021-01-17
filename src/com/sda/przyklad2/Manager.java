package com.sda.przyklad2;

public class Manager extends Employee {

    private Employee[] employees;

    public Manager(String name, String surname, int age, int salary, Employee[] employees) {
        super(name, surname, age, salary);
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Mengerem, nazywam się "
                +getName()+" "
                +getSurname()
                +"i mam "
                +getAge()
                +" lat "+ " zarabiam: "+getSalary());

    }

}
