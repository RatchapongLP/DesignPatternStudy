package com.satsumaimo;

import com.satsumaimo.bean.Person;
import com.satsumaimo.creator.SingletonPerson;

public class Main {
    public static void main(String[] args) {
        Person person = SingletonPerson.getInstance();
        System.out.println(person);

        person = SingletonPerson.getInstance();
        System.out.println(person);
    }
}