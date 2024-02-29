package opgave01.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @Test
    void exceptionCalculatePremium() {
        CarInsurance carInsurance = new CarInsurance(100);
        Throwable exception = assertThrows(RuntimeException.class,() -> carInsurance.calculatePremium(15, false, 0), "Did not throw RunTimeException");
        assertEquals("Not a valid driver", exception.getMessage(), "Exception message did not match");
    }

    @Test
    void womanBelow25CalculatePremium() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 118.75;
        double actual = carInsurance.calculatePremium(20, true, 0);
        assertEquals(expected, actual);
    }

    @Test
    void womanAbove25CalculatePremium() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 95;
        double actual = carInsurance.calculatePremium(30, true, 0);
        assertEquals(expected, actual);
    }

    @Test
    void manBelow25CalculatePremium() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 125;
        double actual = carInsurance.calculatePremium(20, false, 0);
        assertEquals(expected, actual);
    }

    @Test
    void manAbove25CalculatePremium() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 100;
        double actual = carInsurance.calculatePremium(30, false, 0);
        assertEquals(expected, actual);
    }

    @Test
    void womanBelow25With5YearsWithoutDamage() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 100.9375;
        double actual = carInsurance.calculatePremium(23, true, 5);
        assertEquals(expected, actual);
    }

    @Test
    void womanAbove25With5YearsWithoutDamage() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 80.75;
        double actual = carInsurance.calculatePremium(30, true, 5);
        assertEquals(expected, actual);
    }

    @Test
    void womanAbove25With7YearsWithoutDamage() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 71.25;
        double actual = carInsurance.calculatePremium(30, true, 7);
        assertEquals(expected, actual);
    }


    @Test
    void manAbove25With8YearsWithoutDamage() {
        CarInsurance carInsurance = new CarInsurance(100);
        double expected = 65;
        double actual = carInsurance.calculatePremium(30, false, 10);
        assertEquals(expected, actual);
    }




}