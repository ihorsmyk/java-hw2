public class Sorter {
    public static void sort(double[] arr, boolean isAscending) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (isAscending) {
                    if (arr[i] > arr[j]) {
                        double tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;

                    }
                } else {
                    if (arr[i] < arr[j]) {
                        double tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
    }
}


