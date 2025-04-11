import java.util.*;
public class linkedHashMap {
    
    public static void main(String args[]){
          LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
          lhm.put("India",100);
          lhm.put("China",200);
          lhm.put("US",300);
          System.out.println(lhm);
    }
}

//
// Time Complexity: O(1) for put, get, remove, containsKey, size, isEmpty
