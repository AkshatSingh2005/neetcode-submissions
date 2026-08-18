class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

    for (int i=0; i<first.length(); i++)
    {
        char currentChar = first.charAt(i);
        for (int j=0; j<strs.length; j++)
        {
            if (i >= strs[j].length() || currentChar != strs[j].charAt(i))
            return first.substring(0,i);
        }
    }
    return first;
}
}