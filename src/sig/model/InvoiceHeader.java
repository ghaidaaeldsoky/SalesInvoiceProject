
package sig.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int num;
    private String customerName;
    private Date date;
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
        return items;
    }

    public void setItems(ArrayList<InvoiceLine> items) {
        this.items = items;
    }
    
    
    
}
