import javax.sound.sampled.SourceDataLine;

/* 
 When comes to counting the No. of Rotations in a Rotated Sorted Array,
 it can be seen that no. of rotations is equal to nothing but pivot[index] + 1;

 example:- {15,18,2,3,6,12}
 here the pivot element is 18, and it's index in 1, 
 so the no. of Rotations will be pivotElement[index] + 1 i.e. 2

*/

public class CountRotationsInA_RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {15,18,19,2,3,6,12};
        System.out.println("No. of Rotations are: " + NoOfRotations(arr));
    }


static int NoOfRotations(int[] arr)
{
    int PivotElementIndex = pivotElement(arr);
    System.out.println(PivotElementIndex);
    return PivotElementIndex + 1;
}

// Use this func() when there are no duplicate elements in the array
static int pivotElement(int[] arr)
{
    int start = 0;
    int end = arr.length-1;
   while (start <= end) {
        int mid = start + (end - start) / 2;
        // 4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid-1;
        }
        if (arr[mid] <= arr[start]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return -1;
}

// Used this func() when array is having duplicate elements
static int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        // 4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid-1;
        }

        // if elements at middle, start, end are equal then just skip the duplicates
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            // skip the duplicates
            // NOTE: what if these elements at start and end were the pivot??
            // check if start is pivot
            if (start < end && arr[start] > arr[start + 1]) {
                return start;
            }
            start++;

            // check whether end is pivot
            if (end > start && arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        }
        // left side is sorted, so pivot should be in right
        else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}
}

