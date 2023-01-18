package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileOpener {
	
	JFileChooser filechooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	
	public File escoger() throws FileNotFoundException {
		
		if (filechooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			
			File file = filechooser.getSelectedFile();
			System.out.println(file.getName());
			return file;			
			
		}
		else {
			sb.append("No se selecciono archivo");
			return null;
		} 
		
		
		
	}
	

}
