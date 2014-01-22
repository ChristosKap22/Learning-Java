package conditionalStatements;

import java.util.ArrayList;
import java.util.List;

public class SubsetsWithZeroSum {

	public static void main(String[] args) {
		int[] set = { -1, 1, 0, -2, 3 };
		
		int subsetsCount = (int) Math.pow(2, set.length);
		int[] allSubsets = new int[subsetsCount];
		for (int i = 0; i < subsetsCount; i++) {
			allSubsets[i] = i;
		}
		
		List<Integer> subsetsWithZeroSum = new ArrayList<Integer>();
		for (int subsetIndex = 0; subsetIndex < allSubsets.length; subsetIndex++) {
			int sum = 0;
			int currentSubset = allSubsets[subsetIndex];
			
			for (int i = 0; i < set.length; i++) {
				if (((currentSubset >> i) & 1) == 1) {
					sum += set[set.length - i - 1];
				}
			}
			
			if (sum == 0) {
				subsetsWithZeroSum.add(currentSubset);
			}
		}
		
		printSubsets(subsetsWithZeroSum, set);
	}
	
	private static void printSubsets(List<Integer> subsets, int[] set) {
		for (int i = 0; i < subsets.size(); i++) {
			int currentSubset = subsets.get(i);
			StringBuilder subsetBuilder = new StringBuilder();
			subsetBuilder.append("{ ");
			
			for (int j = 0; j < set.length; j++) {
				if (((currentSubset >> j) & 1) == 1) {
					subsetBuilder.append(set[set.length - j - 1] + " ");
				}
			}
			
			subsetBuilder.append("}");
			System.out.println(subsetBuilder.toString());
		}
	}

}
