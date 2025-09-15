package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        double summa = 0;
        for (int luku : arr) {
            summa += luku;
        }
        return summa / arr.length;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int suurin = arr[0];
        for (int luku : arr) {
            if (luku > suurin) {
                suurin = luku;
            }
        }
        return suurin;
    }
}

