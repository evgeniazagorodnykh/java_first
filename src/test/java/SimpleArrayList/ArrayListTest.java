package SimpleArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private ArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void size() {
        assertEquals(0, list.size());
        list.add(3);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddToEmptyArray() {
        list.add(5);
        assertEquals(1, list.size());
        assertEquals(5, list.get(0));
    }

    @Test
    public void testAddToArrayElements() {
        list.add(0);
        list.add(1);
        list.add(2);
        assertEquals(3, list.size());
        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
    }

    @Test
    public void testDeleteElement(){
        list.add(0);
        list.add(1);
        list.delete(0);
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test()
    public void testDeleteNonExistentElement() {
        list.add(0);
        assertThrows(Exception.class, () ->
            list.delete(5));
    }

    @Test()
    public void testDeleteFromEmptyArray() {
        assertThrows(Exception.class, () ->
                list.delete(5));
        assertEquals(0, list.size());
    }

    @Test()
    public void testGetElement() {
        list.add(1);
        list.add(0);
        assertEquals(0, list.get(1));
    }

    @Test()
    public void testGetNonExistentElement() {
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                list.get(5));
    }
}