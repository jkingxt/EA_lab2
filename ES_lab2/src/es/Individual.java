package es;

import java.util.ArrayList;
import java.util.List;

public class Individual implements Constants {
	public List<Double> object;
	public List<Double> parameter;
	
	public Individual() {
		object = new ArrayList<Double>();
		parameter = new ArrayList<Double>();
	}
	
	public void init () {
		object = new ArrayList<Double>();
		parameter = new ArrayList<Double>();
		for (int i = 0 ; i < NUMBER_OF_DIMENSION ; i ++) {
			object.add((rnd.nextDouble() - 0.5) * 60);
		}
		
		for (int i = 0 ; i < NUMBER_OF_DIMENSION ; i ++) {
			parameter.add(rnd.nextDouble());
			//parameter.add(3.0);
		}
	}
}
