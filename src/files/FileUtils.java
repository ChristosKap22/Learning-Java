package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileUtils {
	
	private FileUtils() {
		
	}
	
	public static void WriteToFile(String input, String filePath) {
		File file = new File(filePath);
		try {
			OutputStream outputStream = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(outputStream, "utf-8");
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(input);

			bufferedWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String ReadFromFile(String filePath) {
		File file = new File(filePath);
		StringBuilder resultBuilder = new StringBuilder();
		
		try {
			InputStream inputStream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line = bufferedReader.readLine();
			while (line != null) {
				resultBuilder.append(line + "\r\n");
				line = bufferedReader.readLine();
			}

			bufferedReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resultBuilder.toString();
	}
	
}
