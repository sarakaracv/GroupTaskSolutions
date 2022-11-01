package MyGroupSolution.SingleNumber;

import java.util.Arrays;

public class SingleNew {
    public int singleNumbern(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                if (count == 1) return nums[i - 1];

                count = 0;
            } count ++;
        }

        if (count == 1) return nums[nums.length - 1];

        return -1;
    }
}
