public class sudoku {
    public static void main(String[] args) {
        int [][] board=new int[][]{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };
    if(solve(board)){
        display(board);
    }
    else{
        System.out.println("Sudoku can't be solved");
    }
    }
    static boolean solve(int [][] board){
        int row=-1;
        int col=-1;
        boolean isEmpty=true;
        // check for place if no. is present there or not
        for (int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    isEmpty= false;
                    break;
                }
            }
            if(isEmpty==false){
                break;
            }
        }
            
            if(isEmpty==true){
                return true;
            }
            // for backtracking
            for(int num=1; num<=9; num++){
                if(isSafe(board, row, col, num)){
                    board[row][col]=num;
                    if(solve(board)){
                        return true;
                    }
                    else{
                        board[row][col]=0;
                    }
                }
            }
            return false;
        }
      
    static boolean isSafe(int [][] board, int row, int col, int num){
        // check for row
        for(int i=0; i<board.length; i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int i=0; i<board.length; i++){
            if(board[i][col]==num){
                return false;
            }
        }
        int sqrt= (int)(Math.sqrt(board.length));
        int rowStart= row-row%sqrt;
        int colStart= col-col%sqrt;
        for(int i=rowStart; i<rowStart+sqrt; i++){
            for(int j=colStart; j<colStart+sqrt; j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;

    }
    // for displaying
    static void display(int [][] board){
        for(int []row:board){
            for(int num:row){
                    System.out.print(num+" ");   
            }
            System.out.println();
        }
    }
    
}
