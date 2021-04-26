package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	private chess.Color color;

	public ChessPiece(Board board, chess.Color color) {
		super(board);
		this.color = color;
	}

	public chess.Color getColor() {
		return color;
	}

}
