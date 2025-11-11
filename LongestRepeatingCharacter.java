package slidingwindow_twopointerr;

public class LongestRepeatingCharacter {

    // Returns length of longest substring after at most k replacements
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        int[] hash = new int[26]; 

        for (int right = 0; right < n; right++) {
            int rightIndex = s.charAt(right) - 'A';
            hash[rightIndex]++;

            // keeping  track of the highest frequency in the current window
            maxFrequency = Math.max(maxFrequency, hash[rightIndex]);

            // if we need more than k replacements to make all chars same, then shrink window
            while ((right - left + 1) - maxFrequency > k) {
                int leftIndex = s.charAt(left) - 'A';
                hash[leftIndex]--;
                left++;
               
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    
    public static void main(String[] args) {
        LongestRepeatingCharacter sol = new LongestRepeatingCharacter();
        System.out.println(sol.characterReplacement("AABABBA", 1)); 
        System.out.println(sol.characterReplacement("ABAB", 2));   
      
    }
}
