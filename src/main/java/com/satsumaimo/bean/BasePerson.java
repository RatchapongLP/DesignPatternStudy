package com.satsumaimo.bean;

import lombok.Data;

@Data
public abstract class BasePerson implements Person {
    protected static int instanceCreated = 1;
    protected int id;
    protected String name;
    protected Gender gender;
    protected int age;
    protected Mbti mbti;
}
