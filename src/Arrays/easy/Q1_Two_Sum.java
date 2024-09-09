package Arrays.easy;
//https://leetcode.com/problems/two-sum/
public class Q1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int currentSum=nums[i]+nums[j];
                if(currentSum==target){
                    return new int[]{i,j};
                }
            }
        }


        return new int[]{};
    }


    //Time complexity-O(n*n)
}
