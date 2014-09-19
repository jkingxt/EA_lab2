package es;

import java.util.ArrayList;
import java.util.List;

public class Run implements Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Population all = new Population();
		List<Individual> children = new ArrayList<Individual>();
		List<Individual> childrenAfterMutation = new ArrayList<Individual>();
		
		double[] value = new double[10];
		double sum =0;
		for (int k = 0 ; k < 10 ; k ++) {
			all.init();
			for (int j = 0 ; j < 1000 || all.best == 0 ; j ++) {
				children.clear();
				for (int i = 0 ; i < CHILDREN_POPULATION ; i ++) {
					children.add(Recombination.recombine(all.population.get(rnd.nextInt(PARENTS_POPULATION)), all.population.get(rnd.nextInt(PARENTS_POPULATION))));
				}
				
				childrenAfterMutation.clear();
				for (int i = 0 ; i < CHILDREN_POPULATION ; i ++) {
					childrenAfterMutation.add(Mutation.mutate(children.get(i)));
				}
				all.setPopulation(Selection.select(childrenAfterMutation));
			}
			System.out.println(all.best);
			value[k] = all.best;
			sum += value[k];
		}
		
		double mean = sum / 10.0;
		double sum2 = 0;
		for (int i = 0 ; i < 10 ; i ++) {
			sum2 += (value[i] - mean) * (value[i] - mean);
		}
		double deviation = Math.sqrt(sum2 / 10);
		System.out.println("Mean:" + mean);
		System.out.println("Deviation:" + deviation);
	}

}
