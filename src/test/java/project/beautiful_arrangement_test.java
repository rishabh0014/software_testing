package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Beautiful_Arrangement_Test {

    @Test
    public void testCountArrangementWithSmallNumbers() {
        Beautiful_Arrangement ba = new Beautiful_Arrangement();

        // Test for n = 1
        Assertions.assertEquals(1, ba.countArrangement(1));

        // Test for n = 2
        Assertions.assertEquals(2, ba.countArrangement(2));
    }

    @Test
    public void testCountArrangementWithMediumNumbers() {
        Beautiful_Arrangement ba = new Beautiful_Arrangement();

        // Test for n = 3
        Assertions.assertEquals(3, ba.countArrangement(3));

        // Test for n = 4
        Assertions.assertEquals(8, ba.countArrangement(4));
    }

    @Test
    public void testCountArrangementWithLargerNumbers() {
        Beautiful_Arrangement ba = new Beautiful_Arrangement();

        // Test for n = 5
        Assertions.assertEquals(10, ba.countArrangement(5));

        // Test for n = 6
        Assertions.assertEquals(36, ba.countArrangement(6));
    }

}
