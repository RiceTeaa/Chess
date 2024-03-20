import java.awt.*;

public class Board {
    private Piece[][] pieces = new Piece[8][8];
    public Board() {
        this.newBoard();
    }
    public Piece getPiece(int row, int col) {
        return this.pieces[row][col];
    }
    private void newBoard() {
        // black pieces
        this.pieces[0][0] = new Rook("RookB1", Color.BLACK);
        this.pieces[0][1] = new Horse("HorseB1", Color.BLACK);
        this.pieces[0][2] = new Bishop("BishopB1", Color.BLACK);
        this.pieces[0][3] = new Queen("QueenB1", Color.BLACK);
        this.pieces[0][4] = new King("KingB1", Color.BLACK);
        this.pieces[0][5] = new Bishop("BishopB2", Color.BLACK);
        this.pieces[0][6] = new Horse("HorseB2", Color.BLACK);
        this.pieces[0][7] = new Rook("RookB2", Color.BLACK);
        this.pieces[1][0] = new Pawn("PawnB1", Color.BLACK);
        this.pieces[1][1] = new Pawn("PawnB2", Color.BLACK);
        this.pieces[1][2] = new Pawn("PawnB3", Color.BLACK);
        this.pieces[1][3] = new Pawn("PawnB4", Color.BLACK);
        this.pieces[1][4] = new Pawn("PawnB5", Color.BLACK);
        this.pieces[1][5] = new Pawn("PawnB6", Color.BLACK);
        this.pieces[1][6] = new Pawn("PawnB7", Color.BLACK);
        this.pieces[1][7] = new Pawn("PawnB8", Color.BLACK);
        // white pieces
        this.pieces[7][0] = new Rook("RookW1", Color.WHITE);
        this.pieces[7][1] = new Horse("HorseW1", Color.WHITE);
        this.pieces[7][2] = new Bishop("BishopW1", Color.WHITE);
        this.pieces[7][3] = new Queen("QueenW1", Color.WHITE);
        this.pieces[7][4] = new King("KingW1", Color.WHITE);
        this.pieces[7][5] = new Bishop("BishopW2", Color.WHITE);
        this.pieces[7][6] = new Horse("HorseW2", Color.WHITE);
        this.pieces[7][7] = new Rook("RookW2", Color.WHITE);
        this.pieces[6][0] = new Pawn("PawnW1", Color.WHITE);
        this.pieces[6][1] = new Pawn("PawnW2", Color.WHITE);
        this.pieces[6][2] = new Pawn("PawnW3", Color.WHITE);
        this.pieces[6][3] = new Pawn("PawnW4", Color.WHITE);
        this.pieces[6][4] = new Pawn("PawnW5", Color.WHITE);
        this.pieces[6][5] = new Pawn("PawnW6", Color.WHITE);
        this.pieces[6][6] = new Pawn("PawnW7", Color.WHITE);
        this.pieces[6][7] = new Pawn("PawnW8", Color.WHITE);
    }
}
