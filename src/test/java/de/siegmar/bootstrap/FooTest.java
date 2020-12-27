/*
 * Bootstrap-Checkstyle example header
 */

package de.siegmar.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void fooTest() {
        assertEquals("Hello Oliver", new Foo().sayHello("Oliver"));
    }

}
