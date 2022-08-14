class Solution {
    public void solveSudoku(char[][] board) {
    
    if(board==null || board.length==0) return;
    
    solve(board);
        
        
    }
    public boolean solve(char[][] board) {
        
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++) {
                if(board[r][c]=='.'){
                    for(char num='1';num<='9';num++) {
                        
                        if(isSafe(board,r,c,num)){
                            board[r][c] =num;
                            if(solve(board)) return true;
                            board[r][c] ='.'; 
                        }



                    }

                    return false;
                }
                
            }
        }

        return true;
    }
    public boolean isSafe(char board[][], int r, int c,char num){
            //check row safe
            for(int i=0;i<9;i++){
                if(board[r][i]==num)return false;
            }
            // check column safe
            for(int i=0;i<9;i++){
                if(board[i][c]==num) return false;
            }

            // check square box
            int nr=(r/3)*3;
            int nc=(c/3)*3;

            for(int i=nr;i<nr+3;i++){
                for(int j=nc;j<nc+3;j++){
                    if(board[i][j]==num) return false;
                }
            }

            return true;
            
    }
}
