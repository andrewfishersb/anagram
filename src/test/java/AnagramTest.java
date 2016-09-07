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
    outcome.add("arm");
    outcome.add("ram");
    assertEquals(outcome,test.multipleAnagrams("act hello cat arm ram"));
  }

}
