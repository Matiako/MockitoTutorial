package com.mockito.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ListTest {
    @Test
    public void letsMockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());

    }
    @Test
    public void letsMockListSizeMethod_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }
    @Test
    public void letsMockListGetMehthod() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("in28Minutes");
        assertEquals("in28Minutes",listMock.get(0));
        assertEquals("in28Minutes",listMock.get(1));
    }
}