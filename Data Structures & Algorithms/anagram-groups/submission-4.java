class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            
            int a[] = new int[26];
            for(char c: strs[i].toCharArray()) a[c-'a']++;
            String str = Arrays.toString(a);

            if(hm.containsKey(str)) hm.get(str).add(strs[i]);
            else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                hm.put(str,l);
            }
        }

        return new ArrayList<>(hm.values());

    }
}