import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 5};
        System.out.println(majorityElement(nums));
        System.out.println(Arrays.toString(nums));

    }
}