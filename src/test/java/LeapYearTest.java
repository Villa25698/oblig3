import org.junit.jupiter.api.DisplayName;
import org.example.LeapYear;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearTest {

    @Test
    @DisplayName("A year that is not divisible by 4 is NOT a leap year")
    public void testYearNotDivisibleBy4() {
        assertFalse(LeapYear.isLeapYear(2001));
        assertFalse(LeapYear.isLeapYear(2002));
        assertFalse(LeapYear.isLeapYear(2003));
    }

    @Test
    @DisplayName("A year that is divisible by 4 but not by 100 IS a leap year")
    public void testYearDivisibleBy4NotBy100() {
        assertTrue(LeapYear.isLeapYear(2004));
        assertTrue(LeapYear.isLeapYear(2008));
        assertTrue(LeapYear.isLeapYear(2012));
    }

    @Test
    @DisplayName("A year that is divisible by 100 but not by 400 is NOT a leap year")
    public void testYearDivisibleBy100NotBy400() {
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1700));
    }

    @Test
    @DisplayName("A year that is divisible by 400 IS a leap year")
    public void testYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
        assertTrue(LeapYear.isLeapYear(2800));
    }
}
