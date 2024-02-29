package opgave02.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void kid7DayscalculateFine() {
        Loan lån = new Loan(LocalDate.of(2024, 10, 10));
        int expected = 10;
        int actual = lån.calculateFine(LocalDate.of(2024, 10, 17), false);
        assertEquals(expected, actual);
    }

    @Test
    void kid12DayscalculateFine() {
        Loan lån = new Loan(LocalDate.of(2024, 10, 10));
        int expected = 30;
        int actual = lån.calculateFine(LocalDate.of(2024, 10, 22), false);
        assertEquals(expected, actual);
    }

    @Test
    void kid15DayscalculateFine() {
        Loan lån = new Loan(LocalDate.of(2024, 10, 10));
        int expected = 45;
        int actual = lån.calculateFine(LocalDate.of(2024, 10, 25), false);
        assertEquals(expected, actual);
    }

    @Test
    void Adult5DayscalculateFine() {
        Loan lån = new Loan(LocalDate.of(2024, 10, 10));
        int expected = 20;
        int actual = lån.calculateFine(LocalDate.of(2024, 10, 15), true);
        assertEquals(expected, actual);
    }

    @Test
    void Adult10DayscalculateFine() {
        Loan lån = new Loan(LocalDate.of(2024, 10, 10));
        int expected = 60;
        int actual = lån.calculateFine(LocalDate.of(2024, 10, 20), true);
        assertEquals(expected, actual);
    }

    @Test
    void Adult20DayscalculateFine() {
        Loan lån = new Loan(LocalDate.of(2024, 10, 10));
        int expected = 90;
        int actual = lån.calculateFine(LocalDate.of(2024, 10, 30), true);
        assertEquals(expected, actual);
    }

}