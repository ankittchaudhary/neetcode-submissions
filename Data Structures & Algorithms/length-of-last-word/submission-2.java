class Solution {
    public int lengthOfLastWord(String s) {
        String trimstr = s.trim();
        int lastSpaceIndex = trimstr.lastIndexOf(" ");
        
        //One word condition
        if (lastSpaceIndex == -1) {
            return trimstr.length();
        }
        
        String lastword = trimstr.substring(lastSpaceIndex + 1, trimstr.length());
        return lastword.length();
    }
}
