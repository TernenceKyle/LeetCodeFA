package com.ezzra.Simple;

import java.util.*;

public class 两数之和 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(myMethod(new int[]{2, 11, 17, 18, 6}, 19)));
    }
    public static int[] myMethod(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
    //由题意可知找下标最快的就是实用Map关系映射，利用 hashtable来查找满足结果的数组下标。
    public static int[] twoNumSum(int[] nums,int target){
        Map<Integer,Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //将数组中的元素作为key并将其下标作为val存入hashMap中
            if (hashTable.containsKey(target-nums[i])) {
                //当hashtable中存在满足条件的key时直接取出与其对应的下标，和当前循环到的下标。
                return new int[]{hashTable.get(target - nums[i]),i};
            }else{
                hashTable.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
