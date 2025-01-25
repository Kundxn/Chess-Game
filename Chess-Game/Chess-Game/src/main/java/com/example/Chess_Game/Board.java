package com.example.chessgame.model;

public class Board {
    private String[][] board;

    public Board() {
        this.board = new String[8][8];
        // Initialize board with pieces
        // For simplicity, let's use "P" for pawn, "R" for rook, etc.
        // Empty squares can be represented by "."
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    // Add methods to handle moves, check game state, etc.
}
