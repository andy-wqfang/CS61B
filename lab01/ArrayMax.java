public class ArrayMax {
    /**Return the maximum value for array */
    public static void main(String[] args) {
        int[] numbers = new int[]{5,4,3,2,1};
        int max = max(numbers);
        System.out.println(max);
    }
    public static int max(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}