// Given a string, return the longest substring that appears at both the beginning and end of the // string without overlapping. For example, sameEnds("abXab") is "ab". 

// sameEnds("abXYab") → "ab"
// sameEnds("xx") → "x"
// sameEnds("xxx") → "x"


public String sameEnds(String str) {
  String re = "";
  if (str.length() < 2) return re;
  int i;
  for (i = str.length()/2; i >=1 ; i--) {
     String head = str.substring(0,i);
     String end = str.substring(str.length()-i);     
     if (head.equals(end)) break;
  }
  re = str.substring (0,i);
  return re;
}
