import java.util.Arrays;

public class CountingSort {

    void sort(int[] arr) {
        int[] c = new int[Arrays.stream(arr).max().getAsInt() + 1];
        for (int j : arr) {
            c[j] = c[j] + 1;
        }
        int pos = 0;
        for (int number = 0; number < c.length; number++) {
            for (int i = 0; i < c[number]; i++) {
                arr[pos] = number;
                pos++;
            }
        }
    }
}
