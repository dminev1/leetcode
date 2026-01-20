class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int lcp = 0;
        for(int i = 0; i < strs[0].length(); i++){
            boolean lcpSwitch = true;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= lcp || strs[0].charAt(i) != strs[j].charAt(i)) {
                    lcpSwitch = false;
                    break;
                }
            }
            if(lcpSwitch){
                lcp++;
            }else{
                break;
            }
        }
        return strs[0].substring(0, lcp);
    }
}