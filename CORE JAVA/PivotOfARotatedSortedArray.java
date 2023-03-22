public class PivotOfARotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {3,4,5,6,7,0,1,2};
        System.out.println(findPivot(nums));
    }

    static int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            // Descending order 
            if(mid < end && nums[mid] > nums[mid+1])
            {
                return nums[mid];
            }
            if(mid > start && nums[mid] < nums[mid-1])
            {
                return nums[mid - 1];
            }
            if(nums[mid] <= nums[start])
            {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
