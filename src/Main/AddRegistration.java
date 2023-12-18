package Main;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AddRegistration extends javax.swing.JInternalFrame {

    private static final String REGISTRATION_FILE_PATH = "consultlist.txt";
    private static final String SELECTED_FILE_PATH = "selected_regis.txt";
    private final DefaultTableModel model;
    
    public AddRegistration() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        loadSavedData();
    }
    
    private void loadSavedData() {
        try (BufferedReader br = new BufferedReader(new FileReader(REGISTRATION_FILE_PATH))) {
            String line;
            int number = 1;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Object[] rowData = new Object[data.length + 1]; // +1 for the "Nomor" column

                rowData[0] = number; // Nomor

                for (int i = 1; i <= data.length; i++) {
                    rowData[i] = data[i - 1];
                }

                model.addRow(rowData);
                number++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void saveSelectedData() {
        String selectedNumber = jTextField2.getText().trim();
        String patientName = MenuLogin.username;

        try {
            int selectedRow = Integer.parseInt(selectedNumber) - 1;
            if (selectedRow < 0 || selectedRow >= jTable1.getRowCount()) {
                JOptionPane.showMessageDialog(this, "Nomor tidak valid");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String doctorInfo = model.getValueAt(selectedRow, 1) + ","
                                + model.getValueAt(selectedRow, 2) + ","
                                + model.getValueAt(selectedRow, 3) + ","
                                + model.getValueAt(selectedRow, 4);

            // Save patient name to selected_regis.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("selected_regis.txt", true));
            writer.write(patientName + "," + doctorInfo);
            writer.newLine();
            writer.close();

            // Remove selected data from consultlist.txt
            removeSelectedRegistration(selectedRow);

            // Refresh table
            loadDataToTable();

            JOptionPane.showMessageDialog(this, "Data telah disimpan!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nomor tidak valid");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void removeSelectedRegistration(int selectedNumber) {
            try {
            BufferedReader br = new BufferedReader(new FileReader(REGISTRATION_FILE_PATH));
            ArrayList<String> lines = new ArrayList<>();

            String line;
            int currentRow = 0;

            while ((line = br.readLine()) != null) {
                if (currentRow != selectedNumber) {
                    lines.add(line);
                }
                currentRow++;
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("consultlist.txt"));
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadDataToTable(){
        // Load data from consultlist.txt and display it in jTable1 with a row number
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear previous data

        try {
            BufferedReader br = new BufferedReader(new FileReader(REGISTRATION_FILE_PATH));
            String line;
            int rowNumber = 1;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(new Object[]{rowNumber++, data[0], data[1], data[2], data[3]});
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(242, 242, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Specialist", "Doctor's Name", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1140, 400));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel2.setText("Insert Number :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 110, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 502, 1040, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 560, 130, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRATION MENU");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 313, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selectedNumber = jTextField2.getText().trim();
        String patientName = MenuLogin.username;

        try {
            int selectedRow = Integer.parseInt(selectedNumber) - 1;
            if (selectedRow < 0 || selectedRow >= jTable1.getRowCount()) {
                JOptionPane.showMessageDialog(this, "Nomor tidak valid");
                return;
            }
            else{
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String doctorInfo = model.getValueAt(selectedRow, 1) + ","
                                    + model.getValueAt(selectedRow, 2) + ","
                                    + model.getValueAt(selectedRow, 3) + ","
                                    + model.getValueAt(selectedRow, 4);

                // Save patient name and doctor info to selected_regis.txt
                BufferedWriter writer = new BufferedWriter(new FileWriter("selected_regis.txt", true));
                writer.write(patientName + "," + doctorInfo);
                writer.newLine();
                writer.close();

                // Remove selected data from consultlist.txt
                removeSelectedRegistration(selectedRow);

                // Refresh table
                loadDataToTable();
                
                JOptionPane.showMessageDialog(this, "Registration Successfully");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nomor tidak valid");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
