public class King extends Piece{

    public King(String type, String color) 
    {
        super("King", color);
    }
    
    public boolean isMoveValid(int initialPosX, int initialPosY, int finalPosX, int finalPosY)
    {
        int xAbsDiff = Math.abs(initialPosX - finalPosX);
        int yAbsDiff = Math.abs(initialPosY - finalPosY);

        return xAbsDiff > 1 && yAbsDiff > 1;
    }
}




    

