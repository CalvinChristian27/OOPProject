package LoginAsAdmin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AccountList extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    
    public AccountList() {
        initComponents();
        
        model = (DefaultTableModel) jTable1.getModel();
        loadSavedData();
    }

    public void addRowToJTable(Object[] dataRow) {
        model.addRow(dataRow);
        saveData();
    }
  
    private void loadSavedData(){
        try (BufferedReader br = new BufferedReader(new FileReader("UserAccount.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");
                Object[] rowData = new Object[data.length];
            
                for (int i = 0; i < data.length; i++) {
                    rowData[i] = data[i];
                }

            model.addRow(rowData);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
}

    private void saveData() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("user_credentials.txt"))) {
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                bw.write(model.getValueAt(i, j).toString());
                if (j < model.getColumnCount() - 1) {
                    bw.write(":");
                }
            }
            bw.newLine();
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(242, 242, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1140, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
