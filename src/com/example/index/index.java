package com.example.index;

import java.util.*;

public class index {
    static final String findMax = "max";
    static final String findMin = "min";

    public static void main(String[] args) {
        int[] array1 = new int[] { 20, 12, 7, 35, 20, 99};
        int[] array2 = new int[] { 1, 2, 3, 4, 5, 6};
        int target = 10;
//        int findNum = findMaxMin(findMin, array1);
        String result = twoSum(array2, target).toString();
        System.out.println(result);
    }

    private static int findMaxMin (String type, int[] nums) {
        int currentNum = nums[0];
        switch (type) {
            case findMax -> {
                for (int num : nums) {
                    if (currentNum < num) {
                        currentNum = num;
                    }
                }
                return currentNum;
            }
            case findMin -> {
                for (int num : nums) {
                    if (currentNum > num) {
                        currentNum = num;
                    }
                }
                return currentNum;
            }
        }
        return currentNum;
    }

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
//    LeetCode Q1
    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> initMap = new HashMap<>(); // key : value
        for (int num : nums) {
            int diff = target - nums[num];
            if (initMap.containsKey(diff)){
                return new int[] {initMap.get(diff), num};
            }
            initMap.put(nums[num], num);
        }
        throw new IllegalArgumentException("No match found");
    }
}
