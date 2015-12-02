// Given a string, return a string where every appearance of the lowercase word "is" has been
// replaced with "is not". The word "is" should not be immediately preceeded or followed by a
// letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
// tests if a char is a letter.) 

// notReplace("is test") → "is not test"
// notReplace("is-is") → "is not-is not"
// notReplace("This is right") → "This is not right"

 public String notReplace(String str) {
    String s = "";
    for (int i = 0; i < str.length(); i++)
      if (i < str.length() - 1 && str.substring(i, i + 2).equals("is")
          && (i == 0 || !Character.isLetter(str.charAt(i - 1)))
          && (i + 2 >= str.length() || !Character.isLetter(str.charAt(i + 2)))) {
        s = s + "is not";
        i += 1;
      } else {
        s = s + str.charAt(i);
      }
    return s;
  }
}
