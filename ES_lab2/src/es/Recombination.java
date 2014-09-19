package es;

import java.util.ArrayList;

public class Recombination implements Constants {
	public static Individual recombine (Individual father, Individual mother) {
		Individual child = new Individual();
		
		if (rnd.nextDouble() < 0.5) {
			child.object = new ArrayList<Double>(father.object);
		}
		else {
			child.object = new ArrayList<Double>(mother.object);
		}
		
		for (int i = 0 ; i < NUMBER_OF_DIMENSION ; i ++) {
			double x = father.parameter.get(i), y = mother.parameter.get(i);
			child.parameter.add(x + rnd.nextDouble() * (y - x));
			//child.parameter.add(x + 0.5 * (y - x));
		}
		
		return child;
	}
}
