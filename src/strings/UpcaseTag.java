package strings;

import java.util.Locale;

public class UpcaseTag {

	public static void main(String[] args) {
		String text = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
		
		System.out.println(text);
		System.out.println(exposeUpcaseTag(text));
	}

	public static String exposeUpcaseTag(String text) {
		int closeTagIndex = text.indexOf(">");

		int openTagIndex = 0;
		if (closeTagIndex != -1) {
			openTagIndex = text.indexOf("<", closeTagIndex);
		}

		while (closeTagIndex != -1 && openTagIndex != -1) {
			String textInTag = text.substring(closeTagIndex + 1, openTagIndex);
			
			text = text.replace(textInTag, textInTag.toUpperCase(Locale.US));

            closeTagIndex = text.indexOf(">", closeTagIndex + 1);
            closeTagIndex = text.indexOf(">", closeTagIndex + 1);
            if (closeTagIndex != -1)
            {
                openTagIndex = text.indexOf("<", closeTagIndex);
            }
        }

        text = text.replace("<upcase>", "");
        text = text.replace("</upcase>", "");
        
        return text;
	}

}
