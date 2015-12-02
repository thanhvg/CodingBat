// Given two arrays of ints sorted in increasing order, outer and inner, return true if all of
// the numbers in inner appear in outer. The best solution makes only a single "linear" pass of
// both arrays, taking advantage of the fact that both arrays are already in sorted order. 

// linearIn({1, 2, 4, 6}, {2, 4}) → true
// linearIn({1, 2, 4, 6}, {2, 3, 4}) → false
// linearIn({1, 2, 4, 4, 6}, {2, 4}) → true


public boolean linearIn(int[] outer, int[] inner) {
  int pos = 0;
  for (int i = 0; i < inner.length; i++) {
     for (int j = pos; j < outer.length; j++) {
        if (outer[j] == inner[i]) {
           pos = j + 1;
           break;
        }        
     }
     if (pos < 1 || inner[i] != outer[pos-1]) {
        return false;
     } 
  }
  return true;
}
