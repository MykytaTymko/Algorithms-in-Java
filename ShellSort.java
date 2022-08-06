public class ShellSort {

    public void sort(int[] array) {
        int N = array.length / 3;
        int h = 1;
        while(h < N) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                int j = i;
                while (j >= h && array[j] < array[j - h]) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                    j = j - h;
                }
            }
            h = h / 3;
        }
    }
}
