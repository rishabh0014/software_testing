package project.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Heap_Algo_Test {

    @Test
    public void kthLargestTest() {
        Heap_Algo heapAlgo = new Heap_Algo();
        int[] arr = {4, 3, 6, 7, 10};
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 3), 6);
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 10), -1);
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 5), 3);
        Assertions.assertEquals(heapAlgo.kthLargest(arr, 1), 10);
    }

    @Test
    public void kthSmallestTest() {
        Heap_Algo heapAlgo = new Heap_Algo();
        int[] arr = {4, 3, 6, 7, 10};
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 3), 6);
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 10), -1);
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 5), 10);
        Assertions.assertEquals(heapAlgo.kthSmallest(arr, 1), 3);
    }

    @Test
    public void taskSchedulerTest() {

        Heap_Algo heapAlgo1 = new Heap_Algo();
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        Assertions.assertEquals(heapAlgo1.leastInterval(tasks1, 0), 6);
        Assertions.assertEquals(heapAlgo1.leastInterval(tasks1, 2), 8);

        Heap_Algo heapAlgo2 = new Heap_Algo();
        char[] tasks2 = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        Assertions.assertEquals(heapAlgo2.leastInterval(tasks2, 2), 16);

        Heap_Algo heapAlgo3 = new Heap_Algo();
        char[] tasks3 = {};
        Assertions.assertEquals(heapAlgo3.leastInterval(tasks3, 2), 0);
        Assertions.assertEquals(heapAlgo3.leastInterval(tasks3, 0), 0);

        Heap_Algo heapAlgo4 = new Heap_Algo();
        char[] tasks4 = {'A', 'A', 'A'};
        Assertions.assertEquals(heapAlgo4.leastInterval(tasks4, 2), 7);
        Assertions.assertEquals(heapAlgo4.leastInterval(tasks4, 0), 3);

    }

}
