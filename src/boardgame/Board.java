package boardgame;

public class Board {

    /*
     * Classe da camada tabuleiro (boardgame) e representa o tabuleiro do xadrez.
     */

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        if (rows < 1 || columns < 1) {
            //Erro ao criar tabuleiro: deve haver pelo menos 1 linha e 1 coluna.
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            // A posição não está no tabuleiro.
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    /*
     * Metodo que retorna a peça com base no parametro
     */
    public Piece piece(Position position) {
        if (!positionExists(position)) {
            // A posição não está no tabuleiro.
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    /*
     * Metodo responsável por colocar a peça no tabuleiro.
     */
    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            // Já existe uma peça na posição.
            throw new BoardException("There is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    /*
     * Metodo para remover uma peça
     */
    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            // A posição não está no tabuleiro.
            throw new BoardException("Position not on the bord");
        }
        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    /*
     * Essa posição existe (positionExists)?
     */
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    /*
     * Tem uma peça nessa posição (thereIsAPiece)?
     */
    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            // A posição não está no tabuleiro.
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}
