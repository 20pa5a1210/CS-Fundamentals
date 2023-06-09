package arrays.twoPointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    static int ThreeSumSolution(int nums[], int target) {
        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int L = i + 1, R = n - 1;
            while (L < R) {
                int curSum = nums[L] + nums[R] + nums[i];
                if (curSum < target) {
                    List<Integer> Sub = new LinkedList<>();
                    Sub.add(nums[L]);
                    Sub.add(nums[R]);
                    Sub.add(nums[i]);
                    res.add(Sub);
                    L++;
                } else {
                    R--;
                }
            }
        }
        System.out.println(res);
        return res.size() * 2;
    }

    static List<List<Integer>> ThreeSumSolution(int nums[]) {
        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;
        if (n < 3)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int L = i + 1, R = n - 1;
            while (L < R) {
                int curSum = nums[i] + nums[L] + nums[R];
                if (curSum == 0) {
                    List<Integer> Sub = new LinkedList<>();
                    Sub.add(nums[i]);
                    Sub.add(nums[L]);
                    Sub.add(nums[R]);
                    res.add(Sub);
                    L++;
                    R--;
                    while (L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }
                    while (L < R && nums[R] == nums[R - 1]) {
                        R--;
                    }
                } else if (curSum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 0, 1, 3 };
        int res = ThreeSumSolution(nums, 10);
        System.out.println(res);
    }
}
