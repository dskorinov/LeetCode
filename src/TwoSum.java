import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diff = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            diff.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(diff.get(nums[i]) != null && diff.get(nums[i]) != i)
                return new int[]{i, diff.get(nums[i])};
        }
        System.out.println(target);
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int val = 6;
        System.out.println(Arrays.toString(twoSum(nums, val)));
        System.out.println(Arrays.toString(nums));

    }
}