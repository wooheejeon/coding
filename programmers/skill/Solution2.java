package skill;

import java.util.*;
import java.util.Map.Entry;

class Solution2 {
	
	public static void main(String[] args) {
		System.out.println(solution());
	}
    private static String solution() {
        String answer = "";
        
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        HashMap<String, Integer> map = new HashMap<>();
        
        for (String string : participant) {
        	map.put(string, map.getOrDefault(string, 0)+1);
		}
        
        for (String string : completion) {
			map.put(string, (map.get(string)-1));
		}
        	
        for (Entry<String, Integer> string : map.entrySet()) {
            if(string.getValue() != 0) {
            	System.out.println(string.getValue());
                answer = string.getKey();
            }
        }

        return answer;
    }
}