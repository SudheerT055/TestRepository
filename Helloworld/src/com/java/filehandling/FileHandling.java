package com.java.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("/home/sudheert/Sudheer/JavaFileHandling/myfile.txt");
		if (!f.exists()) {
			f.createNewFile();
		}

		FileWriter fw = new FileWriter(f,true);
		fw.write("\nhai.. this is sudheer\n");
		fw.write("hai.. this is sudheer");
		fw.flush();
		fw.close();
		fileReader(f);

	}
	public static void fileReader(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line = br.readLine()) !=  null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
