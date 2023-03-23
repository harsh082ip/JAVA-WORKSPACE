import java.util.Arrays;

/*
 
    Horizontal ----> Rows
    Vertical   ----> Columns

    Here, In this Question The Array is Sorted in row-wise and col-wise manner
 */

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50},
        };
        int target = 37;
        System.out.println(Arrays.toString(_2dBinarySearch(arr, target)));
    }

    static int[] _2dBinarySearch(int[][] matrix, int target)
    {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == target)
            {
                return new int[]{row,col};
            }
            if(matrix[row][col] < target)
            {
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
