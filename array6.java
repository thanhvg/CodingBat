// We'll say that a "mirror" section in an array is a group of
// contiguous elements such that somewhere in the array, the same
// group appears in reverse order. For example, the largest mirror
// section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3}
// part). Return the size of the largest mirror section found in the
// given array.

// maxMirror({1, 2, 3, 8, 9, 3, 2, 1}) → 3
// maxMirror({1, 2, 1, 4}) → 3
// maxMirror({7, 1, 2, 9, 7, 2, 1}) → 2

public int maxMirror(int[] nums) {
  int max = 0;
  for (int i = 0; i <= nums.length-1; i++) {
     for (int j = nums.length - 1; j >= i; j--) {
        if (nums[i] == nums[j]) {
           int ci = i; 
           int cj = j;
           int count = 1;
           while (ci + count < nums.length && 
                  cj - count >= 0 &&
                  nums[ci + count] == nums[cj-count]) {
              count++;
           }
           if (count > max) max = count;
        }
        
     }
  }
  return max;
}
