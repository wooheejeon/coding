package test;

import java.util.*;
import java.util.Map.Entry;

class final_test2 {
	
	public static void main(String[] args) {
		

		String[] str = {"penpineapple", "applepen"};
		String[] find_str = {"apple", "pen"};
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < find_str.length; j++) {
				
				if(str[i].contains(find_str[j])) {
					map.put(find_str[j], find_str[j].length());
				}
			}
			
		}
		int maxValueInMap = Collections.max(map.values());

		for (Entry<String, Integer> entry : map.entrySet()) { 
			if (entry.getValue()==maxValueInMap) { 
				System.out.println(entry.getKey()); // Print the key with max value 
			} 
		}
		
		return;
		
	}
	
	
    private static String timon_test1() {
    	
        String answer = "";
        
        String[] str = {"penpineapple", "applepen"};
		String[] find_str = {"apple", "pen"};
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < find_str.length; j++) {
				
				if(str[i].contains(find_str[j])) {
					map.put(find_str[j], find_str[j].length());
				}
			}
			
		}
		
		int maxValueInMap = Collections.max(map.values());

		for (Entry<String, Integer> entry : map.entrySet()) { 
			if (entry.getValue()==maxValueInMap) { 
				answer = entry.getKey(); 
			} 
		}

        return answer;
    }


}