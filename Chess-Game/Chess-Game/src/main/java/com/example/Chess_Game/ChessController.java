package com.example.Chess_Game;

import com.example.chessgame.model.Board;
import com.example.chessgame.service.ChessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chess")
public class ChessController {

    @Autowired
    private ChessService chessService;

    @GetMapping("/board")
    public Board getBoard() {
        return chessService.getBoard();
    }

    @PostMapping("/move")
    public Board makeMove(@RequestParam String move) {
        return chessService.makeMove(move);
    }
}