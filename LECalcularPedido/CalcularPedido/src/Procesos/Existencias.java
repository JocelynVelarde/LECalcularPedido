package Procesos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Existencias {
	
	private static File file;
	
	
	public Existencias() {
			
	}
	
	public Existencias(File file) {
		this.file = file;
	}
	
    private static Map<String, String> Existencias = new HashMap<String, String>();
    private static Map<String, String> FilteredExistencias = new HashMap<String, String>();
    
    private static ArrayList<String> Existencia = new ArrayList<String>();
    
    static List<String> NombreExistencia = new ArrayList<String>(Existencias.keySet());
	
	public static void calcularexistencia() {
		
        String line = "";
      
        //Splits the ventasFile file by commas
        try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {

            while ((line = br.readLine()) != null) {

                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    Existencias.put(row[0], row[3]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        filterMap();
        //MaptoList();
    }

    //Handles Map Filter
    public static void filterMap(){
        int totalQuantity = 0;
        int filteredRowsNum = 0;
        //Filters results 
        for (Map.Entry<String, String> row : Existencias.entrySet()) {

            String id = row.getKey();

            //Checks if ID (Starting character) equals C or D
            if(id.charAt(0) == 'C' || id.charAt(0) == 'D'){
                filteredRowsNum++;
                totalQuantity += Integer.parseInt(row.getValue().toString());
                //System.out.println(id + "," + row.getValue());
                FilteredExistencias.put(id,row.getValue());
            }
        } //BORRAR UNA VEZ LISTO
        //System.out.println("Total Q: " + totalQuantity + " Filtered Rows " + filteredRowsNum);
        System.out.println(FilteredExistencias);
        System.out.println(FilteredExistencias.size());
        
    }
    
    //Converts hashmap into arraylist
   public static void MaptoList() {
	   Iterator it = Existencias.entrySet().iterator();
	    
	    //convert hasmap keys into ArrayList
	    
	    for (String t : NombreExistencia) {
	    	System.out.println(t);
	    	
	    	
	    }

   }
    
       
    
    
    public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

    
	
    //public static void main(String[] args) {
    	//calcularexistencia();
		
	}
