class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str ="";
        boolean exit = false; 
        String shortest = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }
        for(int i=0 ; i<shortest.length() ; i++){
            for(int j=0 ; j<strs.length; j++){
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    exit = true;
                    break;
                }
                
            }
            str += strs[0].charAt(i);
            if (exit == true){
                break ; 
            }
        }
        str = str.substring(0, str.length() - 1);
        return str;
    }
}