package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece blackRook = ChessPiece.ROOK_BLACK;
        ChessPiece blackQueen = ChessPiece.QUEEN_BLACK;
        ChessPiece whiteRook = ChessPiece.ROOK_WHITE;
        ChessPiece blackPawn = ChessPiece.PAWN_BLACK;
        ChessPiece blackKing = ChessPiece.KING_BLACK;
        ChessPiece blackKnight = ChessPiece.KNIGHT_BLACK;
        ChessPiece whiteBishop = ChessPiece.BISHOP_WHITE;
        ChessPiece blackBishop = ChessPiece.BISHOP_BLACK;
        ChessPiece whitePawn = ChessPiece.PAWN_WHITE;
        ChessPiece whiteKing = ChessPiece.KING_WHITE;
        ChessPiece whiteQueen = ChessPiece.QUEEN_WHITE;
        ChessPiece empty = ChessPiece.EMPTY;

        ChessPiece[][] chessPieces = {{blackRook,empty,empty,empty,empty,blackRook,blackQueen,empty},
                {empty, whiteRook, empty, empty,blackPawn,blackPawn, empty, blackPawn},
                {blackPawn, empty, blackKnight,empty,empty,empty,blackPawn,empty,blackPawn},
                {blackKing,empty,empty,whiteBishop,empty,empty,empty,empty},
                {empty,empty,empty,blackBishop,whitePawn,empty,empty,empty},
                {empty,empty,empty,empty,whiteBishop,whitePawn,empty,empty},
                {whitePawn,empty,empty,whiteKing,empty,whitePawn,empty,whitePawn},
                {empty,empty,empty,empty,empty,whiteRook,whiteQueen,empty}
            };
        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.print();
    }
}
