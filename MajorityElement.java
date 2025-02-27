import java.util.*;

public class MajorityElement {
    public static void majorityElement(int nums[]){
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
    }
    public static void main(String args[]){
        int nums[]={3,2,3,3,1};
        majorityElement(nums);
    }
}

// Time Complexity: O(nlogn)
