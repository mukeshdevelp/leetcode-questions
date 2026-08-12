class Solution {
    public int lengthOfLongestSubstring(String s) {
    int count;
    
    ArrayList<Character> originalList = new ArrayList<Character>();
    
    ArrayList<Character> copyList = new ArrayList<Character>();
    count = copyList.size();
    for(int i = 0; i < s.length(); i++){
      if(!originalList.contains(s.charAt(i))){
        // add the result in the arraylist
        originalList.add(s.charAt(i));
        if(copyList.size() > originalList.size()){
          count = copyList.size();
        }
        else{
          count = originalList.size();
        }
      }
      else{
        // we found a duplicate element. save the original list elements in the copy list
        if(originalList.size() >= copyList.size()){
          // clear the copy list
          copyList.clear();
          // add the original list elemnets in copy list
          copyList.addAll(originalList); 
          count = copyList.size();
        }

        // clear the original list 
        int posToRemove = originalList.indexOf(s.charAt(i));

        // clear the original sublist upto the duplicate
        originalList.subList(0, posToRemove + 1).clear();
        // add the element in the original list
        originalList.add(s.charAt(i));
        // increase the count
        count = copyList.size();

      }

    }
    
    return count;
    }
}