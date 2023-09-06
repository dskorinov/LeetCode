import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[index] != nums[i] ) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,3,4,4,4,4,5};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}
