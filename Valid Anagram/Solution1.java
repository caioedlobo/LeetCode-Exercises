
// Solution using HashMap, lesss memory but runtime its not good
// O(n)
class Solution1{
    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) != 0){
                return false;
            }
        }
        return true;
    }
}