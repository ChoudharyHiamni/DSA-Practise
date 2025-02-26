public class movezeroes {
    public static void moveZeroes(int arr[]){
        int j=0;  //pointer to track for position of non zero element
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String args[]){
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
    }
}

// Time Complexity: O(n) where n is the number of elements in input array.
