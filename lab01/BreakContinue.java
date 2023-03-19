public class BreakContinue {
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
    public static void windowPosSum(int[] arr, int n) {
        int[] clone = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                continue;
            }
            for (int j = i + 1; j < i + n + 1; j++) {
                if (j == arr.length) {
                    break;
                }
                arr[i] += clone[j];
            }
        }
    }
}