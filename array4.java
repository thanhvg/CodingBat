// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0,
// 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups). 

// squareUp(3) → {0, 0, 1, 0, 2, 1, 3, 2, 1}
// squareUp(2) → {0, 1, 2, 1}
// squareUp(4) → {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}

public int[] squareUp(int n) {
  int[] re = new int[n*n];
  for (int i = 0; i < n*n; i++) {
     re[i] = 0;
  }
  
  for (int i = n; i >= 0; i--) {
     for (int j = 1; j <= i ; j++) {
         re[i*n - j] = j;
     }
  }
  return re;
}
