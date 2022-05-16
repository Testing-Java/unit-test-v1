package com.karthik.unittestv1.business;

public class SomeBusinessImpl {
    public int calculateSum(int[] data){
        int sum=0;
        for(int val:data) sum+=val;
        return sum;
    }
}
