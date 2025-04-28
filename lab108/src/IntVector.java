public class IntVector implements IIntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20]; // Default length of 20
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Array is full, create a new one with double capacity
            int newCapacity = array.length * 2; // Double the size

            int[] newArray = new int[newCapacity];
            // Copy all elements to the new array
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        return array[id];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }
}