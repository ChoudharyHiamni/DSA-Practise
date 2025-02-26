public class removeduplicatesfromsortedarray {
    public static int removeDuplicates(int arr[]){
       int j=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr[j]){
            j++;
            arr[j]=arr[i];
        }
       }
       return j+1;  //return length of unique elements
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,5,5};
         System.out.println(removeDuplicates(arr));
      
    }
}

//Time Complexity: O(n)
