

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a Max Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Step 3: Add all entries of the map into the heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }

        // Step 4: Create the answer array
        int[] ans = new int[k];

        // Step 5: Remove the top k frequent elements
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        // Step 6: Return the answer
        return ans;
    }
}