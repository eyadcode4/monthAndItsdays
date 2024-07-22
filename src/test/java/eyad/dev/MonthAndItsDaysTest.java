package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MonthAndItsDaysTest {


    @Test
    public void testJanuary() {
        assertEquals("The month is January has 31 days.", MonthAndItsDays.getMonth(1));
    }

    @Test
    public void testFebruary() {
        assertEquals("The month is February has 28 days.", MonthAndItsDays.getMonth(2));
    }

    @Test
    public void testMarch() {
        assertEquals("The month is March has 31 days.", MonthAndItsDays.getMonth(3));
    }

    @Test
    public void testApril() {
        assertEquals("The month is April has 30 days.", MonthAndItsDays.getMonth(4));
    }

    @Test
    public void testMay() {
        assertEquals("The month is May has 31 days.", MonthAndItsDays.getMonth(5));
    }

    @Test
    public void testJune() {
        assertEquals("The month is June has 30 days.", MonthAndItsDays.getMonth(6));
    }

    @Test
    public void testJuly() {
        assertEquals("The month is July has 31 days.", MonthAndItsDays.getMonth(7));
    }

    @Test
    public void testAugust() {
        assertEquals("The month is August has 31 days.", MonthAndItsDays.getMonth(8));
    }

    @Test
    public void testSeptembre() {
        assertEquals("The month is Septembre has 30 days.", MonthAndItsDays.getMonth(9));
    }

    @Test
    public void testOctobre() {
        assertEquals("The month is Octobre has 31 days.", MonthAndItsDays.getMonth(10));
    }

    @Test
    public void testNovember() {
        assertEquals("The month is November has 30 days.", MonthAndItsDays.getMonth(11));
    }

    @Test
    public void testDecember() {
        assertEquals("The month is December has 31 days.", MonthAndItsDays.getMonth(12));
    }

    @Test
    public void testMesInvalido() {
        assertEquals("The month is Invalid month number has 0 days.", MonthAndItsDays.getMonth(15));
        assertEquals("The month is Invalid month number has 0 days.", MonthAndItsDays.getMonth(0));
        assertEquals("The month is Invalid month number has 0 days.", MonthAndItsDays.getMonth(-5));
    }
}
