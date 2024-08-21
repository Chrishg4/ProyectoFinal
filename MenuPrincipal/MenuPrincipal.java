/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;

import Empleados.FrmEmpleados;
import ListaClientes.FrmClientes;

/**
 *
 * @author chris
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        DeskMenPrinc = new javax.swing.JDesktopPane();
        Clientes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/personal.png"))); // NOI18N
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });

        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        DeskMenPrinc.setLayer(Clientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DeskMenPrinc.setLayer(btnEmpleados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DeskMenPrincLayout = new javax.swing.GroupLayout(DeskMenPrinc);
        DeskMenPrinc.setLayout(DeskMenPrincLayout);
        DeskMenPrincLayout.setHorizontalGroup(
            DeskMenPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskMenPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        DeskMenPrincLayout.setVerticalGroup(
            DeskMenPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskMenPrincLayout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(DeskMenPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskMenPrinc)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskMenPrinc)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
        // Crear una instancia del Internal Frame
    FrmClientes internalFrame = new FrmClientes();

    // Agregar el Internal Frame al DesktopPane
    DeskMenPrinc.add(internalFrame);

    // Mostrar el Internal Frame
    internalFrame.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
    FrmEmpleados internalFrame = new FrmEmpleados();
    DeskMenPrinc.add(internalFrame);
    internalFrame.setVisible(true);


    }//GEN-LAST:event_btnEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JDesktopPane DeskMenPrinc;
    private javax.swing.JButton btnEmpleados;
    // End of variables declaration//GEN-END:variables
}
