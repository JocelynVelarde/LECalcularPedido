package Procesos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//ADAPTAR

public class MaptoArrayList {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("CPrueba", 30);
		compMap.put("CPrueba Man", 10);
		compMap.put("DPrueba", 10);
		compMap.put("DPrueba 3", 40);
		
		System.out.println(" comp map size: " + compMap.size());
		
		Iterator it = compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println( pairs);
			
		}
		
		//convert hashmap keys into ArrayList
		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		//PRINTS 
		for(String t : compNamesList) {
			System.out.println(t);
		}
		
		//convert hashmap values into ArrayList:
		List<Integer> EmpValuesList = new ArrayList<Integer>(compMap.values());
		
		
		
		
	}
	
}


