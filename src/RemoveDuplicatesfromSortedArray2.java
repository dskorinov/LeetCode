import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray2 {

    public static int removeDuplicates2(int[] nums) {
        int index = 0;
        int tmp = 0;
        if(nums.length > 2) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[index] != nums[i]) {
                    index++;
                    nums[index] = nums[i];
                    tmp = 0;
                } else if (nums[index] == nums[i] && tmp < 1) {
                    tmp++;
                    index++;
                    nums[index] = nums[i];

                }
            }
        }
        else {
            index = nums.length - 1;
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(removeDuplicates2(nums));
        System.out.println(Arrays.toString(nums));

    }
}
