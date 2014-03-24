package optimization;

public interface Individual<T> {

	public T getData();

	public double[] getVariables();

	public double[] getWeights();

	public double[] getProfits();

}
