public class sum { // 类名规范首字母大写（非强制，但建议遵守）
    public int[] two(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // 修正数组初始化语法
                }
            }
        }
        return new int[0];
    }

    // 程序入口main方法
    public static void main(String[] args) {
        sum sum = new sum();
        // 测试用例：比如nums=[2,7,11,15], target=9，预期返回[0,1]
        int[] result = sum.two(new int[]{3, 1, 1, 5}, 9);
        System.out.println("结果下标：" + result[0] + "," + result[1]);
    }
}
