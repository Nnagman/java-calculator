package com.programmers.calculator.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcValidatorService {
    public boolean checkNumsAndSymbol(String str) {
        String regex = "[^1-9+\\-*\\/\\s]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        return m.find();
    }

    public String checkSpacing(String str) {
        str = str.trim().replaceAll(" +", " ");

        if (str.charAt(str.length() - 1) == ' ') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public boolean checkSymbolMatching(String str) {
        return str.length() % 2 == 0;
    }
}
