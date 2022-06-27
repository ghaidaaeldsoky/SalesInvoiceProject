
package controller;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import sig.model.InvoiceHeader;
import sig.model.InvoiceLine;
import sig.model.InvoiceLineTableModel;
import sig.view.InvoiceLayout;

public class actionHandler implements ActionListener , ListSelectionListener{
    File myInvFile ;
    File myItemsFile ;
    InvoiceHeader invoice;
    
    
    //REFERENCE FOR FRAME:
    InvoiceLayout frame;
    public actionHandler (InvoiceLayout frame){
        this.frame = frame;
    }
    
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
                loadFile();
                break;
            case "Save File" :
                System.out.println("Save File");
                saveFile();
                break;
                  
                
        }
    
    }
    
    //Create New Inv :
    private void createInv() {
        //frame.setHeaderDialog(new InvoiceHeaderDialog(frame));
        //frame.getHeaderDialog().setVisible(true);
    }
   
    //Delete the Inv:
    private void deleteInv() {
        int invIndex = frame.getInvoiceTable().getSelectedRow();
        InvoiceHeader header = frame.getInvoiceHedeartable().getInvoicesArray().get(invIndex);
        frame.getInvoiceHedeartable().getInvoicesArray().remove(invIndex);
       frame.getInvoiceHedeartable().fireTableDataChanged();
        frame.setInvoiceLinetable(new InvoiceLineTableModel(new ArrayList<InvoiceLine>()));
        frame.getItemsTable().setModel(frame.getInvoiceLinetable());
        frame.getInvoiceLinetable().fireTableDataChanged();
        frame.getCusName().setText("");
        frame.getInvoiceDate().setText("");
        frame.getInvoiceNum().setText("");
        frame.getInvoiceTotal().setText("");
        displayInvoices();
        JOptionPane.showMessageDialog(null, "Invoice Deleted Successfully ! ");
 
    }
    
     private void displayInvoices(){
         for (InvoiceHeader header :frame.getInvoiceHeaderLists()) {
             System.out.println(header);
         }
     }
    
    //Update the Inv :
    private void updateInv() {
        
    }
    
    //Cencel changes in File :
    private void deleteChange() {
        
    }
    
    //Load File from Directory :
    private void loadFile(){
        JOptionPane.showMessageDialog(frame, "Please, select header file!", "Attention", JOptionPane.WARNING_MESSAGE);
        //1 The Invoice
        try{
        JFileChooser itemsChooser = new JFileChooser();
        int result = itemsChooser.showOpenDialog(frame);
        itemsChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = itemsChooser.getSelectedFile();
            String headerPathStr = headerFile.getAbsolutePath();
            Path headerPath = Paths.get(headerPathStr);
            List <String> headerLines = Files.lines(headerPath).collect(Collectors.toList());
            ArrayList<InvoiceHeader> invoiceHeaderList = new ArrayList<>();
            for (String headerLine : headerLines){
                
                String[] headerParts = headerLine.split(",");
                int id = Integer.parseInt(headerParts[0]);
                Date d = new SimpleDateFormat("dd-MM-yyyy").parse(headerParts[2]);   
                InvoiceHeader invHeader = new InvoiceHeader(id,headerParts[1],d);
                invoiceHeaderList.add(invHeader);
            }     
            System.out.print("Checked");
            result = itemsChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                String linePathStr = itemsChooser.getSelectedFile().getAbsolutePath();
                Path linePath = Paths.get(linePathStr);
                List <String> lineLines = Files.lines(headerPath).collect(Collectors.toList());
                for (String lineLine : lineLines){
                String[] lineParts = lineLine.split(",");
                int invId = Integer.parseInt(lineParts[0]);
                double price = Double.parseDouble(lineParts[2]);
                int count = Integer.parseInt(lineParts[3]);
                
                InvoiceHeader head = getInvoiceHeaderById(invoiceHeaderList,invId);
                InvoiceLine invLine = new InvoiceLine(head,lineParts[1],price,count);
                head.getItems().add(invLine);
                
            }
                frame.setInvoiceHeaderLists(invoiceHeaderList);
            }
        }
        }
        catch(IOException ex){
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } 
        }
    
    private InvoiceHeader getInvoiceHeaderById(ArrayList<InvoiceHeader> invs , int id) {
        for (InvoiceHeader invoice : invs) {
            if (invoice.getNum() == id){
                return invoice;
            }
        }
        return null;
    }
    
    //Save File to new file :
    private void saveFile(){
        String headers = "";
        String lines = "";
        for (InvoiceHeader header : frame.getInvoiceHeaderLists()) {
            headers += header.getDataAsCSV();
            headers += "\n";
            for (InvoiceLine line : header.getItems()) {
                lines += line.getDataAsCSV();
                lines += "\n";
            }
        }
        JOptionPane.showMessageDialog(frame, "Please, select file to save header data!", "Attention", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = fileChooser.getSelectedFile();
            try {
                FileWriter hFW = new FileWriter(headerFile);
                hFW.write(headers);
                hFW.flush();
                hFW.close();

                JOptionPane.showMessageDialog(frame, "Please, select file to save lines data!", "Attention", JOptionPane.WARNING_MESSAGE);
                result = fileChooser.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File linesFile = fileChooser.getSelectedFile();
                    FileWriter lFW = new FileWriter(linesFile);
                    lFW.write(lines);
                    lFW.flush();
                    lFW.close();
                }
                JOptionPane.showMessageDialog(null, "File Saved Successfully ! ");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
    System.out.println("Row Selected");
    int selectedRow = frame.getInvoiceTable().getSelectedRow();
    ArrayList<InvoiceLine> invLine = frame.getInvoiceHeaderLists().get(selectedRow).getItems();
    frame.getItemsTable().setModel(new InvoiceLineTableModel(invLine));
    
    }
    
}
