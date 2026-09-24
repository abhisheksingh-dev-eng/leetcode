// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n=nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//               if(nums[j]==nums[i]){
//                 return true;
//               }    
//             }
//         }
//         return false;
//     }
// }
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}