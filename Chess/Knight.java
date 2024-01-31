public class Knight extends Piece
{

    public Knight(String type, String color) 
    {
        super("Knight", color);
    }
    
    public boolean isMoveValid(int initialPosX, int initialPosY, int finalPosX, int finalPosY)
    {
        int xAbsDiff = Math.abs(initialPosX - finalPosX);
        int yAbsDiff = Math.abs(initialPosY - finalPosY);

        return (xAbsDiff == 2 && yAbsDiff == 1) || (xAbsDiff == 1 && yAbsDiff == 2);
    }
}
