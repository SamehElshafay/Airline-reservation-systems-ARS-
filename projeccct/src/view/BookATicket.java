/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import projeccct.Database;

/**
 *
 * @author sameh
 */
public class BookATicket extends javax.swing.JFrame {
    private String username ;
    ArrayList <Model.Flight> allFlights = new ArrayList<>();
    /**
     * Creates new form BookATicket
     */
    public BookATicket(String username) throws SQLException {
        initComponents();
        this.username = username ;
        Database database = new Database();
        ArrayList <Model.Flight> allFlights = database.retrieveFlight();
        for(int i = 0 ; i < allFlights.size() ; i++){
            ALL_FLIGHTS.addItem(allFlights.get(i).getD_To());
            this.allFlights.add(allFlights.get(i));
        }
        
        TO.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getD_To());
        FROM.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getS_From());
        DAY.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getDay());
        TIME.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getTime());
        PRICE.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getPrice());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALL_FLIGHTS = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        TO = new javax.swing.JLabel();
        FROM = new javax.swing.JLabel();
        DAY = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        PRICE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ALL_FLIGHTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALL_FLIGHTSActionPerformed(evt);
            }
        });
        ALL_FLIGHTS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ALL_FLIGHTSPropertyChange(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setEnabled(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(263, 316));
        jPanel1.setMinimumSize(new java.awt.Dimension(263, 316));

        TO.setText("             ");

        FROM.setText("             ");

        DAY.setText("             ");

        TIME.setText("             ");

        PRICE.setText("             ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PRICE)
                    .addComponent(TIME)
                    .addComponent(DAY)
                    .addComponent(FROM)
                    .addComponent(TO))
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TO)
                .addGap(40, 40, 40)
                .addComponent(FROM)
                .addGap(40, 40, 40)
                .addComponent(DAY)
                .addGap(40, 40, 40)
                .addComponent(TIME)
                .addGap(40, 40, 40)
                .addComponent(PRICE)
                .addGap(40, 40, 40))
        );

        jButton1.setText("Book");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ALL_FLIGHTS, 0, 139, Short.MAX_VALUE)
                        .addGap(81, 81, 81)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(ALL_FLIGHTS)
                        .addGap(168, 168, 168)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ALL_FLIGHTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALL_FLIGHTSActionPerformed
        //samehelshafay142
        try {
            TO.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getD_To());
            FROM.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getS_From());
            DAY.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getDay());
            TIME.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getTime());
            PRICE.setText(allFlights.get(ALL_FLIGHTS.getSelectedIndex()).getPrice());
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_ALL_FLIGHTSActionPerformed

    private void ALL_FLIGHTSPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ALL_FLIGHTSPropertyChange
    
    }//GEN-LAST:event_ALL_FLIGHTSPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MAIN(username).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BookATicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookATicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookATicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookATicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BookATicket("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BookATicket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ALL_FLIGHTS;
    private javax.swing.JLabel DAY;
    private javax.swing.JLabel FROM;
    private javax.swing.JLabel PRICE;
    private javax.swing.JLabel TIME;
    private javax.swing.JLabel TO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}