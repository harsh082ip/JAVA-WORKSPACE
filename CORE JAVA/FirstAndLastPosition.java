import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,4,15,17,17,17,17,17,19,20};
        int target = 17;
        int[] ans = new int[2];
        ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    /*
     One more Method of Doing This....
     public int[] searchRange(int[] nums, int target) {
        int[] fin = {-1,-1};
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                fin[0] = i;
                while(i < nums.length && nums[i] == target)
                {
                    fin[1] = i;
                    i++;
                }
                break;
            }
        }
        return fin;
    }
     */
}