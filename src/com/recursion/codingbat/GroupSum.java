package com.recursion.codingbat;

public class GroupSum {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 8};

        GroupSum gs = new GroupSum();
        System.out.println(gs.groupSum(0, arr, 10));

    }
    public boolean groupSum(int start, int[] nums, int target) {
        if(target == 0){
            return true;
        }

        if(start == nums.length){
            return false;
        }
        if(groupSum(start+1, nums, target- nums[start])){
            return true;
        }

        return groupSum(start +1, nums, target);


    }


}
