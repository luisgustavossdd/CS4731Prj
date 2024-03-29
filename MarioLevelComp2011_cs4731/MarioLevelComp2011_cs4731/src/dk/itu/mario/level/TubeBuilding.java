package dk.itu.mario.level;


public class TubeBuilding extends Building {

	public TubeBuilding(int start, int lenght, int floor) {
		super(start, lenght, floor);
		buildingTool = new TubeBuildingTool();
	}

	public Building getCopy() {
		return new TubeBuilding(this.start,this.lenght,this.floor);
	}

	@Override
	public int build(MyLevel level) {
		return buildingTool.build(start, lenght, floor, level);
	}

	@Override
	public double getWeight() {
		return 12;
	}

	@Override
	public double getProfit() {
		return 9;
	}

	@Override
	public double[] getWeights() {
		double[] result = {3,3,3,3};
		return result;
	}

	@Override
	public double[] getProfits() {
		double[] result = {9,9,9,9};
		return result;
	}

}
