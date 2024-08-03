package com.satsumaimo;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.bean.Person;
import com.satsumaimo.creator.PrototypePerson;
import com.satsumaimo.creator.SingletonPerson;

public class Main {
    public static void main(String[] args) {
        SingletonPerson singletonPerson = SingletonPerson.getInstance();
        System.out.println(singletonPerson);

        singletonPerson = SingletonPerson.getInstance();
        System.out.println(singletonPerson);

        PrototypePerson prototypePerson = new PrototypePerson("Robert Pattinson", Gender.MALE, 38, Mbti.INFP, true);
        System.out.println(prototypePerson);

        Person cloned = prototypePerson.copyToMetaverse();
        System.out.println(cloned);

        cloned = prototypePerson.copyToMetaverse();
        System.out.println(cloned);

        cloned = prototypePerson.copyToMetaverse();
        System.out.println(cloned);
    }
}