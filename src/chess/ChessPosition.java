package chess;

import boardgame.Position;

public class ChessPosition {

    /*
     * Classe posição de xadrez (ChessPosition) vai conter regras de conversão de posição comum (de matriz) para posição de xadrez e vice e versa.
     */

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            // Erro ao instanciar ChessPosition. Os valores válidos vão de a1 a h8.
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /*
     * Converte posição de xadrez para posição comum.
     */
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    /*
     * Converte posição comum para posição de xadrez.
     */
    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

}
