import java.util.ArrayList;
import java.util.HashMap;

public class solutions {
    //find identical pairs
    public int numIdenticalPairs(int[] a) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int count=0;
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(a[i]))
            {
                count=count+hm.get(a[i]);
                hm.put(a[i],hm.get(a[i])+1);
            }
            else
            {
                hm.put(a[i],1);
            }
        }


        return count;

    }

    //How Many Numbers Are Smaller Than the Current Number
    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }


    //Minimum Window Substring
    public String minWindow(String s, String t) {
        int [] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while (end < s.length()) {
            final char c1 = s.charAt(end);
            if (map[c1] > 0) counter--;
            map[c1]--;
            end++;
            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                final char c2 = s.charAt(start);
                map[c2]++;
                if (map[c2] > 0) counter++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }



}
