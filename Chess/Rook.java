public class Rook extends Piece
{
    public Rook(String type, String color) 
    {
        super("Rook", color);
    }
    
    public boolean isMoveValid(int initialPosX, int initialPosY, int finalPosX, int finalPosY)
    {
        int xAbsDiff = Math.abs(initialPosX - finalPosX);
        int yAbsDiff = Math.abs(initialPosY - finalPosY);

        return (xAbsDiff > 0 && yAbsDiff == 0) || (xAbsDiff == 0 && yAbsDiff > 0);
    }
}




    