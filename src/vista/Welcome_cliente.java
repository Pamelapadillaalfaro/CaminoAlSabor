/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ListaPlatillo;
import javax.swing.JOptionPane;
import controlador.ListaUsuario;

/**
 *Frame de inicio de cliente
 * @author Pamela
 */
public class Welcome_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome_cliente() {
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
        jLabel2 = new javax.swing.JLabel();
        btnModificarDatos = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnHacerPedido = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCrearPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CAMINO AL SABOR");

        btnModificarDatos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificarDatos.setText("Modificar Datos");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        btnHacerPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHacerPedido.setText("Hacer Pedido");
        btnHacerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerPedidoActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnCrearPedido.setText("Generar pedido");
        btnCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrearPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHacerPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnCrearPedido))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnHacerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnModificarDatos)
                .addGap(26, 26, 26)
                .addComponent(btnEliminarCuenta)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        ListaUsuario.validarEdicion();
        Frm_alta_cliente ventana=new Frm_alta_cliente();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarDatosActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Login ventana=new Login();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        ListaUsuario.eliminar(ListaUsuario.index);
        JOptionPane.showMessageDialog(null, "Se elimino la cuenta");
        Inicio ventana=new Inicio();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnHacerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerPedidoActionPerformed
        Menu ventana=new Menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHacerPedidoActionPerformed

    private void btnCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPedidoActionPerformed
        
        for (int i = 0; i < 100; i++) {
            int platillo=(int)(Math.random()*30);
            int envoltorio=(int)(Math.random()*2);
            int cubiertos=(int)(Math.random()*2);
            switch (platillo) {
                case 0:
                    ListaPlatillo.contiene("Pozole",envoltorio,cubiertos);
                    break;
                case 1:
                    ListaPlatillo.contiene("Taco de pastor",envoltorio,cubiertos);
                    break;
                case 2:
                    ListaPlatillo.contiene("Pambazo",envoltorio,cubiertos);
                    break;
                case 3:
                    ListaPlatillo.contiene("Tostada de pata",envoltorio,cubiertos);
                    break;
                case 4:
                    ListaPlatillo.contiene("Tostada de tinga",envoltorio,cubiertos);
                    break;
                case 5:
                    ListaPlatillo.contiene("Taco de barbacoa",envoltorio,cubiertos);
                    break;
                case 6:
                    ListaPlatillo.contiene("Taco de bistec",envoltorio,cubiertos);
                    break;
                case 7:
                    ListaPlatillo.contiene("Enchiladas",envoltorio,cubiertos);
                    break;
                case 8:
                    ListaPlatillo.contiene("Taco de longaniza",envoltorio,cubiertos);
                    break;
                case 9:
                    ListaPlatillo.contiene("Tlayuda",envoltorio,cubiertos);
                    break;
                case 10:
                    ListaPlatillo.contiene("Suchi",envoltorio,cubiertos);
                    break;
                case 11:
                    ListaPlatillo.contiene("Ramen",envoltorio,cubiertos);
                    break;
                case 12:
                    ListaPlatillo.contiene("Yakitori",envoltorio,cubiertos);
                    break;
                case 13:
                    ListaPlatillo.contiene("Onigiri",envoltorio,cubiertos);
                    break;
                case 14:
                    ListaPlatillo.contiene("Sashimi",envoltorio,cubiertos);
                    break;
                case 15:
                    ListaPlatillo.contiene("Soba",envoltorio,cubiertos);
                    break;
                case 16:
                    ListaPlatillo.contiene("Takoyaki",envoltorio,cubiertos);
                    break;
                case 17:
                    ListaPlatillo.contiene("Katsudon",envoltorio,cubiertos);
                    break;
                case 18:
                    ListaPlatillo.contiene("Tempura",envoltorio,cubiertos);
                    break;
                case 19:
                    ListaPlatillo.contiene("Monjayaki",envoltorio,cubiertos);
                    break;
                case 20:
                    ListaPlatillo.contiene("Pizza",envoltorio,cubiertos);
                    break;
                case 21:
                    ListaPlatillo.contiene("Pasta",envoltorio,cubiertos);
                    break;
                case 22:
                    ListaPlatillo.contiene("Resoto",envoltorio,cubiertos);
                    break;
                case 23:
                    ListaPlatillo.contiene("Lasaña",envoltorio,cubiertos);
                    break;
                case 24:
                    ListaPlatillo.contiene("Ravioles",envoltorio,cubiertos);
                    break;
                case 25:
                    ListaPlatillo.contiene("Panna Cotta",envoltorio,cubiertos);
                    break;
                case 26:
                    ListaPlatillo.contiene("Gelato",envoltorio,cubiertos);
                    break;
                case 27:
                    ListaPlatillo.contiene("Carpaccio",envoltorio,cubiertos);
                    break;
                case 28:
                    ListaPlatillo.contiene("Tiramisu",envoltorio,cubiertos);
                    break;
                case 29:
                    ListaPlatillo.crearCapresse();
                    ListaPlatillo.contiene("Ensalada Capresse",envoltorio,cubiertos);
                    break;
                default:
                    ListaPlatillo.crearEnchiladas();
            }
        }
            
    }//GEN-LAST:event_btnCrearPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPedido;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnHacerPedido;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}