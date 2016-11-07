package io.github.sebastianschmidt.test_driven_development.quick_start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class EntryPointIT {

    private PrintStream previousOutputStream;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        previousOutputStream = System.out;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanUp() {
        System.setOut(previousOutputStream);
    }

    @Test
    public void main_always_greetsWorld() {
        EntryPoint.main(new String[0]);
        assertEquals("Hello World!" + System.lineSeparator(), outputStream.toString());
    }

}
