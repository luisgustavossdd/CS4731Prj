package dk.itu.mario.level;

import dk.itu.mario.level.generator.PlayerStyle;
import optimization.CrossoverFunction;
import optimization.EvaluationFunction;
import optimization.GeneticAlgorithm;
import optimization.GeneticAlgorithmProblem;
import optimization.MultiKnapsackEvaluationFunction;
import optimization.StandardKnapsackEvaluationFunction;
import optimization.MutationFunction;
import optimization.OptimizationAlgorithm;
import optimization.OptimizationProblem;
import optimization.Trainer;


public class LevelGenerator {
	public static final double	MAX_WEIGHT = 320;
	public static final int		ITERATIONS = 10;
	
	public static	EvaluationFunction<MyLevel>		evalFn;
	public static	OptimizationProblem<MyLevel>	optimizationProblem;
	public static 	OptimizationAlgorithm<MyLevel>	optimizationAlgorithm;
	public static 	MutationFunction<MyLevel>		mutationFn;
	public static 	CrossoverFunction<MyLevel>		crossoverFn;
	
	private static	LevelGenerator					singleton;
	
	private LevelGenerator(double[] ratios) {
		
		int		population		= 200;
		double	replacementRate	= 0.60, 
				mutationRate	= 0.20;
		
		mutationFn	= new LevelMutationFunction();
		crossoverFn = new LevelCrossoverFunction();
//		evalFn		= new StandardKnapsackEvaluationFunction<MyLevel>(MAX_WEIGHT);
		evalFn		= new MultiKnapsackEvaluationFunction<MyLevel>(MAX_WEIGHT,ratios);

		optimizationProblem		= new GeneticAlgorithmProblem<MyLevel>(evalFn,mutationFn,crossoverFn);
		optimizationAlgorithm	= new GeneticAlgorithm<MyLevel>(population, replacementRate, mutationRate, optimizationProblem);
	}
	
	static void init(double[] ratios){
		if(singleton != null) return;
		else singleton = new LevelGenerator(ratios);
	}
	
	public static MyLevel create(PlayerStyle style, double[] ratios) {
		init(ratios);
		
		Trainer.train(optimizationAlgorithm,ITERATIONS);
		MyLevel result = (optimizationAlgorithm.getOptimal().getData());
		return result;
	}
}
