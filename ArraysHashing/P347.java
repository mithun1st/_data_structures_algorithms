package ArraysHashing;

import java.util.ArrayList;
import java.util.HashMap;

public class P347 {
    public static int[] topKFrequent(int[] nums, int k) {

        // mapping
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            if (!map.keySet().contains(e)) {
                map.put(e, 0);
            }
            map.put(e, map.get(e) + 1);
        }

        // bucket sort
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int feq = map.get(key);
            if (bucket[feq] == null) {
                bucket[feq] = new ArrayList<>();
            }
            bucket[feq].add(key);
        }

        // collect
        int[] result = new int[k];
        int count = 0;
        for (int i = bucket.length - 1; 0 < k; i--) {
            if (bucket[i] == null) {
                continue;
            }
            for (int j = 0; j < bucket[i].size(); j++) {
                result[count] = bucket[i].get(j);
                count++;
            }
            if (count == k) {
                break;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        topKFrequent(new int[] { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 }, 2);
    }
}
