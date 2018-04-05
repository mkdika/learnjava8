package com.mkdika.learnjava8.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * Program kalkulator Indonesia mengunakan Java 8.
 *
 * Inputan operan : nol - seratus
 *
 * Inputan operator: tambah, kurang, kali
 */
public class KalkulatorIndonesia {

    final Map<String, String> normalizeToken;
    final private Map<String, String> mapOperator;
    private final String[] nominal = {"", "satu", "dua", "tiga", "empat", "lima",
        "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    public KalkulatorIndonesia() {
        this.normalizeToken = new HashMap<>();
        this.mapOperator = new HashMap<>();
        mapOperator.put("tambah", "+");
        mapOperator.put("kurang", "-");
        mapOperator.put("kali", "*");
    }

    public static void main(String[] args) {
        KalkulatorIndonesia kalkulator = new KalkulatorIndonesia();

        String input = "tiga tambah sembilan kali delapan belas kurang dua puluh enam tambah nol";

        System.out.println("Input     : " + input);
        System.out.println("Output    : " + kalkulator.mengalkulasi(input));
    }

    public String mengalkulasi(String input) {
        String normalize = normalizeString(input);
        System.out.println("Normalize : " + normalize);

        String postfix = convertToPostfix(normalize);
        System.out.println("Postfix   : " + postfix);

        int r = postfixCalculate(postfix.split("\\s+"));
        System.out.println("Calculate : " + r);

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.append(" adalah ");
        sb.append(numberToWords(r));
        return sb.toString();
    }

    private String normalizeString(String input) {
        if (input == null || input.trim().length() < 1) {
            return "";
        }
        List<String> list = Arrays.asList(input.trim().toLowerCase().split("\\s+"));
        List<String> temp = new ArrayList<>();
        StringBuilder tsb = new StringBuilder();
        list.forEach((s) -> {
            if (!mapOperator.containsKey(s)) { // an operant
                tsb.append(s).append(" ");
            } else { // an operator
                temp.add(wordsToNumber(tsb.toString()));
                temp.add(wordsToNumber(s));
                tsb.setLength(0);
            }
        });
        temp.add(wordsToNumber(tsb.toString())); // get last operant
        return temp.stream().collect(Collectors.joining(" "));
    }

    private String convertToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder(infix.length());
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);
            if (c != ' ' && !mapOperator.containsValue(String.valueOf(c))) {
                postfix.append(c);
            } else if (mapOperator.containsValue(String.valueOf(c))) {
                postfix.append(" ");
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }
        }
        postfix.append(" ");
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }
        return postfix.toString();
    }

    private int getPrecedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
                return 2;
            default:
                return -1;
        }
    }

    private int postfixCalculate(String[] el) {
        Stack<Integer> stack = new Stack<>();
        int operand1, operand2;

        for (int i = 0; i < el.length; i++) {
            if (mapOperator.containsValue(el[i])) {
                operand2 = stack.pop();
                operand1 = stack.pop();
                switch (el[i]) {
                    case "+": {
                        int local = operand1 + operand2;
                        stack.push(local);
                        break;
                    }

                    case "-": {
                        int local = operand1 - operand2;
                        stack.push(local);
                        break;
                    }

                    case "*": {
                        int local = operand1 * operand2;
                        stack.push(local);
                        break;
                    }
                }
            } else {
                stack.push(Integer.parseInt(el[i]));
            }
        }
        return stack.pop();
    }

    private String numberToWords(int input) {
        if (input < 12) {
            return nominal[(int) input];
        }

        if (input >= 12 && input <= 19) {
            return nominal[(int) input % 10] + " belas ";
        }

        if (input >= 20 && input <= 99) {
            return nominal[(int) input / 10] + " puluh " + nominal[(int) input % 10];
        }

        if (input >= 100 && input <= 199) {
            return "seratus " + numberToWords(input % 100);
        }

        if (input >= 200 && input <= 999) {
            return nominal[(int) input / 100] + " ratus " + numberToWords(input % 100);
        }

        if (input >= 1000 && input <= 1999) {
            return "seribu " + numberToWords(input % 1000);
        }

        if (input >= 2000 && input <= 999999) {
            return numberToWords((int) input / 1000) + " ribu " + numberToWords(input % 1000);
        }

        if (input >= 1000000 && input <= 999999999) {
            return numberToWords((int) input / 1000000) + " juta " + numberToWords(input % 1000000);
        }

        return "";
    }

    private String wordsToNumber(String str) {
        if (mapOperator.containsKey(str)) {
            return mapOperator.get(str);
        }

        String[] s = str.split("\\s+");
        int n = 0;

        for (int i = 0; i < s.length; i++) {

            switch (s[i].trim()) {
                case "satu":
                    n += 1;
                    break;
                case "dua":
                    n += 2;
                    break;
                case "tiga":
                    n += 3;
                    break;
                case "empat":
                    n += 4;
                    break;
                case "lima":
                    n += 5;
                    break;
                case "enam":
                    n += 6;
                    break;
                case "tujuh":
                    n += 7;
                    break;
                case "delapan":
                    n += 8;
                    break;
                case "sembilan":
                    n += 9;
                    break;
                case "sepuluh":
                case "belas":
                    n += 10;
                    break;
                case "sebelas":
                    n += 11;
                    break;
                case "puluh":
                    n *= 10;
                    break;
                case "seratus":
                    n += 100;
                    break;
            }

        }
        return String.valueOf(n);
    }
}
