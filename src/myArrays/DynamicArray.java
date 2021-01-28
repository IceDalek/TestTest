package myArrays;

public class DynamicArray {
    private int[] data;
    private int size; //реальное
    private int reservedSize; //зарезервированное

    public DynamicArray() {
        this.size = 0;
        this.reservedSize = 10;
        this.data = new int[reservedSize];
    }

    public int size() {
        return size;
    }

    private void expand() {

        this.reservedSize += this.reservedSize / 2;
        int[] tmp = new int[reservedSize];
        for (int i = 0; i < size; i++) {
            tmp[i] = this.data[i];
        }
        this.data = tmp;

    }

    public DynamicArray(int reservedSize) {
        this.reservedSize = reservedSize;
        this.size = 0;
        this.data = new int[this.reservedSize];
    }

    public void add(int value) {
        data[size] = value;
        size++;
        if (size + 1 == this.reservedSize) {
            expand();
        }
    }

    public void add(int index, int value) {
        data[index] = value;
        size++;
        if (size + 1 == this.reservedSize) {
            expand();
        }
    }

    public int get(int index) {
        return data[index];
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void delete(int index) {

    }

    public void sort(int arg) {
        boolean isMoved = false;
        if (arg == 0) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - 1; j++) {
                    if (data[j] < data[j + 1]) {
                        int tmp = data[j + 1];
                        data[j + 1] = data[j];
                        data[j] = tmp;
                        isMoved = true;
                        // БЫЛА ПЕРЕСТАНОВКА!!!
                    }
                }
                if(!isMoved){
                    break;
                }
            }
        }
    }

}
