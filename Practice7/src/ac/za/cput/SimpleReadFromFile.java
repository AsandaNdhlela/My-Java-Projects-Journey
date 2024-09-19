/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleReadFromFile {
    private String prodTypeStr, prodCatalogNumStr, prodPurchPriceStr, prodSellPriceStr, prodQuantitySoldStr;
    private String prodDescription;

    private FileReader fr;
    private BufferedReader br;

    double prodPurchPrice ;
    double prodSellPrice ;
    double prodProfit ;
    int prodQuantitySold  ;
    private int prodType;
    
    public void openFile() {
    	try {
             fr = new FileReader("Sales.txt");
              br = new BufferedReader(fr);
    	}
    	catch(IOException e) {
            System.out.println("File IO error...");
            System.out.println(e);
            System.exit(1);
    	}
    	
    }
    
    public void readFile() {
        String line;

    	try {
            line = br.readLine();
            String[] sInput = line.split("#");
            
            prodTypeStr    = sInput[0];
            prodCatalogNumStr    = sInput[1];
            prodDescription    = sInput[2];
            prodPurchPriceStr = sInput[3]; 
            prodSellPriceStr = sInput[4]; 
            prodQuantitySoldStr = sInput[5]; 
            double prodPurchPrice = Double.parseDouble(prodPurchPriceStr);
            double prodSellPrice = Double.parseDouble(prodSellPriceStr);
            int prodQuantitySold = Integer.parseInt(prodQuantitySoldStr);

            double prodProfit = (prodSellPrice - prodPurchPrice) * prodQuantitySold;

            System.out.println(String.format("%-15s %-15s R%.2f\n",prodTypeStr,prodDescription, prodQuantitySoldStr, prodProfit));	
    	}catch(IOException e) {
			System.out.println(e.getMessage());
    	}
    }
    
    public void closeFile() {
        try {
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}            
    }

    public static void main(String[] args) {
    	SimpleReadFromFile readFileObj = new SimpleReadFromFile();
    	readFileObj.openFile();
    	readFileObj.readFile();
    	readFileObj.closeFile();
    	
        
        
    }//end main
        
}//end class
