package com.karthik.unittestv1.business;

import com.karthik.unittestv1.data.SomeDataService;

public class SomeBusinessImpl {
    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    SomeDataService someDataService;
    public int calculateSum(int[] data){
        int sum=0;
        for(int val:data) sum+=val;
        return sum;
    }

    public int calculateSum_service(){
        int sum=0;
        int[] data=someDataService.retrieveData();
        for(int val:data) sum+=val;
        return sum;
    }
}
