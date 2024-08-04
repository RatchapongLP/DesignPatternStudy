package com.satsumaimo.creational;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;
import com.satsumaimo.bean.Person;
import com.satsumaimo.bean.SimplePerson;
import com.satsumaimo.util.PersonPartnerUtil;

public class BuilderPerson extends SimplePerson {
    private BuilderPerson(Builder builder) {
        this.id = instanceCreated++;
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.mbti = builder.mbti;
        this.partner = builder.partner;

        matchProperPartner();
    }

    // Because this method is static, and it's calling the constructor of its inner class,
    // the inner class must be declared as static too, or else it's a compile-error.
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void matchProperPartner() {
        if (partner != null) return;

        String partnerName = PersonPartnerUtil.getProperPartnerName(name, gender);
        Gender partnerGender = PersonPartnerUtil.getProperPartnerGender(gender);
        int partnerAge = PersonPartnerUtil.getProperPartnerAge(age, gender);
        Mbti partnerMbti = PersonPartnerUtil.getProperPartnerMbti(mbti);

        partner = builder()
                .name(partnerName)
                .gender(partnerGender)
                .age(partnerAge)
                .mbti(partnerMbti)
                .partner(this)
                .build();
    }

    public static class Builder {
        private String name;
        private Gender gender;
        private int age;
        private Mbti mbti;
        private SimplePerson partner;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder mbti(Mbti mbti) {
            this.mbti = mbti;
            return this;
        }

        public Builder partner(SimplePerson person) {
            this.partner = person;
            return this;
        }
        public BuilderPerson build() {
            return new BuilderPerson(this);
        }
    }
}
