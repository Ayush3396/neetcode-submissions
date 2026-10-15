class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int target = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int p1 = i + 1;
            int p2 = nums.length - 1;
            int foundsum = target - nums[i];

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (p1 < p2) {
                int sum = nums[p1] + nums[p2];

                if (sum == foundsum) {
                    ans.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2--;

                    while (p1 < p2 && nums[p1] == nums[p1 - 1]) p1++;
                    while (p1 < p2 && nums[p2] == nums[p2 + 1]) p2--;
                } else if (sum < foundsum) {
                    p1++;
                } else {
                    p2--;
                }
            }
        }

        return ans;
    }
}