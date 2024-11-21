package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Give_it_a_try_Test {

    @Test
    public void towSumTest(){
        Give_it_a_try xD = new Give_it_a_try();
        int[] arr = {1,9,3,7,8};
        Assertions.assertTrue(xD.twoSum(arr,9));
    }
}
