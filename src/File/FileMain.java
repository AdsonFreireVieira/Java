package File;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {


	public static void main(String [] args){
		
		//Path diretorio = Paths.get("C:/Users/adson/OneDrive/Documentos/Projeto");
	    Path arquivo = Paths.get("C:/Users/adson/OneDrive/Documentos/Projeto/Documento4.doc");
		
		if(Files.isDirectory(arquivo)) {
			System.out.println("diretorio  Existe");
		}
		
		else if(Files.exists(arquivo)){
			
			System.out.println("E arquivo");
		}
	}
}
