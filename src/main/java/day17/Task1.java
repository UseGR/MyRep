package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece whitePawn1 = ChessPiece.PAWN_WHITE;
        ChessPiece whitePawn2 = ChessPiece.PAWN_WHITE;
        ChessPiece whitePawn3 = ChessPiece.PAWN_WHITE;
        ChessPiece whitePawn4 = ChessPiece.PAWN_WHITE;
        ChessPiece blackQueen1 = ChessPiece.QUEEN_BLACK;
        ChessPiece blackQueen2 = ChessPiece.QUEEN_BLACK;
        ChessPiece blackQueen3 = ChessPiece.QUEEN_BLACK;
        ChessPiece blackQueen4 = ChessPiece.QUEEN_BLACK;

        ChessPiece[] array = new ChessPiece[] {whitePawn1, whitePawn2, whitePawn3, whitePawn4, blackQueen1, blackQueen2, blackQueen3, blackQueen4};

        for (ChessPiece figures : array)
            System.out.print(figures + " ");
    }
}