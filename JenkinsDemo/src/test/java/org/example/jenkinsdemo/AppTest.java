package org.example.jenkinsdemo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AppTest {
    @Test
    public void addTest()
    {
        Main obj=new Main();
        assertEquals(10,obj.add(5,5));
    }
    @Test
    public void subTest()
    {
        Main obj=new Main();
        assertEquals(0,obj.sub(5,5));
    }
}