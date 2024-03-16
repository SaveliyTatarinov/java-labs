package laba2.Example8;

public class Animal {
    private String name;
    private int age;
    private boolean wild;

    public Animal(String name, int age, boolean wild) {
        this.name = name;
        this.age = age;
        this.wild = wild;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWild() {
        return wild;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public void makeSound(){
        System.out.println("Животное издает звуки");
    }
}