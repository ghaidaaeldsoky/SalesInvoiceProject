
package sig.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class InvoiceLine {
    private InvoiceHeader num;
    private String itemName ;
    private double price;
    private int count;
    

    public InvoiceLine(InvoiceHeader num, String itemName, double price, int count) {
        this.num = num;
        this.itemName = itemName;
        this.price = price;
        this.count = count;
        
    }
    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvoiceHeader getNum() {
        return num;
    }

    public void setNum(InvoiceHeader num) {
        this.num = num;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getItemTotal() {
        return (count * price );
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", price=" + price + ", count=" + count + ", itemTotal=" + getItemTotal() + '}';
    }
    
    public String getDataAsCSV() {
        return "" + getNum().getNum()+ "," + getItemName() + "," + getPrice() + "," + getCount();
    }
    
}
