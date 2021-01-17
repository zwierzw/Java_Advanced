package com.sda.przyklad2;

public class Main {
    public static void main(String[] args) {
        //Person person = new Employee("Jan", "Kowalski", 50);
        //person.describe();
        String [] strings = {"a","b"};
        Employee person = new JavaDeveloper("Jan",
                "Kowalski",
                50,
                20,
                strings);

        Employee[] employees = {person};
        Employee manager = new Manager("Jan",
                "Kowalski",
                50,
                20,
                null);
        manager.describe();
    }
}
