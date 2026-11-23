class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();
        for(char chs: s.toCharArray()){
            sm.put(chs, sm.getOrDefault(chs,0)+1);
        }

        for(char cht : t.toCharArray()){
            tm.put(cht, tm.getOrDefault(cht,0)+1);
        }

        if(sm.equals(tm)){
            return true;
        }else{
            return false;
        }
    }
}
