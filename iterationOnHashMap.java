import java.util.HashMap;
import java.util.Set;

public class iterationOnHashMap {
    public static void main(String args[]){
         HashMap<String,Integer> map=new HashMap<>();
        map.put("India",100);
        map.put("USA",200);
        map.put("China",300);
       
        //Iteration 
       Set<String>keys=map.keySet();
       System.out.println(keys);

       for(String k:keys){
        System.out.println("Key="+ k+",value=" + map.get(k));
    }
    }
}

// Time Complexity: O(n) where n is the number of keys in the map
