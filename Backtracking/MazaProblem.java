// package Backtracking;

public class MazaProblem {
    public static void main(String[] args) {
        System.out.println(mazeCount(3, 3));
        
        mazePrintPath("", 3, 3);
    }

    static int mazeCount(int r, int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }
        int left = mazeCount(r-1,c);
        int right = mazeCount(r, c-1);
        return left + right;
    }

    static void mazePrintPath(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        
        if(r > 1)
        {
            mazePrintPath(p + "D", r-1, c);
        }
        if(c > 1)
        {
            mazePrintPath(p + "R", r, c-1);
        }
        //for diagonal path
        if(r > 1 && c >1)
        {
            mazePrintPath(p + "d", r-1, c-1);
        }
    }
}
