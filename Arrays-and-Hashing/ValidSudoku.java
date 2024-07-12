import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> sudoku = new HashSet<>();
        for (int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&& (!sudoku.add(board[i][j]+" in row "+i)||
                !sudoku.add(board[i][j]+" in column "+j)|| 
                !sudoku.add(board[i][j]+" in box "+(i/3)+(j/3))))
                {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
 * Problem Number: 36
 * Link: https://leetcode.com/problems/valid-sudoku/
 */