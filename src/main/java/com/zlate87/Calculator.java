package com.zlate87;

public class Calculator {

    private final Mapper mapper;

    public Calculator(Mapper mapper) {
        this.mapper = mapper;
    }

    public int calculateSumOfAscii(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += mapper.mapCharToAscii(word.charAt(i));
        }
        return sum;
    }
}
