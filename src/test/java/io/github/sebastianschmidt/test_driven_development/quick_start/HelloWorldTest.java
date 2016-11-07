package io.github.sebastianschmidt.test_driven_development.quick_start;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private HelloWorld instance;

    @Before
    public void setUp() {
        instance = new HelloWorld();
    }

    @Test
    public void getMessage_always_greetsWorld() {
        assertEquals("Hello World!", instance.getMessage());
    }

}
