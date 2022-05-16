package com.karthik.unittestv1.business;

import com.karthik.unittestv1.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBusinessImplSubTest {

    @Test
    void calculateSum_basic() {
        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataServiceStub());
        int actualResult=someBusiness.calculateSum_service();
        int expectedResult=6;
        assertEquals(expectedResult,actualResult);
    }

//    @Test
//    void calculateSum_empty() {
//        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
//        int actualResult=someBusiness.calculateSum(new int[]{});
//        int expectedResult=0;
//        assertEquals(expectedResult,actualResult);
//    }
}
class SomeDataServiceStub implements SomeDataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3};
    }
}