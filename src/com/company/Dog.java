package com.company;

public class Dog {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Dog(String new_name, int new_age)
    {
        this.name = new_name;
        this.age = new_age;
    }

    public int ageDogToHuman()
    {
        return this.age*7;
    }

    @Override
    public String toString() {
        return "Meet " + this.name + "! It's " + this.age + " years old, in human years it would be " + ageDogToHuman();
    }
}
