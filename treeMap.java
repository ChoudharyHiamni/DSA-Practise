public class treeMap {
    
    public static void main(String args[]){
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",200);
        tm.put("US",300);
        System.out.println(tm);   //Print outptu based on keys order that give sorted order based on keys
    } 
}
