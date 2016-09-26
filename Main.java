package net.ukr.geka3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get file by console input
		File file = GetFileData.getFile();
		if (file == null) {
			System.out.println("you wrote exit.");
			return;
		}
		ArrayList<MyChar> ALMyChar = new ArrayList<MyChar>();
		FileReader fr;

		try {
			fr = new FileReader(file);
			int temp;

			for (; (temp = fr.read()) != -1;) {
				char tempChar = (char) temp;
				
				MyChar tempMyChar = new MyChar(tempChar);
				
				if(ALMyChar.contains(tempMyChar)){
					//System.out.println("exist");
					tempMyChar.plusOne();
					ALMyChar.get(ALMyChar.indexOf(tempMyChar)).plusOne();;
					
				}else{
					//System.out.println("not exist");
					ALMyChar.add(tempMyChar);
				}
				
				


			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("result " + HSMyChar);
		Collections.sort(ALMyChar,new LetterComparator());
		for (MyChar myChar : ALMyChar) {
			System.out.println(myChar.getCh() + " " + myChar.getCount() + ".");
		}

	}

}
