package es;

public class Fitness implements Constants {
	public static double fitness (Individual x) {
		double sum1 = 0, sum2 = 0;
		for (int i = 0 ; i < NUMBER_OF_DIMENSION ; i ++) {
			double value = x.object.get(i);
			sum1 += value * value;
			sum2 += Math.cos(2 * Math.PI * value);
		}
		
		return -20 * Math.exp(-0.2 * Math.sqrt((1.0 / NUMBER_OF_DIMENSION) * sum1)) - Math.exp((1.0 / NUMBER_OF_DIMENSION) * sum2) + 20 + Math.E;
	}
}
