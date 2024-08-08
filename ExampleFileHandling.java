package com.tech.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileHandling {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Admin\\Desktop\\FileHandling\\Hello.txt";
		File file = new File(path);
		FileWriter writer=new FileWriter(file,true);
		writer.write("Arvind Pawar");
		writer.write("A");
		writer.write("Abarao Chavan");
		writer.flush();
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getName());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.toPath());
		System.out.println(file.exists());

		String path1 = "C:\\Users\\Admin\\Desktop\\FileHandling\\Hello1.txt";
		File file1 = new File(path1);
		try {
			file1.createNewFile();
			System.out.println("File Created");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String path2 = "C:\\Users\\Admin\\Desktop\\Welcome";
		File file2 = new File(path2);
		System.out.println(file2.mkdir());

		String path3 = "C:\\Users\\Admin\\Desktop\\FileHandling";
		File file3 = new File(path3);
		String [] list = file3.list();
		for(String f: list) {
			System.out.println(f);
		}
	}

}
