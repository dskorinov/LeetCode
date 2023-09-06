import java.util.Arrays;

public class SignProductArray {
    public static int arraySign(int[] nums) {
        int total = 1;
        for (int num : nums) {
            if (num < 0) {
                total = total * (-1);
            } else if (num == 0) {
                return 0;
            }

        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5};
        System.out.println(arraySign(nums));
        System.out.println(Arrays.toString(nums));

    }
}