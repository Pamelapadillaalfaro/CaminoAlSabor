/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

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
        jComboBoxEnvoltorio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCubiertos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPlatillos = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Comida Mexicana");

        jComboBoxEnvoltorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxEnvoltorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartón", "Plástico" }));
        jComboBoxEnvoltorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEnvoltorioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de envoltorio:");

        jComboBoxCubiertos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxCubiertos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cubiertos:");

        btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Platillo:");

        jComboBoxPlatillos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxPlatillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enchiladas", "Pambazo", "Pozole", "Taco de barbacoa", "Taco de pastor", "Taco de longaniza", "Taco de bistec", "Tlayuda", "Tostada de tinga", "Tostada de pata" }));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(btnRegresar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel2))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxCubiertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxEnvoltorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxPlatillos, 0, 200, Short.MAX_VALUE))
                            .addComponent(btnPagar))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegresar)
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
                            .addComponent(jComboBoxEnvoltorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCubiertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEnvoltorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEnvoltorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEnvoltorioActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int temp=jComboBoxPlatillos.getSelectedIndex();
        int envoltorio=jComboBoxEnvoltorio.getSelectedIndex();
        int cubiertos=jComboBoxCubiertos.getSelectedIndex();
        switch (temp) {
            case 0:
                ListaPlatillo.contiene("Enchiladas",envoltorio,cubiertos);
                PrintWriter ticket=null;
                String text="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Enchilada,85""";
                try {        
                    ticket=new PrintWriter("ticket.csv");
                    Objects.requireNonNull(ticket).println(text);
                    ticket.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                ListaPlatillo.contiene("Pambazo",envoltorio,cubiertos);
                PrintWriter ticket1=null;
                String text1="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Pambazo,27""";
                try {        
                    ticket1=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket1).println(text1);
                    ticket1.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                
            case 2:
                ListaPlatillo.contiene("Pozole",envoltorio,cubiertos);
                PrintWriter ticket2=null;
                String text2="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Pozole,93""";
                try {        
                    ticket2=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket2).println(text2);
                    ticket2.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                ListaPlatillo.contiene("Taco de barbacoa",envoltorio,cubiertos);
                PrintWriter ticket3=null;
                String text3="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Taco de barbacoa,20""";
                try {        
                    ticket3=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket3).println(text3);
                    ticket3.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                ListaPlatillo.contiene("Taco de pastor",envoltorio,cubiertos);
                PrintWriter ticket4=null;
                String text4="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Taco de pastor,10""";
                try {        
                    ticket4=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket4).println(text4);
                    ticket4.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 5:
                ListaPlatillo.contiene("Taco de longaniza",envoltorio,cubiertos);
                PrintWriter ticket5=null;
                String text5="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Taco de longaniza,9""";
                try {        
                    ticket5=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket5).println(text5);
                    ticket5.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 6:
                ListaPlatillo.contiene("Taco de bistec",envoltorio,cubiertos);
                PrintWriter ticket6=null;
                String text6="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Taco de bistec,12""";
                try {        
                    ticket6=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket6).println(text6);
                    ticket6.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 7:
                ListaPlatillo.contiene("Tlayuda",envoltorio,cubiertos);
                PrintWriter ticket7=null;
                String text7="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Tlayuda,30""";
                try {        
                    ticket7=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket7).println(text7);
                    ticket7.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 8:
                ListaPlatillo.contiene("Tostada de tinga",envoltorio,cubiertos);
                PrintWriter ticket8=null;
                String text8="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Tostada de tinga,22""";
                try {        
                    ticket8=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket8).println(text8);
                    ticket8.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 9:
                ListaPlatillo.contiene("Tostada de pata",envoltorio,cubiertos);
                PrintWriter ticket9=null;
                String text9="""
                            ticket
                            Gracias por su compra
                              
                            Descripción,Precio
                            Tostada de pata,25""";
                try {        
                    ticket9=new PrintWriter("ticket1.csv");
                    Objects.requireNonNull(ticket9).println(text9);
                    ticket9.close();
                } catch (IOException ex) {
                    Logger.getLogger(CaminoAlSabor.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                throw new AssertionError();
        }
        Welcome_cliente ventana=new Welcome_cliente();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu ventana=new Menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jComboBoxCubiertos;
    private javax.swing.JComboBox<String> jComboBoxEnvoltorio;
    private javax.swing.JComboBox<String> jComboBoxPlatillos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
