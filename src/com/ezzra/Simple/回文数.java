package com.ezzra.Simple;

public class 回文数 {
    public static void main(String[] args) {
        System.out.println(tenet(123454321));
    }
    //利用字符串和字符数组
    public static boolean tenet(int num) {
        String source = String.valueOf(num);
        int len = source.length();
        for (int i = 0; i < len; i++) {
            if (source.charAt(i) != source.charAt(len- 1 - i)) return false;
        }
        return true;
    }

    public static boolean arepo(int num) {
        if (num < 0) return false;
        int res = 0;
        int count = 0;
        {
            int temp = num;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }
        int pow =0;
        int pointer = count/2;
        if(count%2==0) pow = (int) Math.pow(10, pointer);
        else pow = (int)Math.pow(10,pointer+1);
        int temp2 = num;
        for (int i = 0; i < count / 2; i++) {
            res = res * 10 + temp2 % 10;
            temp2 = temp2 / 10;
        }
        int ori = num / pow;
        return (res == ori) ? true : false;
    }
}
