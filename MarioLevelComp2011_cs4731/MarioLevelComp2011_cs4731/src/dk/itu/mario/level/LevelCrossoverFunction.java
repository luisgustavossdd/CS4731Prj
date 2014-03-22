package dk.itu.mario.level;

import java.util.ArrayList;
import java.util.List;

import optimization.CrossoverFunction;
import optimization.Individual;

public class LevelCrossoverFunction implements CrossoverFunction<Level> {

	@Override
	public List<Individual<Level>> mate(Individual<Level> father, Individual<Level> mother) {
		List<Individual<Level>> offspring = new ArrayList<Individual<Level>>();
		//TODO
		offspring.add(father);
		offspring.add(mother);
		return offspring;
	}

}
