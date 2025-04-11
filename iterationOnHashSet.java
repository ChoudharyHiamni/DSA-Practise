import java.util.*;
public class iterationOnHashSet {
    
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add('Mumbai');
        cities.add('Banglore');

        //Iteration using iterator
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //Using for each loop
        for(String  city:cities){
            System.out.println(city);
        }
    }
}
