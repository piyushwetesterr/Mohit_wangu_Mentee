package String_Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringRepeatedCharacters 
{
public void countDupChars(String str){
 
    
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
 
    char[] chars = str.toCharArray();
 
    for(Character ch:chars){
      if(map.containsKey(ch)){
         map.put(ch, map.get(ch)+1);
      } else {
         map.put(ch, 1);
        }
    }
 
    Set<Character> keys = map.keySet();
 
    
    for(Character ch:keys){
      if(map.get(ch) > 1){
        //System.out.println("Char "+ch+" "+map.get(ch));
        //System.out.print(""+ch+" "+map.get(ch));
        System.out.print(map.get(ch)+" "+ch+" ");
      }
    }
  }
 
  public static void main(String a[]){
	StringRepeatedCharacters obj = new StringRepeatedCharacters();
    //System.out.println("String: BeginnersBook.com");
    //System.out.println("-------------------------");
    obj.countDupChars("MMMOOOHHHIIITTTT");
  
//    System.out.println("\nString: ChaitanyaSingh");
//    System.out.println("-------------------------");
//    obj.countDupChars("ChaitanyaSingh");
// 
//    System.out.println("\nString: #@$@!#$%!!%@");
//    System.out.println("-------------------------");
//    obj.countDupChars("#@$@!#$%!!%@");
  }
}
