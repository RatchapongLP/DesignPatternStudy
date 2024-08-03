package com.satsumaimo.creator;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.bean.Person;

public class SingletonPerson extends Person {
    private static int instanceCreated = 1;
    private SingletonPerson() {
        super(instanceCreated, "Shiraishi Kuranosuke", Gender.MALE, 21, Mbti.ENFJ);
        System.out.println("SingletonPerson: created an instance #" + instanceCreated++);
    }


    // Best solution
    public static SingletonPerson getInstance() {
        return InnerClass.PROJECT_MANAGER;
    }

    private static class InnerClass {
        private static final SingletonPerson PROJECT_MANAGER = new SingletonPerson();
    }


    // Efficient but hard to develop
    /*private static volatile SingletonPerson PROJECT_MANAGER;

    public static SingletonPerson getInstance() {
        if (PROJECT_MANAGER == null) {
            synchronized (SingletonPerson.class) {
                if (PROJECT_MANAGER == null) PROJECT_MANAGER = new SingletonPerson();
            }
        }
        return PROJECT_MANAGER;
    }*/
}
