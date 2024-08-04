package com.satsumaimo.creational;

import com.satsumaimo.bean.BasePerson;
import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.bean.SimplePerson;

public class SingletonPerson extends BasePerson {
    private SingletonPerson() {
        this.id = instanceCreated;
        this.name = "Shiraishi Kuranosuke";
        this.gender = Gender.MALE;
        this.age = 21;
        this.mbti = Mbti.ENFJ;
        System.out.println("SingletonPerson: created an instance #" + instanceCreated++);
    }


    // Best solution, lazy with no concurrency problem
    public static SingletonPerson getInstance() {
        return InnerClass.ADAM;
    }

    private static class InnerClass { // This class will get loaded only when it is called for, not when the outer class is loaded
        private static final SingletonPerson ADAM = new SingletonPerson();
    }


    // Lazy Instantiation with concurrency problem handled, Efficient but hard to develop
     /*private static volatile SingletonPerson ADAM;

    public static SingletonPerson getInstance() {
        if (ADAM == null) {
            synchronized (SingletonPerson.class) {
                if (ADAM == null) ADAM = new SingletonPerson();
            }
        }
        return ADAM;
    }*/


    // Eager Instantiation, not so efficient
/*    private static SingletonPerson ADAM = new SingletonPerson();

    public static SingletonPerson getInstance() {
        return ADAM;
    }*/


    // Classic lazy Instantiation, with concurrent problems
/*    private static SingletonPerson ADAM;

    public static SingletonPerson getInstance() {
        if (ADAM == null) {
            ADAM = new SingletonPerson();
        }
        return ADAM;
    }*/

    // Synchronized lazy instantiation, not cost-efficient
/*        private static SingletonPerson ADAM;

    public static synchronized SingletonPerson getInstance() {
        if (ADAM == null) {
            ADAM = new SingletonPerson();
        }
        return ADAM;
    }*/

    @Override
    public String toString() {
        return "SingletonPerson {" +
                "\n\tid = " + id +
                ",\n\tname = '" + name + '\'' +
                ",\n\tgender = " + gender +
                ",\n\tage = " + age +
                ",\n\tmbti = " + mbti +
                "\n}";
    }
}
