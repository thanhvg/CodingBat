// Given a string, return the length of the largest "block" in the string. A block is a run of
// adjacent chars that are the same. 

// maxBlock("hoopla") → 2
// maxBlock("abbCCCddBBBxx") → 3
// maxBlock("") → 0


public int maxBlock(String str) {
  if (str.length() == 1) return 1;
  if (str.length() == 0) return 0;
  int count = 1;
  int i =0;
  while (i < str.length()) {
     int j = 1;
     while ((i+j < str.length())&&
             (str.charAt(i) == str.charAt(i+j)) ) {
       j++;
     }
     if (count < j) count = j;
     i +=j;
  
  }
  return count;
}
