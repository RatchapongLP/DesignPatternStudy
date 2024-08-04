package com.satsumaimo.creational;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.bean.SimplePerson;
import com.satsumaimo.util.PersonPartnerUtil;

/**
 * An implementation of SimplePerson class which can have a {@code null} partner, and
 * has a method to clone an instance.
 */
public class PrototypePerson extends SimplePerson implements Cloneable {
    public PrototypePerson(String name, Gender gender, int age, Mbti mbti, SimplePerson partner) {
        this(name, gender, age, mbti);
        this.partner = partner;
    }

    public PrototypePerson(String name, Gender gender, int age, Mbti mbti) {
        this.id = instanceCreated++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mbti = mbti;
    }

    @Override
    public PrototypePerson clone() {
        PrototypePerson clonedPerson = new PrototypePerson(name, gender, age, mbti);

        if (partner != null) {
            clonedPerson.partner = new PrototypePerson(this.partner.getName(),
                    this.partner.getGender(),
                    this.partner.getAge(),
                    this.partner.getMbti(),
                    clonedPerson);
        }

        return clonedPerson;
    }

    @Override
    public void matchProperPartner() {
        String partnerName = PersonPartnerUtil.getProperPartnerName(name, gender);
        Gender partnerGender = PersonPartnerUtil.getProperPartnerGender(gender);
        int partnerAge = PersonPartnerUtil.getProperPartnerAge(age, gender);
        Mbti partnerMbti = PersonPartnerUtil.getProperPartnerMbti(mbti);

        partner = new PrototypePerson(partnerName, partnerGender, partnerAge, partnerMbti, this);
    }
}
