public class MergingSort {

    public void mergeSort(int[] arr, int left, int right) {
        for (int size = 1; size <= right; size = size * 2) {
            for (int j = left; j < right - size; j += 2 * size) {
                merge(arr, j, j + size, Math.min(right, j + 2 * size));
            }
        }
    }

    public void merge(int[] arr, int left, int medium, int right) {
        int index1 = 0;
        int index2 = 0;
        int[] result = new int[right - left];

        while (left + index1 < medium && medium + index2 < right) {
            if (arr[left + index1] < arr[medium + index2]) {
                result[index1 + index2] = arr[left + index1];
                index1++;
            } else {
                result[index1 + index2] = arr[medium + index2];
                index2++;
            }
        }

        while (left + index1 < medium) {
            result[index1 + index2] = arr[left + index1];
            index1++;
        }

        while (medium + index2 < right) {
            result[index1 + index2] = arr[medium + index2];
            index2++;
        }

        for (int i = 0; i < index1 + index2; i++) {
            arr[left + i] = result[i];
        }
    }
}
