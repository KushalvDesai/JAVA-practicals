

import java.util.Arrays;

class sorting<T> {
    private final T[] arr;

    sorting(T[] arr) {
        this.arr = arr;
    }

    public T[] sortArray() {
        Arrays.sort(arr);
        return this.arr;
    }
}

public class Practical8_2 {
    public static void main(String[] args) {
        sorting<Double> obj1 = new sorting<>(new Double[]{12.4, 122.3, 45.55, 10.2});
        System.out.println(Arrays.toString(obj1.sortArray()));

        sorting<Integer> obj2 = new sorting<>(new Integer[]{23, 100, 30, 20, 123});
        System.out.println(Arrays.toString(obj2.sortArray()));

    }
}