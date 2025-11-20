package org.example.problems.arrays;

/*
    You are given a 9 x 9 Sudoku board 'board'. A Sudoku board is valid if the following rules are followed:

        Each row must contain the digits 1-9 without duplicates.
        Each column must contain the digits 1-9 without duplicates.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.

    Return true if the Sudoku board is valid, otherwise return false
 */

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colMap = new HashMap<>();
        HashMap<String, HashSet<Character>> squareMap = new HashMap<>(); // key = (rowMap / 3, colMap / 3)

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] != '.') {

                    String squareKey = (row / 3) + "," + (col / 3);
                    if (rowMap.computeIfAbsent(row, key -> new HashSet<>()).contains(board[row][col]) ||
                        colMap.computeIfAbsent(col, key -> new HashSet<>()).contains(board[row][col]) ||
                        squareMap.computeIfAbsent(squareKey, key -> new HashSet<>()).contains(board[row][col])) {
                        return false;
                    }

                    rowMap.get(row).add(board[row][col]);
                    colMap.get(col).add(board[row][col]);
                    squareMap.get(squareKey).add(board[row][col]);
                }
            }
        }

        return true;
    }
}
