public class Main {
    public static void main(String[] args) {
        double[] arr = {5.9, 7.3, 67.4, 32, 5, 6, 7, -14.8, 53, 1, 124, 5, 6, 4, 3, 54, -57, 0, 43, 3, -153, 707, 73, -81, 6,};

        System.out.println("original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\nsort by ascending:");
        Sorter.sort(arr, true);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\nsort by descending:");
        Sorter.sort(arr, false);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
