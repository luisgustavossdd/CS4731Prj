package optimization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Distribution<T> {
	public static <T> List<Individual<T>> sample(List<Individual<T>> collection, double[] probabilities, int samples) {
		int	length	=	collection.size();
		List<Individual<T>> result = new ArrayList<Individual<T>>();
		
		for(int sample = 0; sample < samples; sample++) {
			double rndValue = (new Random()).nextDouble();
			double accumulatedValue = 0;
			for(int i  = 0; i < length; i++) {
				accumulatedValue += probabilities[i];
				if(accumulatedValue > rndValue) {
					result.add(collection.get(i));
					break;
				}
			}
		}
		return result;
	}
	public static <T> Individual<T> sample(List<Individual<T>> collection, double[] probabilities) {
		int	length	=	collection.size();
		Individual<T> result = null;
		
		double rndValue = (new Random()).nextDouble();
		double accumulatedValue = 0;
		for(int i  = 0; i < length; i++) {
			accumulatedValue += probabilities[i];
			if(accumulatedValue > rndValue) {
				result = collection.get(i);
				break;
			}
		}
		return result;
	}
}
