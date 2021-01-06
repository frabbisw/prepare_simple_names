package test;

public class Main {
	public static void main(String [] args)
	{
		FileProcessor fileProcessor = new FileProcessor("C:\\Users\\Fazle Rabbi\\Desktop\\labels\\");
		fileProcessor.loadAndSave("train.json");
		fileProcessor.loadAndSave("test.json");
		fileProcessor.loadAndSave("valid.json");
//		fileProcessor.loadAndSave("all_pairs.json");
	}
}