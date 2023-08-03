package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMain {


	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Produto> list = new ArrayList<>();
		
		System.out.println("enter Caminho");
		
		String sourceFilestr  = sc.nextLine();
		
		File sourceFile = new File(sourceFilestr);
		
		String sourceFolder = sourceFile.getParent();
		
		
		System.out.println(sourceFolder);
		
		boolean sucess = new File(sourceFolder +"//out").mkdir();
		System.out.println("Folder Created "+sucess);
		
		String targetFile = sourceFolder+ "//out/summary.csv";
		
		try(BufferedReader br =new  BufferedReader(new FileReader(sourceFile))){
				String itemcsv = br.readLine();
				
				while(itemcsv != null) {
					System.out.println(itemcsv);
					
					itemcsv = br.readLine();
				}
			
		}
	     catch(IOException e) {
	    	 System.out.println(e);
		}
		
		sc.close();
	}
}
