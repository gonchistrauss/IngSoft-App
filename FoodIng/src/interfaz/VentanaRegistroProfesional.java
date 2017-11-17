package interfaz;

import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.Tipos;

public class VentanaRegistroProfesional extends javax.swing.JDialog {

    private Sistema modelo;
    private FileNameExtensionFilter filter;
    private ImageIcon perfil;
    private String profilePath;

    public VentanaRegistroProfesional(Sistema miSis) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        modelo = miSis;
        this.comboPaises.setModel(new DefaultComboBoxModel(Tipos.obtenerpaises()));
        jDate.setDateFormatString("dd/MM/yyyy");
        this.dateFechaGraduacion.setDateFormatString("dd/MM/yyyy");
        profilePath = "/imagenes/perfil_defecto.png";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCampoNombre = new javax.swing.JTextField();
        lblOkNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblOKApellido = new javax.swing.JLabel();
        btnChooser = new javax.swing.JButton();
        lblNacimiento = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        lblOKNacimiento = new javax.swing.JLabel();
        lblProfesionales = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        lblPersonales = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblOkTitulo = new javax.swing.JLabel();
        lblGraduacion = new javax.swing.JLabel();
        dateFechaGraduacion = new com.toedter.calendar.JDateChooser();
        lblOkGraduacion = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        comboPaises = new javax.swing.JComboBox<>();
        btnRegistroProfesional = new javax.swing.JButton();
        separador3 = new javax.swing.JSeparator();
        lblFotoProfesional = new javax.swing.JLabel();
        fondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de profesional");
        setBounds(new java.awt.Rectangle(0, 23, 647, 541));
        setMinimumSize(new java.awt.Dimension(647, 541));
        setPreferredSize(new java.awt.Dimension(647, 541));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(separador1);
        separador1.setBounds(10, 50, 600, 12);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/id-card (1).png"))); // NOI18N
        lblTitulo.setText("Registro de Profesional");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(170, 0, 320, 64);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        lblFotoPerfil.setText("imagen");
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 90, 130, 130);

        lblNombre.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(170, 100, 90, 24);
        getContentPane().add(txtCampoNombre);
        txtCampoNombre.setBounds(290, 90, 270, 40);

        lblOkNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkNombre);
        lblOkNombre.setBounds(560, 100, 60, 24);

        lblApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(170, 160, 90, 24);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(290, 150, 270, 40);

        lblOKApellido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOKApellido);
        lblOKApellido.setBounds(560, 160, 60, 24);

        btnChooser.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnChooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/export.png"))); // NOI18N
        btnChooser.setText("Importar");
        btnChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooserActionPerformed(evt);
            }
        });
        getContentPane().add(btnChooser);
        btnChooser.setBounds(30, 210, 130, 28);

        lblNacimiento.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNacimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblNacimiento.setText("Nacimiento:");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(170, 220, 120, 24);

        jDate.setOpaque(false);
        getContentPane().add(jDate);
        jDate.setBounds(290, 210, 270, 40);

        lblOKNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOKNacimiento);
        lblOKNacimiento.setBounds(560, 220, 60, 24);

        lblProfesionales.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblProfesionales.setText("Datos profesionales:");
        getContentPane().add(lblProfesionales);
        lblProfesionales.setBounds(270, 280, 160, 17);
        getContentPane().add(separador2);
        separador2.setBounds(20, 270, 590, 10);

        lblPersonales.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPersonales.setText("Datos personales:");
        getContentPane().add(lblPersonales);
        lblPersonales.setBounds(260, 60, 130, 17);

        lblApellido1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido1.setText("Titulo:");
        getContentPane().add(lblApellido1);
        lblApellido1.setBounds(170, 310, 90, 24);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(290, 300, 270, 40);

        lblOkTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkTitulo);
        lblOkTitulo.setBounds(560, 310, 60, 24);

        lblGraduacion.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblGraduacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblGraduacion.setText("Graduacion:");
        getContentPane().add(lblGraduacion);
        lblGraduacion.setBounds(170, 370, 120, 24);

        dateFechaGraduacion.setOpaque(false);
        getContentPane().add(dateFechaGraduacion);
        dateFechaGraduacion.setBounds(290, 360, 270, 40);

        lblOkGraduacion.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkGraduacion);
        lblOkGraduacion.setBounds(560, 370, 60, 24);

        lblPais.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/international-delivery.png"))); // NOI18N
        lblPais.setText("País:");
        getContentPane().add(lblPais);
        lblPais.setBounds(170, 420, 80, 24);

        getContentPane().add(comboPaises);
        comboPaises.setBounds(290, 410, 270, 40);

        btnRegistroProfesional.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegistroProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/businessman.png"))); // NOI18N
        btnRegistroProfesional.setText("Registrar");
        btnRegistroProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroProfesionalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroProfesional);
        btnRegistroProfesional.setBounds(250, 460, 190, 50);
        getContentPane().add(separador3);
        separador3.setBounds(20, 450, 610, 12);

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifying-lens-as-head-of-business-professional (1).png"))); // NOI18N
        lblFotoProfesional.setText("imagen");
        getContentPane().add(lblFotoProfesional);
        lblFotoProfesional.setBounds(30, 280, 130, 160);

        fondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chainimage-free-foods-and-drinks-powerpoint-backgroundswallpapers-download-ppt.jpg"))); // NOI18N
        fondoRegistro.setText("jLabel2");
        getContentPane().add(fondoRegistro);
        fondoRegistro.setBounds(-20, -410, 790, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooserActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        int opcion = chooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            ImageIcon icono = new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
            perfil = icono;
            lblFotoPerfil.setIcon(perfil);
            profilePath = chooser.getSelectedFile().getAbsolutePath();
        }
    }//GEN-LAST:event_btnChooserActionPerformed

   
    private boolean datosVerificados() {
        return true;
    }
    
    private void btnRegistroProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroProfesionalActionPerformed
        if (datosVerificados()) {
            modelo.agregarProfesional(txtCampoNombre.getText(), this.txtApellido.getText(), this.jDate.getDate(), profilePath, this.txtTitulo.getText(), this.comboPaises.getSelectedItem().toString(), this.dateFechaGraduacion.getDate());
            JOptionPane.showMessageDialog(null, "Profesional registrado exitosamente.", "Mensaje", 0, new ImageIcon(getClass().getResource("/imagenes/businessman.png")));
            System.out.println(this.profilePath);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegistroProfesionalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooser;
    private javax.swing.JButton btnRegistroProfesional;
    private javax.swing.JComboBox<String> comboPaises;
    private com.toedter.calendar.JDateChooser dateFechaGraduacion;
    private javax.swing.JLabel fondoRegistro;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblGraduacion;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOKApellido;
    private javax.swing.JLabel lblOKNacimiento;
    private javax.swing.JLabel lblOkGraduacion;
    private javax.swing.JLabel lblOkNombre;
    private javax.swing.JLabel lblOkTitulo;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPersonales;
    private javax.swing.JLabel lblProfesionales;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCampoNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
