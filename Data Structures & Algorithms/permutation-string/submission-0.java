class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] arr = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        int match = 0;
        for (int i = 0; i < 26; i++) {
            if(arr[i] == s2Count[i])
            match++;
        }
        if (match == 26)
            return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            if (s2Count[s2.charAt(i - s1.length()) - 'a']
                == arr[s2.charAt(i - s1.length()) - 'a']) {
                match--;
            }
            s2Count[s2.charAt(i - s1.length()) - 'a']--;
            if (s2Count[s2.charAt(i - s1.length()) - 'a']
                == arr[s2.charAt(i - s1.length()) - 'a']) {
                match++;
            }
            if (s2Count[s2.charAt(i) - 'a'] == arr[s2.charAt(i) - 'a']) {
                match--;
            }
            s2Count[s2.charAt(i) - 'a']++;
            if (s2Count[s2.charAt(i) - 'a'] == arr[s2.charAt(i) - 'a']) {
                match++;
            }
            if(match==26) return true;
        }
        return false;
    }
}
