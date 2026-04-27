package ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P49 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            final char[] chhs = strs[i].toCharArray();
            Arrays.sort(chhs);

            final String sortElement = String.valueOf(chhs);
            final String element = strs[i];

            if (!map.containsKey(sortElement)) {
                map.put(sortElement, new ArrayList<>());
            }
            map.get(sortElement).add(element);
        }

        return new ArrayList<>(map.values());
    }

}
