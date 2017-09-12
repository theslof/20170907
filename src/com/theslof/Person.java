package com.theslof;

public class Person {
    private String name;
    private int age;
    private String profession;
    private double bankBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        return "[" + getName() + ", " + getAge() + ", " + getProfession() + ", " + (long)getBankBalance() + "]";
    }
}
