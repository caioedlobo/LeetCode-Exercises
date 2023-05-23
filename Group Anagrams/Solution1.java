class Solution1 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        map.put(strs[0], new ArrayList<>());
        boolean foundAnagram = false;
        for(int i = 0; i < strs.length; i++){
            for(String key: map.keySet()){
                if(isAnagram(strs[i], key)){
                    List<String> values = new ArrayList<>(map.get(key));
                    values.add(strs[i]);
                    map.put(key, values);
                    foundAnagram = true;
                }
            }
            if (!foundAnagram){
                map.put(strs[i], new ArrayList<>(List.of(strs[i])));
            }
            foundAnagram = false;
        }
        return new ArrayList<>(map.values());
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}