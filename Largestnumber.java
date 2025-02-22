public class largestnumber {
    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,6,3,5};
        System.out.println("Large number is:"+getlargest(number));
    }
}

//To find smallest number,We can do like this:
       int smallest=Integer.MAX_VALUE;
       if(smaleest>number[i]){
           smallest=number[i];
       }
//Time Complexity:O(n)
