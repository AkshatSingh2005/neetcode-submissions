class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str ="";
        boolean exit = false; 
        String shortest = strs[0];
        boolean flag = false; 
 

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }
        for(int i=0 ; i<shortest.length() ; i++){
            for(int j=0 ; j<strs.length; j++){
                if(shortest.charAt(i) != strs[j].charAt(i)){
                    exit = true;
                    flag = true;
                    str = shortest.substring(0,i); 
                    break;
                }
                else{
                    flag = false ; 
                }
                
            }
            if (exit == true){
                break ; 
            }
            if (flag == false){
                return str;
            }
        }
        if (shortest.length() == 1){
            str = shortest.substring(0,1); 
        }
        return str;
    }
}