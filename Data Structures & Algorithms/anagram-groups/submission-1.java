class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] dupli = Arrays.copyOf(strs, strs.length);
        for (int i=0 ; i<strs.length ; i++){
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            strs[i] = new String(tempArray);
            //System.out.println(strs[i]);
        }
        Set<String> set = new HashSet<>();
        for (int i=0 ; i<strs.length ; i++){
            set.add(strs[i]);
        }

        //System.out.println(set);

        List<List<String>> listOfLists = new ArrayList<>();

        for (int i = 0; i < set.size(); i++) {
            listOfLists.add(new ArrayList<>());
        }
        List<String> list = new ArrayList<>(set);

        for (int i=0; i<strs.length ; i++){
            for(int j=0 ; j< list.size() ; j++){
                if(strs[i].equals(list.get(j))){
                    listOfLists.get(j).add(dupli[i]);
                }
            }
        }
        //System.out.println(listOfLists);
        return listOfLists;
    }
}
