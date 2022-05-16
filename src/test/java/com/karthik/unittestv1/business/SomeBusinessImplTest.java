package com.karthik.unittestv1.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void calculateSum_basic() {
        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
        int actualResult=someBusiness.calculateSum(new int[]{1,2,3});
        int expectedResult=6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void calculateSum_empty() {
        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
        int actualResult=someBusiness.calculateSum(new int[]{});
        int expectedResult=0;
        assertEquals(expectedResult,actualResult);
    }
}