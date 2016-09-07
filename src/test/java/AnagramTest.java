import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class AnagramTest {

  @Test
  public void isAnagram_TwoWords_Yes(){
    Anagram test = new Anagram();
    boolean outcome = true;
    assertEquals(outcome,test.isAnagram("crate","trace"));
  }

  @Test
  public void isAnagram_CaseInsensitive_Yes(){
    Anagram test = new Anagram();
    boolean outcome = true;
    assertEquals(outcome,test.isAnagram("crAte","tRace"));
  }

  @Test
  public void isAnagram_fail_No(){
    Anagram test = new Anagram();
    boolean outcome = false;
    assertEquals(outcome,test.isAnagram("crate","track"));
  }

  @Test
  public void multipleAnagrams_ListsAnagrams_list(){
    Anagram test = new Anagram();
    ArrayList<String>outcome = new ArrayList<String>();
    outcome.add("act");
    outcome.add("cat");
    outcome.add("trace");
    outcome.add("crate");
    outcome.add("ram");
    outcome.add("arm");
    assertEquals(outcome,test.multipleAnagrams("act bumblebee hello trace ram beast arm cat crate"));
  }

}
