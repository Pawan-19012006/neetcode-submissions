class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> set = new ArrayList<>();
        int len = s.length();
        if(len!=t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            set.add(c);
        }

        int count = 0;
        for(char d : t.toCharArray()){
            if(set.remove((Character) d)){
                count++;
            }
        }
        if(count == len){
            return true;
        }else{
            return false;
        }


    }
}
