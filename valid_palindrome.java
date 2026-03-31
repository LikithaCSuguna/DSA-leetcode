/*

Problem #125:
Check whether a given string is a palindrome after converting to lowercase and removing all non-alphanumeric characters.
Return true if it reads the same forward and backward, otherwise false.

Approach:
Clean the string by removing special characters and converting it to lowercase.
Use two pointers from both ends to compare characters until they meet.

Complexity:
Time: O(n)
Space: O(n)

*/

class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        // Check palindrome
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
