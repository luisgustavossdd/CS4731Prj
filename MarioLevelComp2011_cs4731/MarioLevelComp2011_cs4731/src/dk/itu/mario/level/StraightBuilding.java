package dk.itu.mario.level;


public class StraightBuilding extends Building {
	public StraightBuilding(int start, int length, int floor) {
		super(start,length,floor);
		buildingTool = new StraightBuildingTool();
	}

	public Building getCopy() {
		return new StraightBuilding(this.start,this.lenght,this.floor);
	}

	@Override
	public int build(MyLevel level) {
		return buildingTool.build(start, lenght, floor, level);
	}

	@Override
	public double getWeight() {
		return 10;
	}

	@Override
	public double getProfit() {
		return 7;
	}

	@Override
	public double[] getWeights() {
		double[] result = {2.5,2.5,2.5,2.5};
		return result;
	}

	@Override
	public double[] getProfits() {
		double[] result = {7,7,7,7};
		return result;
	}

}
