// Given a string, compute recursively (no loops) a new string where
// all the lowercase 'x' chars have been changed to 'y' chars.

// changeXY("codex") → "codey"
// changeXY("xxhixx") → "yyhiyy"
// changeXY("xhixhix") → "yhiyhiy"

public String changeXY(String str) {
  if (str.length() == 0) return str;
  if (str.equals("x")) return "y";
  if (!str.equals("x") && str.length() == 1) return str;
  
  return changeXY(str.substring(0,1)) + changeXY(str.substring(1));
}
