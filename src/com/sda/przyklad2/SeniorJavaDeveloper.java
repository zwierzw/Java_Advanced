package com.sda.przyklad2;

public class SeniorJavaDeveloper extends JavaDeveloper {

    private int yearsOfExperience;

    public SeniorJavaDeveloper(String name, String surname, int age, int salary, String[] knownTechnologies, int yearsOfExperience) {
        super(name, surname, age, salary, knownTechnologies);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Senior Java Developerem, nazywam się" + getName() + getSurname());
    }
}
