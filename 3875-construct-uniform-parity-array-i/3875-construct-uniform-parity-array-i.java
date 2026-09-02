// class Solution {
//     public boolean uniformArray(int[] nums1) {

//         if (nums1.length < 2) {
//             return true;
//         }

//         int check = nums1[1] - nums1[0];
//         boolean refEven = check % 2 == 0;

//         for (int i = 2; i < nums1.length; i++) {
//             int diff = nums1[i] - nums1[i - 1];
//             boolean currEven = diff % 2 == 0;

//             if (currEven != refEven) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
class Solution {
    public boolean uniformArray(int[] nums1) {
        return true;
    }
}