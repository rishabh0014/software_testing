package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class beautiful_arrangement_test {

    @Test
    public void testCountArrangementWithSmallNumbers() {
        beautiful_arrangement ba = new beautiful_arrangement();

        // Test for n = 1
        Assertions.assertEquals(1, ba.countArrangement(1));

        // Test for n = 2
        Assertions.assertEquals(2, ba.countArrangement(2));
    }

    @Test
    public void testCountArrangementWithMediumNumbers() {
        beautiful_arrangement ba = new beautiful_arrangement();

        // Test for n = 3
        Assertions.assertEquals(3, ba.countArrangement(3));

        // Test for n = 4
        Assertions.assertEquals(8, ba.countArrangement(4));
    }

    @Test
    public void testCountArrangementWithLargerNumbers() {
        beautiful_arrangement ba = new beautiful_arrangement();

        // Test for n = 5
        Assertions.assertEquals(10, ba.countArrangement(5));

        // Test for n = 6
        Assertions.assertEquals(36, ba.countArrangement(6));
    }

}
