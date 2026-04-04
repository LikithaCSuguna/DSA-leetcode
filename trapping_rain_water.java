/*

Problem #42:  
Find how much rainwater can be trapped between 
elevation bars represented by an array.

Approach: 
Use two pointers with leftMax and rightMax 
to calculate trapped water

Complexity:
Time: O(n)
Space: O(1)

*/

class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left < right) {
           
          // Move the pointer with smaller height
          
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                  // Water trapped at current index                 
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                  // Water trapped at current index
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
