import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] newArray = new int[nums.length];
        k = k % nums.length;
        System.arraycopy(nums, nums.length -k, newArray, 0, k);
        System.arraycopy(nums, 0, newArray, k, nums.length -k);
        System.arraycopy(newArray, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
}
