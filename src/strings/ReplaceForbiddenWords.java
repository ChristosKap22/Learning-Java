package strings;

public class ReplaceForbiddenWords {

	public static void main(String[] args) {
		String text = "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.";
		String forbiddenWordsAsString = "Java, JVM, Microsoft";
		
		String[] fotbiddenWords = forbiddenWordsAsString.split("[, ]+");
		
		for (String word : fotbiddenWords) {
			StringBuilder replacementBuilder = new StringBuilder();
			for (int i = 0; i < word.length(); i++) {
				replacementBuilder.append("*");
			}
			
			text = text.replace(word, replacementBuilder.toString());
		}
		
		System.out.println(text);
	}

}
