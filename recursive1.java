// Given a string, compute recursively (no loops) the number of
// lowercase 'x' chars in the string.

// countX("xxhixx") → 4
// countX("xhixhix") → 3
// countX("hi") → 0

public int countX(String str) {
  if (str.length() == 0) return 0;
  if (str.equals("x")) return 1;
  if (str.length() == 1 && !str.equals("x")) return 0;
  return countX(str.substring(0,str.length()-1)) 
         + countX(str.substring(str.length() - 1));
}
