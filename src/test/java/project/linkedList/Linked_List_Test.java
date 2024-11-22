package project.linkedList;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


public class Linked_List_Test {

    @Test
    public void deleteMethodDeletionMutantTest() {
        Linked_List<Integer> list = new Linked_List<>();
        list.add(5);
        list.add(10);
        list.delete(1);
        assertEquals(1, list.size());
    }

    @Test
    public void addArgumentOrderChangeTest() {
        Linked_List<Integer> list = new Linked_List<>();
        list.add(5);
        list.add(10);
        list.add(15);
        assertEquals(3, list.size());
    }


    @Test
    public void overriddenMethodRenameMutationTest() {
        Linked_List<String> list = new Linked_List<String>() {
            @Override
            public int size() {
                return 0;
            }
        };
        assertEquals(0, list.size());
    }

    @Test
    public void containsTest() {
        Linked_List<Integer> list = new Linked_List<>();
        list.add(5);
        list.add(10);
        list.add(15);
        assertTrue(list.contains(5));
        assertFalse(list.contains(6));
    }

    @Test
    public void emptyTest() {

        Linked_List<Integer> list1 = new Linked_List<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        assertFalse(list1.isEmpty());

        Linked_List<Integer> list2 = new Linked_List<>();
        assertTrue(list2.isEmpty());

        Linked_List<Integer> list3 = new Linked_List<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        assertEquals(list3.get(1), 10);

    }

    @Test
    public void removeTest() {

        Linked_List<Integer> list1 = new Linked_List<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.delete(1);

        Linked_List<Integer> ans1 = new Linked_List<>();
        ans1.add(5);
        ans1.add(15);
        boolean flag1 = true;
        for (int i = 0; i < ans1.size(); i++) {
            if (!Objects.equals(ans1.get(i), list1.get(i))) {
                flag1 = false;
                break;
            }
        }
        assertTrue(flag1);
    }

    @Test
    public void testDelete() {

        Linked_List<Integer> list1 = new Linked_List<>();
        list1.add(5);
        list1.add(10);
        list1.delete(0);
        assertEquals(list1.get(0), 10);

        Linked_List<Integer> list2 = new Linked_List<>();
        list2.add(5);
        list2.add(10);
        list2.add(15);
        list2.delete(2);
        list2.delete(0);
        assertEquals(list2.get(0), 10);

    }
}
