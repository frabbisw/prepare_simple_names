package test;

public class Main {
	public static void main(String [] args)
	{
		FileProcessor fileProcessor = new FileProcessor("/home/rabbi/Desktop/code-comment-data");
//		fileProcessor.loadAndSave("tmp.json");
//		fileProcessor.loadAndSave("test.json");
//		fileProcessor.loadAndSave("valid.json");
		fileProcessor.loadAndSave("all_pairs.json");
	}
}