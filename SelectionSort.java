public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexWithMinimumValue = i;
            for (int k = i + 1; k < array.length; k++) {
                if (array[indexWithMinimumValue] > array[k]) {
                    indexWithMinimumValue = k;
                }
            }
            int value = array[i];
            array[i] =  array[indexWithMinimumValue];
            array[indexWithMinimumValue] = value;
        }
    }
}
