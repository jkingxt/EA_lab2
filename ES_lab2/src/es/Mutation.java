package es;


public class Mutation implements Constants {
	public static Individual mutate (Individual father) {
		Individual child = new Individual();
		//child.parameter = new ArrayList<Double>(father.parameter);
		double N = rnd.nextGaussian();
		for (int i = 0 ; i < NUMBER_OF_DIMENSION ; i ++) {
			child.parameter.add(father.parameter.get(i)*Math.exp(MUTATION_T_N * N + MUTATION_T * rnd.nextGaussian()));
		}
		
		for (int i = 0 ; i < NUMBER_OF_DIMENSION ; i ++) {
			child.object.add(father.object.get(i) + rnd.nextGaussian() * child.parameter.get(i));
		}
		
		return child;
	}
}
