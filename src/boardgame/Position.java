package boardgame;

public class Position {

    /*
     * Classe da camada de tabuleiro (boardgame) que representa as posições no tabuleiro.
     */

    private int row;
    private int column;

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }

}
