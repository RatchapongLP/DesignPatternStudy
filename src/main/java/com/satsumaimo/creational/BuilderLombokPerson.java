package com.satsumaimo.creational;

import com.satsumaimo.bean.SimplePerson;
import lombok.Builder;

@Builder
public class BuilderLombokPerson extends SimplePerson {
    @Override
    public void matchProperPartner() {

    }
//    private BuilderLombokPerson(Builder builder) {
//        this.id = instanceCreated++;
//        if (partner == null) matchProperPartner();
//    }
}
