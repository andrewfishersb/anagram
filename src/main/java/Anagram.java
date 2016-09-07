import java.util.ArrayList;
import java.util.List;

public class Anagram{

  public boolean isAnagram(String word1, String word2){
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    if(word1.length() != word2.length()){
      return false;
    }else if(word1.equalsIgnoreCase(word2)){
      return true;
    }else{
      for(int i =0; i<word1.length();i++){
        if(!word1.contains(word2.substring(i,i+1))){
          return false;
        }
      }
    }
    return true;
  }
  public ArrayList<String> multipleAnagrams(String sentence){
    String[] sentenceArray = sentence.split("[^a-zA-Z]");
    ArrayList<String> finalList = new ArrayList<String>();
    // ArrayList<String> sentenceList = new ArrayList<String>(Arrays.asList(sentenceArray));
    for(int i =0;i<sentenceArray.length;i++){
      boolean initialAdded = false;

      for(int j = 1; j<sentenceArray.length;j++){
        if(isAnagram(sentenceArray[i],sentenceArray[j])){
          if(!initialAdded){
            finalList.add(sentenceArray[i]);
            initialAdded = false;
          }
          finalList.add(sentenceArray[j]);

        }
      }

    }
    return finalList;
  }

}

// ["act", "ram", "hello", "arm", "cat"]
