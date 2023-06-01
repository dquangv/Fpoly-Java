package lab8;

final class XPoly {

    public static final double sum(double[] arr) {
        double total = 0;
        for (double num : arr) {
            total += num;

        }
        return total;
    }

    public static final double min(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static final double max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
