package com.karthik.unittestv1.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {
    @Mock
    List<String> listMock;
    @Test
    public void size_basic(){
        when(listMock.size()).thenReturn(5);
        assertEquals(5,listMock.size());
    }

    @Test
    public void size_differentValues(){
        when(listMock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5,listMock.size());
        assertEquals(10,listMock.size());
    }

    @Test
    public void verify_listMock(){
        String s1 = listMock.get(0);
        String s2 = listMock.get(1);
        verify(listMock).get(0);
        verify(listMock,times(2)).get(anyInt());
        verify(listMock,never()).get(2);
    }

    @Test
    public void argumentCapturing(){
        listMock.add("Some String 1");
        listMock.add("Some String 2");
        ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
        verify(listMock, times(2)).add(captor.capture());
        List<String> stringList=captor.getAllValues();
        assertEquals("Some String 1",stringList.get(0));
        assertEquals("Some String 2",stringList.get(1));
    }
}
