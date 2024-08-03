package com.satsumaimo.creator;

import com.satsumaimo.bean.CloneablePerson;
import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.bean.Person;
import com.satsumaimo.util.PersonNameUtil;

public class PrototypePerson extends CloneablePerson {
    private Person partner;

    public PrototypePerson(String name, Gender gender, int age, Mbti mbti, Person partner) {
        this.id = instanceCreated++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mbti = mbti;
        this.partner = partner;
    }

    public PrototypePerson(String name, Gender gender, int age, Mbti mbti, boolean hasPartner) {
        this(name, gender, age, mbti, null);

        // An expensive operation, supposedly
        if (hasPartner) this.partner = getProperPartner();
    }

    private Person getProperPartner() {
        String partnerName = PersonNameUtil.findProperPartnerName(name, gender);
        return new PrototypePerson(partnerName, gender.getOpposite(), age, mbti.getMatchedType(), this);
    }

    @Override
    public PrototypePerson copyToMetaverse() {
        PrototypePerson person = new PrototypePerson(name, gender, age, mbti, false);
        person.partner = this.partner;
        return person;
    }

    @Override
    public String toString() {
        return "PrototypePerson {" +
                "\n\tid = " + id +
                ",\n\tname = '" + name + '\'' +
                ",\n\tgender = " + gender +
                ",\n\tage = " + age +
                ",\n\tmbti = " + mbti +
                ",\n\tpartner = " + partner.getName() + ", id: " + partner.getId() +
                "\n}";
    }
}
