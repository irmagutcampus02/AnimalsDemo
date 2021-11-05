package at.campus02.gutmann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    int a;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a= 1;
        // Wert für ist definiert
    }

    @Test
    void myFirstTest() {
        assertTrue(a>0);

    }
}