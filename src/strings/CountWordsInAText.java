package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CountWordsInAText {

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very tight. "
				+ "So we are drinking all the day. We will move out of it in 5 days.";
		
		HashMap<String, Integer> wordsCounts =  countEachWork(text);
		Set<Entry<String, Integer>> entrySet = wordsCounts.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			System.out.printf("%s: %d times\n", entry.getKey(), entry.getValue());
		}
	}
	
	public static HashMap<String, Integer> countEachWork(String text) {
		String[] words = text.split("\\W+");
		
		HashMap<String, Integer> wordsCounts = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i].toLowerCase();
			
			if (wordsCounts.containsKey(currentWord)) {
				int oldCount = wordsCounts.get(currentWord);
				int newCount = oldCount + 1;
				
				wordsCounts.put(currentWord, newCount);
			} else {
				wordsCounts.put(currentWord, 1);
			}
		}
		
		return wordsCounts;
	}

}
