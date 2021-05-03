package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    /*
     * ChessPiece (Peça de xadrez) é uma subclasse da classe Piece, ou seja, representa as peças do tabuleiro.
     */

    private chess.Color color;
    private int moveCount;

    public ChessPiece(Board board, chess.Color color) {
        super(board);
        this.color = color;
    }

    public chess.Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    /*
     * Metodo responsável por converter a posição comum para uma posição de xadrez.
     */
    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    /*
     * Existe uma peça adversária na posição?
     */
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    /*
     * Metodo responsável por somar a quantidade de movimentos da peça.
     */
    public void increaseMoveCount() {
        moveCount++;
    }

    /*
     * Metodo responsável por subtrair a quantidade de movimentos da peça.
     */
    public void decreaseMoveCount() {
        moveCount++;
    }

}
