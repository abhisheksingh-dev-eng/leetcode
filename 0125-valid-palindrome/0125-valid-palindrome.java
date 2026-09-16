// class Solution {
//     public boolean isPalindrome(String s) {

//         // Convert to lowercase
//         s = s.toLowerCase();

//         // Remove non-alphanumeric characters
//         String clean = "";

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if ((ch >= 'a' && ch <= 'z') || 
//                 (ch >= '0' && ch <= '9')) {
//                 clean = clean + ch;
//             }
//         }

//         // Reverse the string
//         String reverse = "";

//         for (int i = clean.length() - 1; i >= 0; i--) {
//             reverse = reverse + clean.charAt(i);
//         }

//         // Compare
//         return clean.equals(reverse);
//     }
//
class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

           
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

           
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

           
            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}