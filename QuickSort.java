public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int divideIndex = partition(arr, low, high);
            quickSort(arr, low, divideIndex - 1);
            quickSort(arr, divideIndex, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2];
        int leftIndex = low;
        int rightIndex = high;
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int tmp = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
