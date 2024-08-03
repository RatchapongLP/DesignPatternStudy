package com.satsumaimo.bean;

public class Person {
    protected int id;
    protected String name;
    protected Gender gender;
    protected int age;
    protected Mbti mbti;

    protected Person(int id, String name, Gender gender, int age, Mbti mbti) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mbti = mbti;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mbti getMbti() {
        return mbti;
    }

    public void setMbti(Mbti mbti) {
        this.mbti = mbti;
    }

    @Override
    public String toString() {
        return "Person {" +
                "\n\tid = " + id +
                ",\n\tname = '" + name + '\'' +
                ",\n\tgender = " + gender +
                ",\n\tage = " + age +
                ",\n\tmbti = " + mbti +
                "\n}";
    }
}
