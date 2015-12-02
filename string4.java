// Given a string, return the sum of the numbers appearing in the string, ignoring all other
// characters. A number is a series of 1 or more digit chars in a row. (Note:
// Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
// Integer.parseInt(string) converts a string to an int.) 

// sumNumbers("abc123xyz") → 123
// sumNumbers("aa11b33") → 44
// sumNumbers("7 11") → 18


public int sumNumbers(String str) {
  int total = 0;
  String num = "";
  int i = 0;
  while (i < str.length()) {
    if (Character.isDigit(str.charAt(i))) {
       int j = i + 1;    
       for (j=j; j < str.length(); j++) {
          if (!Character.isDigit(str.charAt(j))) break;
       }
       num = str.substring(i,j);
       total += Integer.parseInt(num);
       i = j; 
       continue;  
    }
    i++;
  }
  return total;
}
