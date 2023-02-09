package org.example.backtracking;

public class WordSearch {

    boolean [][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean [board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++)
                if (dfs(i, j, 0, board, word)) return true;
        }return false;
    }


    private boolean dfs(int row, int col, int index, char [][] board, String word){
        if (index == word.length()) return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
                visited[row][col] || board[row][col] != word.charAt(index)) return false;
        visited[row][col] = true;
        boolean res = (dfs(row + 1, col, index + 1, board, word)) ||
                (dfs(row, col + 1, index + 1, board, word)) ||
                (dfs(row - 1, col, index + 1, board, word)) ||
                (dfs(row, col - 1, index + 1, board, word));
        visited[row][col] = false;
        return res;
    }
}
