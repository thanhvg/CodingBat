// Given an array of ints, is it possible to divide the ints into two
// groups, so that the sum of one group is a multiple of 10, and the
// sum of the other group is odd. Every int must be in one group or
// the other. Write a recursive helper method that takes whatever
// arguments you like, and make the initial call to your recursive
// helper from splitOdd10(). (No loops needed.)

// splitOdd10({5, 5, 5}) → true
// splitOdd10({5, 5, 6}) → false
// splitOdd10({5, 5, 6, 1}) → true

public boolean splitOdd10(int[] nums) {
  return helper(0, nums, 0, 0);
  
}

boolean helper (int start, int[] nums, int s10, int sOdd) {
  if (start >= nums.length) return (s10 % 10 == 0 && sOdd % 2 == 1); 
  if (helper(start + 1, nums, s10 + nums[start], sOdd)) return true;
  if (helper(start + 1, nums, s10, sOdd + nums[start])) return true;
  return false;   
  
}
