class Solution {
    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        System.out.println(str);

        while(j < str.length()) {
            while(str.charAt(j) != '#') {
                j++;
            }

            int l = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + l;
            li.add(str.substring(i, j));
            i = j;
        }

        return li;
    }
}
