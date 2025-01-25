package com.example.Chess_Game;

import com.example.Chess_Game.model.Board;
import org.springframework.stereotype.Service
@Service
public class ChessService {
    private Board board;

    public ChessService() {
        this.board = new Board();
    }

    public Board getBoard() {
        return board;
    }

    public Board makeMove(String move) {
        // Implement move logic here
        // For example, "e2e4" means move piece from e2 to e4
        return board;
    }
}