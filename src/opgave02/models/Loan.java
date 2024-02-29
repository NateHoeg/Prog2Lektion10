package opgave02.models;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        int fine = 0;
        int daysBetween = Period.between(returnDate, actualDate).getDays();
        if(adult) {
            if(daysBetween <= 7) {
                fine = 20;
            }
            if(daysBetween >= 8 && daysBetween <= 14) {
                fine = 60;
            }
            if(daysBetween >= 15) {
                fine = 90;
            }
        }
        if(!adult) {
            if(daysBetween <= 7) {
                fine = 10;
            }
            if(daysBetween >= 8 && daysBetween <= 14) {
                fine = 30;
            }
            if(daysBetween >= 15) {
                fine = 45;
            }
        }
        return fine;
    }

}
