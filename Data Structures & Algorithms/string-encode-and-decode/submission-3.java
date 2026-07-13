class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String str : strs) {
            s.append(str.length()).append("#").append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // find '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // extract full length
            int length = Integer.parseInt(str.substring(i, j));

            // extract string
            String word = str.substring(j + 1, j + 1 + length);
            res.add(word);

            // move pointer
            i = j + 1 + length;
        }

        return res;
    }
}