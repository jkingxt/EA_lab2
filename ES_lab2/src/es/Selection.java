package es;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Selection implements Constants {
	public static List<Individual> select (List<Individual> children) {
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		
		for (int i = 0 ; i < CHILDREN_POPULATION ; i ++) {
			map.put(i, Fitness.fitness(children.get(i)));
		}
		
		Set<Entry<Integer, Double>> set = map.entrySet();
        List<Entry<Integer, Double>> list = new ArrayList<Entry<Integer, Double>>(set);
        Collections.sort( list, new Comparator<Map.Entry<Integer, Double>>()
        {

			@Override
			public int compare(Entry<Integer, Double> o1,
					Entry<Integer, Double> o2) {
				// TODO Auto-generated method stub
				if (o1.getValue() > o2.getValue()) {
		            return 1;
		        } else if (o1.getValue() < o2.getValue()){
		            return -1;
		        }
		        else {
		        	return 0;
		        }
			}
        } );
		
		List<Individual> newList = new ArrayList<Individual>();
		
		for (int i = 0 ; i < PARENTS_POPULATION ; i ++) {
			newList.add(children.get(list.get(i).getKey()));
		}
		
		return newList;
	}
}
