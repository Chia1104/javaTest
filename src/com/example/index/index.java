package com.example.index;

public class index {
    static final String findMax = "max";
    static final String findMin = "min";

    public static void main(String[] args) {
        int[] array1 = new int[] { 20, 12, 7, 35, 20, 99};
        int findNum = findMaxMin(findMin, array1);
        System.out.println(findNum);
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
}
