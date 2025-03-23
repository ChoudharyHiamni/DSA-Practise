import java.util.*;
public class stackusingcollectionframework {
    
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

//Time Complexity: O(1) for push, pop and peek operations.
