package net.ukr.geka3;

import java.io.File;
import java.util.Scanner;

public class GetFileData {

	public static File getFile(){
		File dir = new File(".");
		File[] arrayFile = dir.listFiles();
		System.out.println("write file name from:");
		for (File file : arrayFile) {
			if (file.isFile()) {

				System.out.println(file.getName());
			}
		}
		Scanner sc = new Scanner(System.in);
		String fileName = null;
		for(;!(fileName = sc.nextLine()).equals("exit");){
			System.out.println("you write " + fileName);
			File file = new File(fileName);
			if(file.isFile()){
				return file;
			}
			System.out.println("wrong file, try again");
		}
		return null;
		
		
		
	}
	
}
