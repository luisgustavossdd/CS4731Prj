package dk.itu.mario.level;

public class EndBuilding extends Building {

	EndBuilding(int start, int lenght, int floor) {
		super(start, lenght, floor);
	}
	
	static {
		buildingTool = new EndBuildingTool();
	}
}
