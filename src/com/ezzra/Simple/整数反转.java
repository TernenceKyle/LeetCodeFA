package com.ezzra.Simple;


public class 整数反转 {
    public static void main(String[] args) {
        int num = -1997;
        System.out.println(IntegerReverseStrVer(num));
    }

    private static int myMethod(int num) {
        long n = 0;
        int key = 1;
        if (n < 0) key = -1;
        while (num != 0) {
            n = n * 10 + num % 10;
            num = num / 10;
        }
        int res = 0;
        return res = (int) n == n ? (int) n : 0;
    }

    public static int IntegerReverse(int num) {
        long res = 0;
        int k = (res > 0) ? 1 : -1;
        num*=k;
        while (num > 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return (int) res == res ? (int) (res*k) : 0;
    }
    public static int IntegerReverseStrVer(int num){
        int k = (num>0)?1:-1;
        String str = String.valueOf(num);
        if (k<0)
        {
            str = str.replace("-", "");
        }
        int l = str.length();
        long res = 0;
        int n = 0;
        for (int i = str.length()-1; i >=0; i--) {
            if (i>0) {
                n = Integer.valueOf(str.substring(i, i+1));
            }else {
                if (!str.substring(0,i+1).equals("")) {
                    n = Integer.valueOf(str.substring(0, i+1));
                }
            }
            res = res*10+n;
        }
        return (int)res == res?(int)res*k : 0;
    }
}
