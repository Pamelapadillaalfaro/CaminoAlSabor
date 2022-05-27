/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import caminoalsabor.CaminoAlSabor;
import controlador.ListaPlatillo;
import controlador.ListaUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *Frame para hacer pedido de comida mexicana
 * @author Pamela
 */
public class Comida_mexicana extends javax.swing.JFrame {

    /**
     * Creates new form Comida_mexicana
     */
    public Comida_mexicana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPlatillos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Comida Mexicana");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartón", "Plástico" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de envoltorio:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel3.setText("Cubiertos:");

        btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel4.setText("Platillo:");

        jComboBoxPlatillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enchiladas", "Pambazo", "Pozole", "Taco de barbacoa", "Taco de pastor", "Taco de longaniza", "Taco de bistec", "Tlayuda", "Tostada de tinga", "Tostada de pata" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxPlatillos, 0, 200, Short.MAX_VALUE))
                            .addComponent(btnPagar))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnPagar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int temp=jComboBoxPlatillos.getSelectedIndex();
        String tempText="";
        switch (temp) {
            case 0:
                ListaPlatillo.contiene("Enchiladas");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción       Precio
                                                    Enchiladas          85
                                                    """);
                PrintWriter ticket=null;
                String text="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Enchilad,85""";
                try {        
                    ticket=new PrintWriter("ticket.csv");
                    Objects.requireNonNull(ticket).println(text);
                    ticket.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                ListaPlatillo.contiene("Pambazo");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción       Precio
                                                    Pambazo             22
                                                    """);
                PrintWriter ticket1=null;
                String text1="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Enchilad,85""";
                try {        
                    ticket1=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket1).println(text1);
                    ticket1.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                
            case 2:
                ListaPlatillo.contiene("Pozole");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción       Precio
                                                    Pozole              93
                                                    """);
                break;
            case 3:
                ListaPlatillo.contiene("Taco de barbacoa");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción         Precio
                                                    Taco de barbacoa      20
                                                    """);
                break;
            case 4:
                ListaPlatillo.contiene("Taco de pastor");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción         Precio
                                                    Taco de pastor        10
                                                    """);
                break;
            case 5:
                ListaPlatillo.contiene("Taco de longaniza");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción          Precio
                                                    Taco de longaniza      9
                                                    """);
                break;
            case 6:
                ListaPlatillo.contiene("Taco de bistec");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción         Precio
                                                    Taco de bistec        12
                                                    """);
                break;
            case 7:
                ListaPlatillo.contiene("Tlayuda");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción       Precio
                                                    Tlayuda             30
                                                    """);
                break;
            case 8:
                ListaPlatillo.contiene("Tostada de tinga");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción         Precio
                                                    Tostada de tinga      22
                                                    """);
                break;
            case 9:
                ListaPlatillo.contiene("Tostada de pata");
                JOptionPane.showMessageDialog(null, """
                                                    Gracias por su compra
                                                    
                                                    Descripción         Precio
                                                    Tostada de pata       25
                                                    """);
                break;
            default:
                throw new AssertionError();
        }
        Welcome_cliente ventana=new Welcome_cliente();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Comida_mexicana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comida_mexicana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comida_mexicana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comida_mexicana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comida_mexicana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxPlatillos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
