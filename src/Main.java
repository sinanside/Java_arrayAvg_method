public class Main {
    public class ArrayAverage {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            double average = calculateAverage(array);
            System.out.println("Dizinin ortalaması: " + average);
        }

        public static double calculateAverage(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }
    }
}
