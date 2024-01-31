public abstract class Piece
{
	String type, color;

	public Piece(String type, String color)
	{
		this.type = type;
		this.color = color;
	}

    public String getType() 
	{
		return type;
	}

	public String getColor() 
	{
		return color;
	}
}
