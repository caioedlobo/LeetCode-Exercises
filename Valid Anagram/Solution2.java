// Uses array, runtime its better than HashMap, but uses it more memory (not by much)
// Works the same way as on HashMap, add and subtract by 1 so the array should be empty
// O(n)
class Solution2{
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