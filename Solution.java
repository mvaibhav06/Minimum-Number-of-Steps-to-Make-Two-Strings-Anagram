class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> temp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            temp.put(ch, temp.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(temp.containsKey(ch)){
                if(temp.get(ch) > 0){
                    temp.put(ch, temp.get(ch)-1);
                }
            }
        }
        int out = 0;
        for(char key : temp.keySet()){
            if(temp.get(key) > 0){
                out += temp.get(key);
            }
        }
        return out;
    }
}
