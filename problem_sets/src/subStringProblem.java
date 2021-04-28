public class subStringProblem {

    public String minWindow(String s, String t) {
        int [] map = new int[128];


        for (int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            map[c]++; // save each character occured times in string t, e.g. 'A' == 65(decimal) in ascii table, so map[65] was storing the 'A' occurring times.
        }


        int start = 0;
        int end = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int counter = t.length();
        while (end < s.length()) {
            final char c1 = s.charAt(end);
            if (map[c1] > 0) {
                counter--;// total counter, e.g. "AABC", counter = 4
            }
            map[c1]--; // e.g. 'A' times - 1 = 1
            end++;
            while (counter == 0) {
                // compare the substring length with minLen, and assign the new smaller value to minLen
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                final char c2 = s.charAt(start);
                map[c2]++; //remove 'A' in s.substring, add back one time 'A' in t
                //remove 'A' in s.substring, add back one time 'A' in t
                if (map[c2] > 0) counter++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] map = new int[256];
        int start = 0, end = 0, maxLen = Integer.MIN_VALUE, counter = 0;

        while (end < s.length()) {
            final char c1 = s.charAt(end);
            if (map[c1] == 0) counter++;
            map[c1]++;
            end++;

            while (counter > k) {
                final char c2 = s.charAt(start);
                if (map[c2] == 1) counter--;
                map[c2]--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start);
        }

        return maxLen;
    }
}
