package com.example.servingwebcontent;

import java.util.Arrays;

class ConstantValue {
    public static int solve(final String s) {
        return Arrays.stream(s.split("[aeiou]+"))
                        .filter(a -> !a.isEmpty())
                        .map(a -> a.chars()
                        .map("0abcdefghijklmnopqrstuvwxyz"::indexOf)
                        .reduce(Integer::sum)
                        .getAsInt())
                        .reduce((a, b) -> a > b ? a : b)
                        .get();
    }
}