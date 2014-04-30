package files;

public class Main {

	public static void main(String[] args) {
		
		String filePath = "file.txt";
		FileUtils.WriteToFile("Denis Rizov is\r\n22 years old", filePath);
		
		String fileContent = FileUtils.ReadFromFile(filePath);
		System.out.println(fileContent);
	}

}
