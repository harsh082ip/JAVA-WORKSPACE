import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3, 78, 9, 88, 73, 73, 15, 19, 20};
        int target = 73;
        System.out.println(linearsearch(arr, target, 0));
        System.out.println(findIndexStart(arr, target, 0));
        System.out.println(findIndexEnd(arr, target, arr.length-1));
        findAllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(findallIndex(arr, target, 0, new ArrayList<>()));
        System.out.println(findallIndex2(arr, target, 2));
    }
    static boolean linearsearch(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || linearsearch(arr, target, index + 1);
    }
    static int findIndexStart(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        return findIndexStart(arr, target, index + 1);
    }
    static int findIndexEnd(int[] arr, int target, int index)
    {
        if(index == 0)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        return findIndexEnd(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findallIndex(int[] arr, int target, int index, ArrayList<Integer> ls)
    {
        if(index == arr.length)
        {
            return ls;
        }
        if(arr[index] == target)
        {
            ls.add(index);
        }
        return findallIndex(arr, target, index + 1, ls); 
    }

    static ArrayList<Integer> findallIndex2(int[] arr, int target, int index)
    {
        ArrayList<Integer> lis = new ArrayList<>();
        if(index == arr.length)
        {
            return lis;
        }
        if(arr[index] == target)
        {
            lis.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findallIndex2(arr, target, index + 1);
        lis.addAll(ansFromBelowCalls);

        return lis;
    }
}
