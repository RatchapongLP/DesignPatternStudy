package com.satsumaimo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data // Automatically generates getters and setters
@EqualsAndHashCode(callSuper = true)
public abstract class SimplePerson extends BasePerson {
    protected static int instanceCreated = 1;
    protected SimplePerson partner;

    public abstract void matchProperPartner();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "\n\tid = " + id +
                ",\n\tname = '" + name + '\'' +
                ",\n\tgender = " + gender +
                ",\n\tage = " + age +
                ",\n\tmbti = " + mbti +
                ",\n\tpartner = " + (partner == null ? "null" : partner.getName() + ", id: " + partner.getId()) +
                "\n}";
    }
}
