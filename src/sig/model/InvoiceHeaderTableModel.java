/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class InvoiceHeaderTableModel extends AbstractTableModel{
    private ArrayList<InvoiceHeader> data;
    private String[] cols={"id" , "Customer Name" , "Date" , "Total"};

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> data) {
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
        InvoiceHeader header = data.get(i) ;
        switch (i1){
            case 0:
               return header.getNum();
            case 1:
                return header.getCustomerName();
            case 2:
                return header.getDate();
            case 3:
                return header.getInoiceTotal();
                
        }
                
        return "WELCOME";
    }

    @Override
    public String getColumnName(int i) {
        return cols[i]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
     public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
          case 0 :
              return Integer.class;
          case 1 :
              return String.class;
          case 2 :
              return String.class;
          case 3 :
              return Double.class;
          default:
              return Object.class;
    }
    }
     public List<InvoiceHeader> getInvoicesArray() {
        return data;
    }
     
}
