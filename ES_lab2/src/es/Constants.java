package es;

import java.util.Random;

public interface Constants {
	public Random rnd = new Random(1234);
	public static int NUMBER_OF_DIMENSION = 30;
	public static int PARENTS_POPULATION = 30;
	public static int CHILDREN_POPULATION = 200;
	public static double MUTATION_T_N = 1.0 / Math.sqrt(2.0 * PARENTS_POPULATION);
	public static double MUTATION_T = 1.0 / Math.sqrt(2.0 * Math.sqrt(PARENTS_POPULATION));
}
