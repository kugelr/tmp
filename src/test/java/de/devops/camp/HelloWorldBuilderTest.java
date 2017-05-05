package de.devops.camp;

import org.junit.Assert;
import org.junit.Test;

import de.devops.camp.HelloWorldBuilder;


public class HelloWorldBuilderTest {

    @Test
    public void testHWB() {
        HelloWorldBuilder hwb = new HelloWorldBuilder();
        Assert.assertEquals("Hello World!", "Hello World!");
    }
}
