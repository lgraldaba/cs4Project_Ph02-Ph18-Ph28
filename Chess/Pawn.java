public class Pawn extends Piece{
    public Pawn(String type, String color) 
    {
        super("Pawn", color);
    }
    
    public boolean isMoveValid(int initialPosX, int initialPosY, int finalPosX, int finalPosY)
    {
        int xAbsDiff = Math.abs(initialPosX - finalPosX);

        return xAbsDiff == 1;
    }
}
