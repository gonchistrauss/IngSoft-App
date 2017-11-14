package interfaz;

import dominio.*;
import javax.swing.ImageIcon;

public class VentanaSeleccionUsuario extends javax.swing.JDialog {

    private Sistema modelo;

    public VentanaSeleccionUsuario(Sistema miSis) {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        modelo = miSis;
        cargarLista();
        listaUsuarios.setSelectedIndex(0);
    }

    public void cargarLista() {
        listaUsuarios.setListData(modelo.getListaUsuarios().toArray());
    }

    public void cargarPrevisualizacion() {
        Usuario usuarioSeleccionado = (Usuario) listaUsuarios.getSelectedValue();
        imgPerfil.setIcon(new ImageIcon(getClass().getResource(usuarioSeleccionado.getPathPerfil())));
        lblNacimiento.setText(usuarioSeleccionado.getFechaDeNacimiento().toString());
        lblNacionalidad.setText(usuarioSeleccionado.getNacionalidad().getCountry());
        lblNombre.setText(usuarioSeleccionado.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();
        btnSeleccionUsuario = new javax.swing.JButton();
        panelPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgPerfil = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblSeleccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaUsuarios.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUsuariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 253, -1));

        btnSeleccionUsuario.setText("Ingresar");
        btnSeleccionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        panelPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Previsualizacion:");
        panelPerfil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        panelPerfil.add(imgPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 100));

        lblNombre.setText("fdfs");
        panelPerfil.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 160, 20));

        lblNacimiento.setText("dasd");
        panelPerfil.add(lblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, 20));

        lblNacionalidad.setText("424242");
        panelPerfil.add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 20));

        getContentPane().add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 290, 240));

        lblSeleccion.setText("Seleccione un usuario:");
        getContentPane().add(lblSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionUsuarioActionPerformed
        Usuario usuarioSeleccionado = (Usuario) listaUsuarios.getSelectedValue();
        usuarioSeleccionado.setSesionActiva(true);
        VentanaPanelUsuario ventana = new VentanaPanelUsuario(modelo);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionUsuarioActionPerformed

    private void listaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosValueChanged
        cargarPrevisualizacion();
    }//GEN-LAST:event_listaUsuariosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionUsuario;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JList<Object> listaUsuarios;
    private javax.swing.JPanel panelPerfil;
    // End of variables declaration//GEN-END:variables
}
