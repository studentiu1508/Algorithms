
//Move Zeros to the end of Array In Place


public class Solution {
    
    public void moveZeroes(int[] nums) {
      
  
     for( int i = 0 ; i < nums.length-1 ; i++)  {
          int zeroTracker = i;
         
         if(nums[i]==0) {
             
             while ( zeroTracker < nums.length-1 && nums[zeroTracker] == 0){
                        
                        zeroTracker ++;                 
                 
             }
             
             nums = swapNumbers(nums , i ,zeroTracker);
             //zeroTracker++;
         }
         
     }
        
    }
    
    public static int[] swapNumbers(int[] nums, int i , int j){
        
        int temp = nums[i];
        nums[i] =  nums[j];
        nums[j] = temp;
        return nums;
    }
}