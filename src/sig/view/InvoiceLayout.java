/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.view;

import controller.actionHandler;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import sig.model.InvoiceHeader;
import sig.model.InvoiceHeaderTableModel;
import sig.model.InvoiceLineTableModel;

/**
 *
 * @author hp
 */
public class InvoiceLayout extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceLayout
     */
    public InvoiceLayout() {
        handler = new actionHandler(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(handler);

        newInvoiceBtn = new javax.swing.JButton();
        newInvoiceBtn.addActionListener(handler);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(handler);

        newItemBtn = new javax.swing.JButton();
        newItemBtn.addActionListener(handler);
        deleteItemBtn = new javax.swing.JButton();
        deleteItemBtn.addActionListener(handler);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invoiceNum = new javax.swing.JLabel();
        invoiceDate = new javax.swing.JTextField();
        CusName = new javax.swing.JTextField();
        invoiceTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenuItem();
        loadMenu.addActionListener(handler);
        saveMenu = new javax.swing.JMenuItem();
        saveMenu.addActionListener(handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        newInvoiceBtn.setText("Create New Invoice");

        deleteInvoiceBtn.setText("Delete Invoice");

        newItemBtn.setText("Save");

        deleteItemBtn.setText("Cancel");

        jLabel1.setText("Invoice Number :");

        jLabel2.setText("Invoice Date :");

        jLabel3.setText("Customer Name :");

        jLabel4.setText("Invoice Total :");

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        itemsTable.getSelectionModel().addListSelectionListener(handler);

        jScrollPane2.setViewportView(itemsTable);

        jLabel5.setText("Invoise Items :");

        jLabel6.setText("Invoices Table :");

        invoiceTotal.setText("jLabel8");

        jMenu1.setText("File");

        loadMenu.setText("Load File");
        loadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenu);

        saveMenu.setText("Save File");
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceNum)
                            .addComponent(invoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CusName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceTotal)))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(newInvoiceBtn)
                .addGap(84, 84, 84)
                .addComponent(deleteInvoiceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newItemBtn)
                .addGap(163, 163, 163)
                .addComponent(deleteItemBtn)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoiceNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(invoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(CusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(invoiceTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInvoiceBtn)
                    .addComponent(deleteInvoiceBtn)
                    .addComponent(newItemBtn)
                    .addComponent(deleteItemBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CusName;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JTextField invoiceDate;
    private javax.swing.JLabel invoiceNum;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotal;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JButton newInvoiceBtn;
    private javax.swing.JButton newItemBtn;
    private javax.swing.JMenuItem saveMenu;
    // End of variables declaration//GEN-END:variables
private actionHandler handler ;
private ArrayList<InvoiceHeader> InvoiceHeaderLists ;
private InvoiceHeaderTableModel invoiceHedeartable ;
private InvoiceLineTableModel invoiceLinetable;



    public InvoiceLineTableModel getInvoiceLinetable() {
        return invoiceLinetable;
    }

    public void setInvoiceLinetable(InvoiceLineTableModel invoiceLinetable) {
        this.invoiceLinetable = invoiceLinetable;
    }


    public InvoiceHeaderTableModel getInvoiceHedeartable() {
        return invoiceHedeartable;
    }

    public actionHandler getHandler() {
        return handler;
    }

    public ArrayList<InvoiceHeader> getInvoiceHeaderLists() {
        return InvoiceHeaderLists;
    }

    public void setInvoiceHeaderLists(ArrayList<InvoiceHeader> InvoiceHeaderLists) {
        this.InvoiceHeaderLists = InvoiceHeaderLists;
        invoiceHedeartable = new InvoiceHeaderTableModel(InvoiceHeaderLists);
        this.invoiceTable.setModel(invoiceHedeartable);
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public JTable getItemsTable() {
        return itemsTable;
    }

    public JTextField getCusName() {
        return CusName;
    }

    public JTextField getInvoiceDate() {
        return invoiceDate;
    }

    public JLabel getInvoiceNum() {
        return invoiceNum;
    }

    public JLabel getInvoiceTotal() {
        return invoiceTotal;
    }
       
    

}
