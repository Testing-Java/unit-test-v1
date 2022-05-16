package com.karthik.unittestv1.business;

import com.karthik.unittestv1.data.SomeDataService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
    @InjectMocks
    SomeBusinessImpl someBusiness;
    @Mock
    SomeDataService someDataServiceMock;

    @Test
    void calculateSum_basic() {
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{1, 2, 3});
        int actualResult = someBusiness.calculateSum_service();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSum_empty() {
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{});
        int actualResult = someBusiness.calculateSum_service();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}