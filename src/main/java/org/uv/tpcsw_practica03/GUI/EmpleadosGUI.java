package org.uv.tpcsw_practica03.GUI;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.uv.tpcsw_practica03.DAODepartamento;
import org.uv.tpcsw_practica03.DAOEmpleado;
import org.uv.tpcsw_practica03.Departamento;
import org.uv.tpcsw_practica03.Empleado;

public class EmpleadosGUI extends javax.swing.JFrame {

    private DAOEmpleado dao = new DAOEmpleado();
    private DAODepartamento daoDepto = new DAODepartamento();
    private DefaultTableModel model = new DefaultTableModel();
    DefaultComboBoxModel<String> modelCbx = new DefaultComboBoxModel<>();
    List<Departamento> deptos = daoDepto.findAll();
    
    public EmpleadosGUI() {
        initComponents();
        setLocationRelativeTo(this);
        deshabilitarCampos();
    }

    private void deshabilitarCampos() {
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        cbxDepartamentos.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        
        txtClave.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        jtEmpleados.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtEmpleados1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbxDepartamentos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscarTodos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEliminarPorId = new javax.swing.JButton();
        btnBuscarPorId = new javax.swing.JButton();
        btnNuevoDepto = new javax.swing.JButton();
        btnBuscarDeptos = new javax.swing.JButton();

        jtEmpleados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Teléfono", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtEmpleados1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");

        jLabel1.setText("Clave: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Teléfono: ");

        jLabel4.setText("Dirección:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Teléfono", "Dirección", "Clave Depto", "Nombre Depto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmpleados);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Departamento:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setText("Empleados");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscarTodos.setText("Buscar todo");
        btnBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("¿Qué acción desea realizar?");

        btnEliminarPorId.setText("Eliminar por id");
        btnEliminarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPorIdActionPerformed(evt);
            }
        });

        btnBuscarPorId.setText("Buscar por id");
        btnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIdActionPerformed(evt);
            }
        });

        btnNuevoDepto.setText("Nuevo empleado");
        btnNuevoDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDeptoActionPerformed(evt);
            }
        });

        btnBuscarDeptos.setText("Buscar Deptos");
        btnBuscarDeptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDeptosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtDireccion)
                    .addComponent(cbxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarDeptos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnGuardar)
                        .addGap(51, 51, 51)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnNuevoDepto)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPorId)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPorId)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoDepto)
                    .addComponent(btnBuscarPorId)
                    .addComponent(btnEliminarPorId)
                    .addComponent(btnBuscarTodos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addGap(0, 10, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDeptos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Empleado emp = dao.findById(Long.valueOf(txtClave.getText()));
        
        if(emp == null) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            return;
        } 
            txtClave.setText(String.valueOf(emp.getClave()));
            txtNombre.setText(emp.getNombre());
            txtDireccion.setText(emp.getDireccion());
            txtTelefono.setText(emp.getTelefono());
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Empleado emp = new Empleado();
        emp.setNombre(txtNombre.getText());
        emp.setDireccion(txtDireccion.getText());
        emp.setTelefono(txtTelefono.getText());
       
        int index = cbxDepartamentos.getSelectedIndex();
        emp.setDepto(deptos.get(index));
        
        if(!dao.save(emp)) {
            JOptionPane.showMessageDialog(null, "Error al guardar empleado");
            return;   
        }
        
        JOptionPane.showMessageDialog(null, "Empleado guardado con éxito");
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        Empleado emp = new Empleado();
        emp.setNombre(txtNombre.getText());
        emp.setDireccion(txtDireccion.getText());
        emp.setTelefono(txtTelefono.getText());
        Long clave = Long.valueOf(txtClave.getText());
        
        if(!dao.update(emp, clave)) {
            JOptionPane.showMessageDialog(null, "Error al actualizar empleado");
        }
        
        JOptionPane.showMessageDialog(null, "Empleado actualizado con éxito");
        limpiar();   
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void limpiar() {
       txtClave.setText("");
       txtNombre.setText("");
       txtDireccion.setText("");
       txtTelefono.setText("");   
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Long clave = Long.valueOf(txtClave.getText());
        
        if(dao.delete(clave)) {
            JOptionPane.showMessageDialog(null, "Error al elminar empleado");
        }
        
        JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito");
        limpiar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodosActionPerformed

        List<Empleado> empleados = dao.findAll();

        DefaultTableModel model = (DefaultTableModel) jtEmpleados.getModel();
        model.setRowCount(0);  // Eliminar todas las filas
        model.setColumnCount(0); 
        
        model.addColumn("Clave");
        model.addColumn("Nombre");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
        model.addColumn("Clave Depto");
        model.addColumn("Nombre Depto");
        
        if(empleados != null){
            for (Empleado depto : empleados) {
                model.addRow(
                    new Object[]{
                        depto.getClave(),
                        depto.getNombre(),
                        depto.getTelefono(),
                        depto.getDireccion(),
                        depto.getDepto().getClave(),
                        depto.getDepto().getNombre()
                    });
                }
            }

        jtEmpleados.setModel(model);
    }//GEN-LAST:event_btnBuscarTodosActionPerformed

    private void btnEliminarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPorIdActionPerformed
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        cbxDepartamentos.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        
        txtClave.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_btnEliminarPorIdActionPerformed

    private void btnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIdActionPerformed
        
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        cbxDepartamentos.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        
        txtClave.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(false);
        
    }//GEN-LAST:event_btnBuscarPorIdActionPerformed

    private void btnNuevoDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDeptoActionPerformed

        recargarDeptos();
        
        txtNombre.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        cbxDepartamentos.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(true);
        
        txtClave.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnNuevoDeptoActionPerformed

    private void jtEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadosMouseClicked
        
        int fila = jtEmpleados.getSelectedRow();
        
        Long clave = (Long) jtEmpleados.getValueAt(fila, 0);
        String nombre = (String) jtEmpleados.getValueAt(fila, 1);
        String telefono = (String) jtEmpleados.getValueAt(fila, 2);
        String direccion = (String) jtEmpleados.getValueAt(fila, 3);
        
        Departamento depto = new Departamento();
        Long claveDepto = (Long) jtEmpleados.getValueAt(fila, 4);
        String nombreDepto = (String) jtEmpleados.getValueAt(fila, 5);
        depto.setNombre(nombreDepto);
        depto.setClave(claveDepto);
        
        txtClave.setText(String.valueOf(clave));
        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtDireccion.setText(direccion);
        
        cbxDepartamentos.setSelectedItem(depto);
     
    }//GEN-LAST:event_jtEmpleadosMouseClicked

    private void recargarDeptos() {
        deptos = daoDepto.findAll();
        
        for (Departamento depto : deptos) {
            modelCbx.addElement(depto.getNombre());
        }
        
        cbxDepartamentos.setModel(modelCbx);
    }
    
    private void btnBuscarDeptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDeptosActionPerformed
        recargarDeptos(); 
    }//GEN-LAST:event_btnBuscarDeptosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarDeptos;
    private javax.swing.JButton btnBuscarPorId;
    private javax.swing.JButton btnBuscarTodos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarPorId;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoDepto;
    private javax.swing.JComboBox<String> cbxDepartamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JTable jtEmpleados1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
