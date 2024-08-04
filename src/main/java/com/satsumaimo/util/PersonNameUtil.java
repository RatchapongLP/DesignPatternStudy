package com.satsumaimo.util;

import com.satsumaimo.bean.Gender;
import com.satsumaimo.dao.PersonNameDao;

public class PersonNameUtil {
    private static final PersonNameDao personNameDao = new PersonNameDao();

    public static String findProperPartnerName(String name, Gender gender) {
        String partnerName;
        if (gender == Gender.MALE) {
            partnerName = personNameDao.getWomanNameFor(name);
        } else {
            partnerName = personNameDao.getManNameFor(name);
        }
        return partnerName;
    }
}
