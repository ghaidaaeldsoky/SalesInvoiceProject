
package sig.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int num;
    private String customerName;
    private Date date;
    //double inoiceTotal;
    private ArrayList<InvoiceLine> items;

    public InvoiceHeader(int num, String customerName, Date date) {
        this.num = num;
        this.customerName = customerName;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<InvoiceLine> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

 
     public double getInoiceTotal() {
         double total=0;
         for (InvoiceLine line : getItems()){
             total += line.getItemTotal();
         }
        return total;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + num + ", customerName=" + customerName + ", date=" + date + '}';
    }
     
    public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getNum() + "," + df.format(getDate()) + "," + getCustomerName();
}
    
    
}
