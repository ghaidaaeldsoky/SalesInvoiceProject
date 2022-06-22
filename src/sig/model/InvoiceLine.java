
package sig.model;

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
    
    
    
}
