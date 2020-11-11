package com.example.myClassic;

public class demo {
    public static void main(String[] args) {
        int num = 3115;
//        System.out.println(getDayAddition(num));
       Integer i = Integer.valueOf("123456");
        System.out.println(i);
    }

    public static String getDayAddition(int num) {

        int preLastDigit = num % 100 / 10;

        if (preLastDigit == 1) {
            return "дней";
        }

        switch (num % 10) {
            case 1:
                return "день";
            case 2:
            case 3:
            case 4:
                return "дня";
            default:
                return "дней";
        }

    }
}
