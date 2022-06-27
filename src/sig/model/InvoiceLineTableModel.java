/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class InvoiceLineTableModel extends AbstractTableModel{
    ArrayList<InvoiceLine> data;
    
    String[] cols = {"Invoice Id" , "Item Name" , "Price", "Count"};

    public InvoiceLineTableModel(ArrayList<InvoiceLine> data) {
        this.data = data;
    }

    
    
    @Override
    public int getRowCount() {
        return data.size();
        
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        InvoiceLine line = data.get(i) ;
        switch (i1){
            case 0:
               return line.getNum();
            case 1:
                return line.getItemName();
            case 2:
                return line.getPrice();
            case 3:
                return line.getCount();
            case 4:
                return line.getItemTotal();
        }
                
        return "WELCOME";
    }

    @Override
    public String getColumnName(int i) {
        return cols[i];
    }

    
    
    
}
