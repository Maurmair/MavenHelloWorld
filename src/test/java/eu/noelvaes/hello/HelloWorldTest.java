package eu.noelvaes.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String answer = helloWorld.sayHello();
        assertEquals("Hello World", answer);
    }
}
