package com.sda.przyklad2;

public class Main {
    public static void main(String[] args) {
        //Person person = new Employee("Jan", "Kowalski", 50);
        //person.describe();
        String[] strings = {"a", "b"};
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




        String[] strings1 = {"Hibernate", "Spring"};
        SeniorJavaDeveloper seniorJavaDeveloper1 = new SeniorJavaDeveloper("jan", "Buzek", 23, 2300, strings1, 5);
        JavaDeveloper javaDeveloper1 = new JavaDeveloper("marek", "marecki", 34, 3300,strings1);


        Employee[] employees2 ={person, manager, seniorJavaDeveloper1, javaDeveloper1};

        Manager manager2 = new Manager("Radek", "Buczek", 23, 4000, employees2);
        manager2.describe();
        for(Employee employee: manager2.getEmployees()){
           employee.describe();
        }

    }


}
