public class insertionsort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding correct ppsition to insert the current element
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}

//Time Complexity: O(n^2)
