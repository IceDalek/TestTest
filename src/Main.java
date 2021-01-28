import myArrays.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(101);
        dynamicArray.add(101);
        dynamicArray.add(101);
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.get(1));

    }
}