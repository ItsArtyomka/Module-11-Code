public class Main1 {
    // Example code that throws exception. FIXED.
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 5, 3}; // length = 6 BUT Max index = 5 is it cant be <=
        int s = 0, i;
        for (i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println(s);
    }
}
