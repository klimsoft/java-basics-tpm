package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class Ex19Mockito {
    @Test
    void testMockitoReturnList() {
        List mockedList = Mockito.mock();

        mockedList.add("Johny");
        mockedList.add("Adam");

        Mockito.verify(mockedList).add("Johny");
        Mockito.verify(mockedList).add("Adam");
//        Mockito.verify(mockedList).add("Nick");
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
    }

    @Test
    void testRealReturnList() {
        List list = new ArrayList();

        list.add("Johny");
        list.add("Adam");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        Assertions.assertEquals("Johny", list.get(0));
        Assertions.assertEquals("Adam", list.get(1));
    }
}
