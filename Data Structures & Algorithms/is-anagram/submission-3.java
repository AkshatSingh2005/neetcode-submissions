class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ; 
        }

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String s1 = new String(chars);

        char[] chars1 = t.toCharArray();
        Arrays.sort(chars1);
        String t1 = new String(chars1);

        System.out.println(s1 + " " + t1);
        return s1.equals(t1);
    }
}
