package com.satsumaimo.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Mbti {
    ESTP, ESFP, ISTP, ISFP, ESTJ, ESFJ, ISTJ, ISFJ, ENTJ, ENTP, INTJ, INTP, ENFJ, ENFP, INFJ, INFP;

    private static final char[] symbolsPositiveArray = {'E', 'N', 'F', 'P'};
    private static final char[] symbolsNegativeArray = {'I', 'S', 'T', 'J'};
    private static final Map<Character, Integer> symbolsPositive;
    private static final Map<Character, Integer> symbolsNegative;

    static {
        symbolsPositive = new HashMap<>();
        symbolsNegative = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            symbolsPositive.put(symbolsPositiveArray[i], i);
            symbolsNegative.put(symbolsNegativeArray[i], i);
        }
    }

    public Mbti getMatchedType() {
        String thisType = this.name();
        char[] matchedType = {getOppositeLetter(thisType.charAt(0))
                , thisType.charAt(1)
                , thisType.charAt(2)
                , getOppositeLetter(thisType.charAt(3))};
        return valueOf(String.valueOf(matchedType));
    }

    private char getOppositeLetter(char c) {
        if (symbolsPositive.containsKey(c)) {
            return symbolsNegativeArray[symbolsPositive.get(c)];
        }
        return symbolsPositiveArray[symbolsNegative.get(c)];
    }
}
