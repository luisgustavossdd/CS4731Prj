package dk.itu.mario.level;

import java.util.ArrayList;
import java.util.List;

import optimization.Individual;
import optimization.MutationFunction;

public class LevelMutationFunction implements MutationFunction<Level> {

	@Override
	public Individual<Level> mutate(Individual<Level> individual) {
		// TODO
		Individual<Level> mutaded = new MyLevel(individual);
		return mutaded;
	}

}
