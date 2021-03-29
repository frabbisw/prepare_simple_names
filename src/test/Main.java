package test;

public class Main {
	public static void main(String [] args)
	{
		FileProcessor fileProcessor = new FileProcessor("C:\\Users\\User\\Desktop\\code_comment\\assesment\\");
		fileProcessor.loadAndSave("train.json");
		fileProcessor.loadAndSave("test.json");
//		fileProcessor.loadAndSave("all_pairs.json");
	}
}