package com.ezzra.Medium;

import java.util.*;

public class 最长不重复字串的长度 {
    public static void main(String[] args) {
        method("ababcdabcdef");
    }

    private static void method(String str) {
        int start = 0;
        int maxLength = 0;
        HashMap<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (wordMap.containsKey(str.charAt(i))) {
                start = Math.max(wordMap.get(str.charAt(i)) + 1, start);
            }
            maxLength = Math.max(maxLength, i - start + 1);
            wordMap.put(str.charAt(i), i);
        }
        System.out.println(maxLength);
    }

    public static int getLongestSubStr(String str) {
        int max_len = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                start = Math.max(map.get(str.charAt(i)) + 1, start);
            }
            max_len = Math.max(i - start + 1, max_len);
            map.put(str.charAt(i), i);
        }
        return max_len;
    }
    //使用HashSet来存储最长字串的内容，华东窗口从最左侧开始，右侧窗口不停右移一位，
    // 如果下一次右移边界处的元素重复，停止字串长度增加，滑动窗口的左边界右移一位，并且删除字串内容的对应字符。
    // 进入下一次滑动窗口的右移。
    public static int getMaxNoRepeatSubStr(String str) {
        HashSet<Character> hashSet = new HashSet<>();
        int max = 0;
        int rk = -1;
        for (int i = 0; i < str.length(); i++) {
            if (i!=0){
                hashSet.remove(str.charAt(i-1));
            }
            while (rk + 1 < str.length() && !hashSet.contains(str.charAt(rk+1))) {
                hashSet.add(str.charAt(rk+1));
                rk++;
            }
            max = Math.max(rk-i+1,max);
        }
        return max;
    }
}
