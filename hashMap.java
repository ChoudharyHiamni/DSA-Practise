import java.util.*;
public class hashmap {  
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",100);
        map.put("USA",200);
        map.put("China",300);
        System.out.println(map);
        System.out.println(map.get("India"));   //1000
        System.out.println(map.containsKey("India")); //true
        System.out.println(map.remove("China"));  //300
        System.out.println(map.size());  //2as we remove china 
        System.out.println(map.isEmpty());  //false
    }
}

// Time Complexity: O(1) for put, get, remove, containsKey, size, isEmpty
