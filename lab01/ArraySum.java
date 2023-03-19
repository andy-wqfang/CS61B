/** Calculate the sum of numbers in an array
 * 
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(sum(numbers));
    }
    public static int sum(int[] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i];
            i += 1;
        }
        return sum;
    }
}