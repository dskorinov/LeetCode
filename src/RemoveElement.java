import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int p1 = nums.length - 1;
        int length = nums.length;
        for (int i = 0; i <= p1; i++) {

            if (p1 >= 0 && nums[i] == val) {

                while (true) {

                    if (p1 >= 0 && nums[p1] == val) {
                        nums[p1] = 101;
                        length--;
                        p1--;

                    } else {
                        break;
                    }
                }

                if (p1 >= 0 && i < p1) {
                    nums[i] = nums[p1];
                    nums[p1] = 101;
                    p1--;
                    length--;

                }
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5};
        int val = 5;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));

    }
}

