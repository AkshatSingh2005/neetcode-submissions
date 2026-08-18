class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str ="";
        boolean exit = false; 
        for(int i=0 ; i<strs[0].length() ; i++){
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
        return str;
    }
}