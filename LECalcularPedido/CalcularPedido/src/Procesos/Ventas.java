package Procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Ventas {
	
	private static File file;
	
	
	public Ventas() {
			
	}
	
	public Ventas(File file) {
		this.file = file;
	}
	


	//Instantiates global map
    private static Map<String, String> filteredMap = new HashMap<String, String>();
    private static Map<String, String> FilteredVentas = new HashMap<String, String>();

    

    public static void initialize() {

        //REMEMBER TO CHANGE THIS DIRECTORY. CHECK IF WORKS ON LOCAL MACHINE
      
        String line = "";

        //Splits the ventasFile file by commas
        try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {

            while ((line = br.readLine()) != null) {

                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    filteredMap.put(row[2], row[7]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        filterMap();
    }

    //Handles Map Filter
    public static void filterMap(){
        int totalQuantity = 0;
        int filteredRowsNum = 0;
        //Filters results 
        for (Map.Entry<String, String> row : filteredMap.entrySet()) {

            String id = row.getKey();

            //Checks if ID (Starting character) equals C or D
            if(id.charAt(0) == 'C' || id.charAt(0) == 'D'){
                filteredRowsNum++;
                totalQuantity += Integer.parseInt(row.getValue().toString());
                //System.out.println(id + "," + row.getValue());
                FilteredVentas.put(id,row.getValue());
            }
        }
        //System.out.println("Total Q: " + totalQuantity + " Filtered Rows " + filteredRowsNum);
        System.out.println(FilteredVentas);
    }
    
    public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}