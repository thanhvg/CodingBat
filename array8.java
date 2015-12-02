// in list collection, remove method won't affect loop 

// Given an array of strings, return a new List (e.g. an ArrayList)
// where all the strings of the given length are omitted. See
// wordsWithout() below which is more difficult because it uses
// arrays.

// wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
// wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
// wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}

public List wordsWithoutList(String[] words, int len) {
  ArrayList al = new ArrayList();
  
  for (int i = 0; i < words.length; i++) {
     al.add(words[i]);
  }

  for (int i = 0; i < al.size(); i++) {
    int l = ((String)al.get(i)).length();
    if (l == len) al.remove(i);
  }
  return al;
}


public List wordsWithoutList(String[] words, int len) {
  ArrayList al = new ArrayList();
  
  for (int i = 0; i < words.length; i++) {
     al.add(words[i]);
  }
  
  int size = al.size(); 
  // the counter end is fixed
  // it will cause error down below  when the list size is reduced
  for (int i = 0; i < size; i++) { 
    int l = ((String)al.get(i)).length();
    if (l == len) al.remove(i);
  }
  return al;
}
