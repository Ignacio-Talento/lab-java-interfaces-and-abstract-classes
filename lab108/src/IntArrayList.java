public class IntArrayList implements IIntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10]; // Default length of 10
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Array is full, create a new one with 50% more capacity
            int newCapacity = array.length + (array.length / 2); // Grow by 50%

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
