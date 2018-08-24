import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new Animal();
    }

    @Test
    public void shouldAnimalHungerEqualsWithGivenConstructorParameter() {
        int expectedNumber = 50;
        int resultHungerValue = myObject.hunger;
        assertEquals("This number is not the expected number", expectedNumber, resultHungerValue);
    }

    @Test
    public void shouldAnimalThirstEqualsWithGivenConstructorParameter() {
        int expectedNumber = 50;
        int resultThirstValue = myObject.thirst;
        assertEquals("This number is not the expected number", expectedNumber, resultThirstValue);
    }


    @Test
    public void checkIfValidEatMethod() {
        int expectedNumber = 49;
        myObject.eat();
        assertEquals("Not working", expectedNumber, myObject.hunger);
    }

    @Test
    public void checkIfValidDrinkMethod() {
        int expectedNumber = 49;
        myObject.drink();
        assertEquals("Not working", expectedNumber, myObject.thirst);
    }

    @Test
    public void checkIfValidPlayMethod() {
        int expectedNumber = 51;
        myObject.play();
        assertEquals("Not working", expectedNumber, myObject.hunger);
        assertEquals("Not working", expectedNumber, myObject.thirst);
    }
}
