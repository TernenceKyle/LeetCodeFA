package com.ezzra.Simple;

import java.util.HashMap;

public class 罗马数字转整数 {
    public static void main(String[] args) {
        String str = "CMXCIX";
        System.out.println(romaConvertor(str));
    }
    //思路：从左至右读，判断下一个罗马字母是否大于当前索引上的，如果大于则当前整数增量为下一个next罗马数-current罗马数
    //若是小于则整数增量为current罗马数。
    public static int romaConvertor(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = str.length();
        int incre = 0;
        int sum = 0;
        for (int i = 0; i < len;) {
            if (i == 0)incre = map.get(str.charAt(i));
            if (i+1<len&&map.get(str.charAt(i+1))>map.get(str.charAt(i))){
                        incre =map.get(str.charAt(i+1)) - map.get(str.charAt(i));
                        i+=2;
            }else{
                incre = map.get(str.charAt(i));
                i++;
            }
            sum += incre;
        }
        return sum;
    }

    public static int romaConverter(String str){
        int len = str.length();
        int incre = 0;
        int sum = 0;
        for (int i = 0; i < len;) {
            if (i == 0)incre = roma(str.charAt(i));
            if (i+1<len&&roma(str.charAt(i+1))>roma(str.charAt(i))){
                incre =roma(str.charAt(i+1)) -roma(str.charAt(i));
                i+=2;
            }else{
                incre = roma(str.charAt(i));
                i++;
            }
            sum += incre;
        }
        return sum;
    }
    public static int roma(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
