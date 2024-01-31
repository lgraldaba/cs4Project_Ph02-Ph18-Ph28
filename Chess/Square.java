class Square 
{
    Piece piece;
    int x, y;
    boolean isOccupied;

    public Square(int x, int y) 
    {
        this.isOccupied = false;
        this.x = x;
        this.y = y;
    }

    public boolean isOccupied() 
    {
        return isOccupied;
    }
    
    public void setPiece(Piece piece) 
    {
        this.piece = piece;
        this.isOccupied = true;
    }

    public void removePiece() 
    {
        this.piece = null;
        this.isOccupied = false;
    }

    public Piece getPiece() 
    {
        return piece;
    }

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }
}
