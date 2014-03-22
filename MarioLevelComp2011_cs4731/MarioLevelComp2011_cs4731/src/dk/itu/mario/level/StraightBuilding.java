package dk.itu.mario.level;

public class StraightBuilding extends Building {
	public StraightBuilding(int start, int length, int floor) {
		super(start,length,floor);
	}

	static {
		buildingTool = new StraightBuildingTool();
	}
	
}
