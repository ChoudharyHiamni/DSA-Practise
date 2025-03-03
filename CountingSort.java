public class countingsort {
  
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=1;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        countingSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}

//Time Complexity: O(n+k) where n is the number of elements in input array and k is the range of input.
