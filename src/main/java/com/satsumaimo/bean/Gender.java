package com.satsumaimo.bean;

public enum Gender {
    MALE, FEMALE;

    public Gender getOpposite() {
        if (this == MALE) return FEMALE;
        return MALE;
    }
}
