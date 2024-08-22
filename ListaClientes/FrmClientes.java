/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ListaClientes;

import Clientes.Cliente;
import Empleados.Empleado;
import java.awt.Color;
import java.awt.Graphics;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class FrmClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmClientes
     */
    public FrmClientes() {
        initComponents();
        
        quitarFondoBoton(bntAgregarC);
        quitarFondoBoton(btnActualizarC);
        quitarFondoBoton(btnBuscarC);
        quitarFondoBoton(btnListarC);
        quitarFondoBoton(btnEliminarC);
         
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Iconos/FondoClientes.jpg"));
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage (icon.getImage(), 0, 0, getWidth(),getHeight(),this);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bntAgregarC = new javax.swing.JButton();
        btnActualizarC = new javax.swing.JButton();
        btnBuscarC = new javax.swing.JButton();
        btnListarC = new javax.swing.JButton();
        txtNombreC = new javax.swing.JTextField();
        txtIdC = new javax.swing.JTextField();
        txtFechaNanC = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JTextField();
        txtCorreoC = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnEliminarC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEdadC = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administración de clientes");

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel1.setText("Identificacion");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel3.setText("Fecha Nacimiento");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel6.setText("Telefono");

        bntAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        bntAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarCActionPerformed(evt);
            }
        });

        btnActualizarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar-flecha.png"))); // NOI18N
        btnActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCActionPerformed(evt);
            }
        });

        btnBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        btnListarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lista.png"))); // NOI18N

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Fecha de Nacimiento", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrarUsuario.png"))); // NOI18N
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        jLabel7.setText("Edad");

        txtEdadC.setEditable(false);

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bntAgregarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnActualizarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBuscarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnListarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNombreC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtIdC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtFechaNanC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtTelefonoC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCorreoC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEliminarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtEdadC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(bntAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(btnActualizarC))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdC, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnEliminarC)
                                .addGap(66, 66, 66)
                                .addComponent(btnBuscarC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListarC)
                                .addGap(78, 78, 78))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaNanC, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdadC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtIdC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNanC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEdadC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntAgregarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnBuscarC)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ListaCliente listaClientes = new ListaCliente();
    
    public void ClearTxt(){
        this.txtEdadC.setText("");
        this.txtIdC.setText("");
        this.txtNombreC.setText("");
        this.txtFechaNanC.setText("");
        this.txtCorreoC.setText("");
        this.txtTelefonoC.setText("");
          }      
    private void quitarFondoBoton(JButton boton) {
    boton.setBackground(new Color(0, 0, 0, 0));
    boton.setBorder(null);
    
    
}
    
    private void bntAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarCActionPerformed
        // TODO add your handling code here:
                                                     
     if(!this.txtIdC.getText().isEmpty()&&!this.txtFechaNanC.getText().isEmpty()
                &&!this.txtTelefonoC.getText().isEmpty()&&!this.txtNombreC.getText().isEmpty()
                &&!this.txtCorreoC.getText().isEmpty()){
                DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               Cliente cli = new Cliente(txtIdC.getText(),txtNombreC.getText(),LocalDate.parse(txtFechaNanC.getText(), formt),
                    txtTelefonoC.getText(),txtCorreoC.getText());
               listaClientes.agregarCliente(cli);
               ClearTxt();
               JOptionPane.showMessageDialog(null,"El cliente se agrego de forma exitosa","Guardado",JOptionPane.WARNING_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,"Las casillas no pueden estar vacias","informacion incorrecta",JOptionPane.WARNING_MESSAGE);
        }
        
     /*                                                
    int identificacion = Integer.parseInt(txtIdC.getText());
    String nombre = txtNombreC.getText();
    LocalDate fechaNacimiento = LocalDate.parse(txtFechaNanC.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    String telefono = txtTelefonoC.getText();
    String correo = txtCorreoC.getText();
    
    // Calcular la edad
    LocalDate hoy = LocalDate.now();
    Period periodo = Period.between(fechaNacimiento, hoy);
    int edad = periodo.getYears();
    
    // Crear un objeto Cliente y asignarle los valores
    Cliente cliente = new Cliente(identificacion,  nombre,  fechaNacimiento,  telefono,  correo,  edad);
    ListaCliente lista = new ListaCliente();
    lista.agregarCliente(cliente);
    
    // Agregar el cliente a la tabla
    DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
    modelo.setRowCount(0);
    Object[] fila = new Object[modelo.getColumnCount()];
    fila[0] = cliente.getIdentificacion();
    fila[1] = cliente.getNombre();
    fila[2] = cliente.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    fila[3] = cliente.getTelefono();
    fila[4] = cliente.getCorreo();
    modelo.addRow(fila);

    
    JOptionPane.showMessageDialog(this, "Se agregó el cliente ");
    txtIdC.setText("");
    txtNombreC.setText("");
    txtFechaNanC.setText("");
    txtTelefonoC.setText("");
    txtCorreoC.setText("");
*/
    }//GEN-LAST:event_bntAgregarCActionPerformed

    private void btnActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCActionPerformed
        // TODO add your handling code here:
        /*int filaSeleccionada = tablaClientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores actuales de los campos de texto
            String telefono = txtTelefonoC.getText();
            String correo = txtCorreoC.getText();

            // Actualizar la fila seleccionada
            DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
            modelo.setValueAt(telefono, filaSeleccionada, 3);
            modelo.setValueAt(correo, filaSeleccionada, 4);

            // Limpiar los campos de texto
            txtTelefonoC.setText("");
            txtCorreoC.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para actualizar");
        }*/
    }//GEN-LAST:event_btnActualizarCActionPerformed
    
    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        // TODO add your handling code here:
        
          // Obtener la fila seleccionada
       /* int filaSeleccionada = tablaClientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener el ID del cliente seleccionado
            int idCliente = (int) tablaClientes.getValueAt(filaSeleccionada, 0);

            try {
                // Eliminar el cliente
                
                listaClientes.eliminarCliente(idCliente);

                // Eliminar la fila seleccionada
                DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
                modelo.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                // Limpiar los campos de texto
                txtTelefonoC.setText("");
                txtCorreoC.setText("");
            } catch (Exception ex) {
                // Mostrar mensaje de error si el cliente tiene paquetes en tránsito
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        }*/
    
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        // TODO add your handling code here:
          
           /*int idBuscar = Integer.parseInt(txtIdC.getText());

                // Buscar el cliente en la lista
                Cliente cliente = listaClientes.buscarCliente(idBuscar);

                if (cliente != null) {
                    // Mostrar los detalles del cliente en la tabla
                    DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
                    modelo.setRowCount(0); // Limpiar la tabla
                    modelo.addRow(new Object[]{
                        cliente.getIdentificacion(),
                        cliente.getNombre(),
                        cliente.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        cliente.getTelefono(),
                        cliente.getCorreo()
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el cliente con ID " + idBuscar);
                }*/
           
           if(!this.txtIdC.getText().isEmpty()&& listaClientes.agregarCliente(this.txtIdC.getText())!=null){
            Cliente cli = listaClientes.buscarCliente(this.txtIdC.getText());
            this.txtCorreoC.setText(cli.getCorreo());
            this.txtFechaNanC.setText(String.valueOf(cli.getFechaNacimiento()));
            this.txtIdC.setText(String.valueOf(cli.getIdentificacion()));
            this.txtNombreC.setText(cli.getNombre());
            this.txtTelefonoC.setText(cli.getTelefono());
            JOptionPane.showMessageDialog(null,"La cedula no existe ingrese de nuevo","informacion incorrecta",JOptionPane.WARNING_MESSAGE);
           
            }else{
            JOptionPane.showMessageDialog(null,"Ingrese la cedula del cliente","Información requerida",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btnBuscarCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgregarC;
    private javax.swing.JButton btnActualizarC;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnListarC;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCorreoC;
    private javax.swing.JTextField txtEdadC;
    private javax.swing.JTextField txtFechaNanC;
    private javax.swing.JTextField txtIdC;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables
}
