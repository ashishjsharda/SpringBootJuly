package com.ashish.julydemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HelloControllerUnitTest {

    @Test
    public void testHello()
    {
        HelloController helloController=new HelloController();
        Model model=new BindingAwareModelMap();
        String result=helloController.sayHello("hello",model);
        assertEquals("Hello",result);
    }
}
