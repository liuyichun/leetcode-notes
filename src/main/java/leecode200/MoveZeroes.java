package leecode200;

/**
 * @author xixibb
 * @date 2022/08/24
 * @desprication 283. Move Zeroes (Easy)
 */
public class MoveZeroes {

    /**
     * 283. 移动零
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * 示例 1:
     *
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 示例 2:
     *
     * 输入: nums = [0]
     * 输出: [0]
     */
    public void moveZeroes(int[] nums) {

        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
