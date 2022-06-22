
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import sig.model.InvoiceHeader;

public class actionHandler implements ActionListener {
    File myInvFile ;
    File myItemsFile ;
    InvoiceHeader invoice;
    
    
    private void readFile () {
       try {
      Scanner myReader = new Scanner(myInvFile);
      
      while (myReader.hasNextLine()) {
          String inv = myReader.next();
          String[] splitOut = inv.split(",");
          int invNum = Integer.parseInt(splitOut[0]);
          
          
          //invoice = new InvoiceHeader();
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    private void writeFile() {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()){
            
            //CASE 1 :  
            case "Create New Invoice":
                System.out.println("Create New Invoice");
                createInv();
                //fun();
                break;
            case "Delete Invoice":
                System.out.println("Delete Invoice");
                deleteInv();
                break;
            case "Save":
                System.out.println("Save");
                updateInv();
                break;
            case "Cancel":
                System.out.println("Cancel");
                deleteChange();
                break;
            case "Load File" :
                System.out.println("Load File");
                
                loadInvFile();
                //loadItemsFile();
                readFile();
                break;
            case "Save File" :
                System.out.println("Save File");
                saveFile();
                break;
                  
                
        }
    
    }
    
    //Create New Inv :
    private void createInv() {
        
    }
   
    //Delete the Inv:
    private void deleteInv() {
        
    }
    
    //Update the Inv :
    private void updateInv() {
        
    }
    
    //Cencel changes in File :
    private void deleteChange() {
        
    }
    
    //Load File from Directory :
    private File loadInvFile(){
        //1 The Invoice
        JFileChooser itemsChooser = new JFileChooser();
        itemsChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result2 = itemsChooser.showOpenDialog(null);
        if (result2 == JFileChooser.APPROVE_OPTION) {
        myInvFile = itemsChooser.getSelectedFile();
        System.out.println("Selected file: " + myInvFile.getAbsolutePath());
        }
        return (myInvFile);
    }
    
    
        private File loadItemsFile(){
        //2 The Ivoice Items
        JFileChooser invChooser = new JFileChooser();
        invChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = invChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
        myItemsFile = invChooser.getSelectedFile();
        System.out.println("Selected file: " + myItemsFile.getAbsolutePath());
        }
        return (myItemsFile);
        }
    
    //Save File to new file :
    private void saveFile(){
        
    }
    
}
