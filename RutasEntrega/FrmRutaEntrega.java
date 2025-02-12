/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package RutasEntrega;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Luisk
 */
public class FrmRutaEntrega extends javax.swing.JInternalFrame {
ListaRutaEntrega listaEntrega = new ListaRutaEntrega();


    /**
     * Creates new form FrmRutaEntrega
     */
    public FrmRutaEntrega() {
        initComponents();
        quitarFondoBoton(btnAgregar);
        quitarFondoBoton(btnActualizar);
        quitarFondoBoton(btnEliminar);
        quitarFondoBoton(btnBuscar);
        quitarFondoBoton(txtLimpiar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigoRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestion Rutas");

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel4.setText("Nombre");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/circulo-cruzado.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 50, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 50, 40));

        txtLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpio.png"))); // NOI18N
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 50, 40));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar-flecha.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, -1));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/viaje-en-coche.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel5.setText("Codigo Ruta");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel6.setText("Descripcion");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel7.setText("Destino");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 60, -1));
        jDesktopPane1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, -1));
        jDesktopPane1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, -1));
        jDesktopPane1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, -1));
        jDesktopPane1.add(txtCodigoRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 50, -1));

        jLabel2.setText("Actualizar");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Limpiar");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void quitarFondoBoton(JButton boton) {
    boton.setBackground(new Color(0, 0, 0, 0));
    boton.setBorder(null);
         }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    
    if(!this.txtCodigoRuta.getText().isEmpty()&&!this.txtDescripcion.getText().isEmpty()
                &&!this.txtNombre.getText().isEmpty()&&!this.txtDestino.getText().isEmpty()){
                
               RutaEntrega rut = new RutaEntrega(txtCodigoRuta.getText(),txtNombre.getText(),txtDescripcion.getText(),txtDestino.getText());
               listaEntrega.agregarRuta(rut);
               
               JOptionPane.showMessageDialog(null,"La ruta se agrego con exito","Ruta Agregada",JOptionPane.WARNING_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,"La ruta no existe ingrese de nuevo","informacion incorrecta",JOptionPane.WARNING_MESSAGE);
        }
        ClearTxt();
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if (!this.txtCodigoRuta.getText().isEmpty() && !this.txtDescripcion.getText().isEmpty()
            && !this.txtNombre.getText().isEmpty() && !this.txtDestino.getText().isEmpty()) {
            String codigoRuta = txtCodigoRuta.getText();
            String nuevaDescripcion = txtDescripcion.getText();
            String nuevosDestinos = txtDestino.getText();
        if (listaEntrega.buscarRuta(codigoRuta) != null) {
        if (listaEntrega.actualizarRuta(codigoRuta, nuevaDescripcion, nuevosDestinos)) {
            JOptionPane.showMessageDialog(null, "Ruta actualizada correctamente", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar la ruta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "La ruta no exite", "Error de registro", JOptionPane.INFORMATION_MESSAGE);
        }    
        ClearTxt();
        } else {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Información Incorrecta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!this.txtCodigoRuta.getText().isEmpty()) {
        if (listaEntrega.eliminarRuta(this.txtCodigoRuta.getText())) {
        ClearTxt();
        JOptionPane.showMessageDialog(null, "Ruta eliminada correctamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "El código de ruta no existe, ingrese de nuevo", "Información Incorrecta", JOptionPane.WARNING_MESSAGE);
        }
        }else {
         JOptionPane.showMessageDialog(null, "Debe ingresar un código de ruta", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (!this.txtCodigoRuta.getText().isEmpty()) {

            RutaEntrega ruta = listaEntrega.buscarRuta(this.txtCodigoRuta.getText());
            this.txtDescripcion.setText(ruta.getDescripcion());
            this.txtCodigoRuta.setText(ruta.getCodigoRuta());
            this.txtNombre.setText(ruta.getNombre());
            this.txtDestino.setText(ruta.getDestinos());

        } else {
            JOptionPane.showMessageDialog(null, "El código de ruta no existe, ingrese de nuevo", "Información Incorrecta", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        // TODO add your handling code here:
        ClearTxt();
    }//GEN-LAST:event_txtLimpiarActionPerformed
    public void ClearTxt(){
       this.txtCodigoRuta.setText("");
       this.txtDescripcion.setText("");
       this.txtDestino.setText("");
       this.txtNombre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigoRuta;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
