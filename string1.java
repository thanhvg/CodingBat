// Given two strings, base and remove, return a version of the base string where all instances of
// the remove string have been removed (not case sensitive). You may assume that the remove string
// i lengte 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx"
// leaves x". 

// withoutString("Hello there", "llo") → "He there"
// withoutString("Hello there", "e") → "Hllo thr"
// withoutString("Hello there", "x") → "Hello there"

// ---
public String withoutString(String base, String remove) {
  if (base.length() < remove.length()) return base;
  String re = "";
  int i = 0; 
  while   (i < base.length() - remove.length()) {
      String s3 = base.substring(i,i + remove.length()).toLowerCase();
      if (s3.equals(remove.toLowerCase())) {
         i = i + remove.length(); 
         continue;
      }
      re = re + base.charAt(i);
      i++;
  }
  
  if (!base.substring(i).toLowerCase().equals(remove.toLowerCase()))
  re = re + base.substring(i);
    
  return re;
   
}
