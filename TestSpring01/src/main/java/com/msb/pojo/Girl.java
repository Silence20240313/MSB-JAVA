package com.msb.pojo;

public class Girl {
    private int age;
    private String name;
    private Boy boyfriend;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boy getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(Boy boyfriend) {
        this.boyfriend = boyfriend;
    }

    public Girl() {
    }

    public Girl(int age, String name, Boy boyfriend) {
        this.age = age;
        this.name = name;
        this.boyfriend = boyfriend;
    }
}
