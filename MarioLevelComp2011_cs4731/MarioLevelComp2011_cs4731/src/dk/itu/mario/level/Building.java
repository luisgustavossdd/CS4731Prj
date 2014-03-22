package dk.itu.mario.level;


public abstract class Building {
	public static Tool buildingTool;
	public int	start;
	public int	lenght;
	public int	floor;
	
	Building(int start, int lenght, int floor) {
		this.start 	= start;
		this.lenght = lenght;
		this.floor	= floor;
	}
	
	public int build(Level level) {
		return buildingTool.build(start, lenght, floor, level);
	}
}
