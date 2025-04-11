import java.util.*;
public class hashSet {
    
    public static  void main(String args[]){
         HashSet<Integer> hs=new HashSet<>();
         hs.add(1);
         hs.add(2);
         hs.add(3);
         hs.add(1);
         hs.add(2);
         System.out.println(hs);

         if(hs.contains(2)){
            System.out.println("contains 2");
        }
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
    }
}
