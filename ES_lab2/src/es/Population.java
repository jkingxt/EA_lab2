package es;

import java.util.ArrayList;
import java.util.List;

public class Population implements Constants {
	public List<Individual> population;
	public double best;
	public Population() {
		best = Double.MAX_VALUE;
		population = new ArrayList<Individual>();
	}
	
	public void init () {
		population.clear();
		for (int i = 0 ; i < PARENTS_POPULATION ; i ++) {
			Individual one = new Individual();
			one.init();
			population.add(one);
			best = Math.min(best, Fitness.fitness(one));
		}
	}
	
	public void setPopulation (List<Individual> p) {
		population.clear();
		population = new ArrayList<Individual>(p);
		best = Double.MAX_VALUE;
		for (int i = 0 ; i < PARENTS_POPULATION ; i ++) {
			best = Math.min(best, Fitness.fitness(population.get(i)));
		}
	}
}
