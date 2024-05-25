package laba7.task1;

import java.io.Serializable;

public class Example7_Person implements Serializable {
    private String name;
    private int age;

    public Example7_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

