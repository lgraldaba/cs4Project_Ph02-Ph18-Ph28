public class Board
{
	static Square[][] chessBoard;
    
    public Board()
    {
        chessBoard = new Square[8][8];
    }

    private void initializeBoard() 
    {
        for (int x = 0; x < 8; x++) 
        {
            for (int y = 0; y < 8; y++) 
            {
                chessBoard[x][y] = new Square(x, y);
            }
        }
    }

    public void place(Piece piece, int x, int y)
    {
        chessBoard[x][y].setPiece(piece);
    }

    public void remove(int x, int y)
    {
        chessBoard[x][y].removePiece();
    }

    public boolean isValidPosition(int x, int y)
    {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public boolean SquareIsOutOfBounds(int x, int y)
    {
        return !isValidPosition(x, y);
    }

    public void movePiece(int initialPosX, int initialPosY, int finalPosX, int finalPosY)
    {
        Piece piece = chessBoard[initialPosX][initialPosY].getPiece();
        chessBoard[finalPosX][finalPosY].setPiece(piece);
        chessBoard[initialPosX][initialPosY].removePiece();
    }


}


