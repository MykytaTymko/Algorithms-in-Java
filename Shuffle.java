import java.util.Random;

public class Shuffle {

    public void shuffle(int[] a) throws Exception {
        if (a == null || a.length <= 1) {
            throw new Exception("array is not correct");
        }
        Random random = new Random();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n-i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
