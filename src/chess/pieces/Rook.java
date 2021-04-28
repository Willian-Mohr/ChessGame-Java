package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece {

    public Rook(Board board, chess.Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        String piece = this.getClass().getSimpleName();
        return piece.substring(0, 1);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }

}
