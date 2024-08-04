package com.satsumaimo.util;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.bean.Mbti;

public class PersonPartnerUtil {
    /**
     * An expensive operation involving accessing a database, supposedly
     */
    public static String getProperPartnerName(String name, Gender gender) {
        return PersonNameUtil.findProperPartnerName(name, gender);
    }

    public static Gender getProperPartnerGender(Gender gender) {
        return gender.getOpposite();
    }

    public static int getProperPartnerAge(int age, Gender gender) {
        if (gender == Gender.MALE) return age - 5;
        return age + 5;
    }

    public static Mbti getProperPartnerMbti(Mbti mbti) {
        return mbti.getMatchedType();
    }
}
