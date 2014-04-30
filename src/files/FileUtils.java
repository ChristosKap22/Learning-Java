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
		OutputStream outputStream = null;
		OutputStreamWriter writer = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			outputStream = new FileOutputStream(file);
			writer = new OutputStreamWriter(outputStream, "utf-8");
			bufferedWriter = new BufferedWriter(writer);
			
			bufferedWriter.write(input);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String ReadFromFile(String filePath) {
		File file = new File(filePath);
		InputStream inputStream = null;
		InputStreamReader reader = null;
		BufferedReader bufferedReader = null;
		
		StringBuilder resultBuilder = new StringBuilder();
		
		try {
			inputStream = new FileInputStream(file);
			reader = new InputStreamReader(inputStream, "utf-8");
			bufferedReader = new BufferedReader(reader);
			
			String line = bufferedReader.readLine();
			while (line != null) {
				resultBuilder.append(line + "\r\n");
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return resultBuilder.toString();
	}
	
}
