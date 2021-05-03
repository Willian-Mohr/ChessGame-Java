package boardgame;

public abstract class Piece {

    /*
     * Classe da camada tabuleiro (boardgame) e representa as peças do tabuleiro.
     */

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    /*
     *  Metodo é abstrato pois todas a peças precisam ter a possibilidade de se mover (Metodo vai ser implementado na classe chess.pieces.<peça>)
     */
    public abstract boolean[][] possibleMoves();

    /*
     * Metodo concreto que realiza um gancho (hook method) com a possibleMoves() para verificar as posições possivéis.
     */
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    /*
     * Existe qualquer movimento possível?
     */
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
