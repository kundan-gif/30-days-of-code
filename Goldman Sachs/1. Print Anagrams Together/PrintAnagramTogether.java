import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Print Anagrams Together
// problem link- https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/

class PrintAnagramTogether {
    public List<List<String>> Anagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }
            if (!map.containsKey(fmap)) {
                List<String> al = new ArrayList<String>();
                al.add(str);
                map.put(fmap, al);
            } else {
                List<String> al = map.get(fmap);
                al.add(str);
                map.put(fmap, al);
            }

        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
}
