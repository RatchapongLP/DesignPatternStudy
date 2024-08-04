package com.satsumaimo;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.creational.BuilderPerson;
import com.satsumaimo.creational.PrototypePerson;
import com.satsumaimo.creational.SingletonPerson;

public class Main {
    public static void main(String[] args) {
        SingletonPerson singletonPerson = SingletonPerson.getInstance();
        System.out.println(singletonPerson);

        singletonPerson = SingletonPerson.getInstance();
        System.out.println(singletonPerson);

        System.out.println();

        PrototypePerson prototypePerson = new PrototypePerson("Robert Pattinson", Gender.MALE, 38, Mbti.INFP);
        prototypePerson.matchProperPartner();
        System.out.println(prototypePerson);
        System.out.println(prototypePerson.getPartner());
        System.out.println();

        PrototypePerson cloned = prototypePerson.clone();
        System.out.println(cloned);
        System.out.println(cloned.getPartner());
        System.out.println();

        BuilderPerson builderPerson = BuilderPerson.builder()
                .name("Steve Roger")
                .gender(Gender.MALE)
                .age(34)
                .mbti(Mbti.ISFJ)
                .build();
        System.out.println(builderPerson);
        System.out.println(builderPerson.getPartner());
//
//        BuilderLombokPerson builderLombokPerson = BuilderLombokPerson.builder()
//                .name("Steve Roger")
//                .gender(Gender.MALE)
//                .age(34)
//                .mbti(Mbti.ISFJ)
//                .build();
//        System.out.println(builderLombokPerson);
//        System.out.println(builderLombokPerson.getPartner());
    }
}