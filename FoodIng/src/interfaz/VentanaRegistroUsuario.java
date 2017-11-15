package interfaz;

import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.Tipos;

public class VentanaRegistroUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private FileNameExtensionFilter filter;
    private ImageIcon perfil;

    public VentanaRegistroUsuario(Sistema miSis) {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        modelo = miSis;
        this.comboPaises.setModel(new DefaultComboBoxModel(Tipos.obtenerpaises()));
        jDate.setDateFormatString("dd/MM/yyyy");
        perfil = new ImageIcon(getClass().getResource("/imagenes/avatar.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        btnPreferencias = new javax.swing.JButton();
        lblPais1 = new javax.swing.JLabel();
        btnRegistroUsuario = new javax.swing.JButton();
        lblOKApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCampoNombre = new javax.swing.JTextField();
        lblFotoPerfil = new javax.swing.JLabel();
        btnChooser = new javax.swing.JButton();
        lblOkNombre = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblOKNacimiento = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        lblPais = new javax.swing.JLabel();
        lblOkPais = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboPaises = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de usuario");
        setMinimumSize(new java.awt.Dimension(638, 458));
        setPreferredSize(new java.awt.Dimension(638, 458));
        setResizable(false);
        setSize(new java.awt.Dimension(638, 458));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Seravek", 1, 27)); // NOI18N
        lblTitulo.setText("Registro de Usuario");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(210, 10, 250, 34);

        lblApellido.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(170, 130, 90, 24);

        lblNombre1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man-user.png"))); // NOI18N
        lblNombre1.setText("Nombre:");
        getContentPane().add(lblNombre1);
        lblNombre1.setBounds(170, 70, 90, 24);

        btnPreferencias.setText("Agregar");
        getContentPane().add(btnPreferencias);
        btnPreferencias.setBounds(420, 280, 140, 40);

        lblPais1.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblPais1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/adjust-button-with-plus-and-minus.png"))); // NOI18N
        lblPais1.setText("Preferencias y/o restricciones:");
        getContentPane().add(lblPais1);
        lblPais1.setBounds(170, 290, 260, 24);

        btnRegistroUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegistroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-a-contact-on-phone-interface-symbol-of-a-user-with-a-plus-sign.png"))); // NOI18N
        btnRegistroUsuario.setText("Registrar");
        getContentPane().add(btnRegistroUsuario);
        btnRegistroUsuario.setBounds(250, 340, 190, 50);

        lblOKApellido.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOKApellido);
        lblOKApellido.setBounds(560, 130, 60, 24);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(290, 120, 270, 40);
        getContentPane().add(txtCampoNombre);
        txtCampoNombre.setBounds(290, 60, 270, 40);

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_defecto.png"))); // NOI18N
        lblFotoPerfil.setText("imagen");
        getContentPane().add(lblFotoPerfil);
        lblFotoPerfil.setBounds(30, 60, 130, 130);

        btnChooser.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnChooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/export.png"))); // NOI18N
        btnChooser.setText("Importar");
        btnChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooserActionPerformed(evt);
            }
        });
        getContentPane().add(btnChooser);
        btnChooser.setBounds(30, 186, 130, 28);

        lblOkNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkNombre);
        lblOkNombre.setBounds(560, 70, 60, 24);

        lblNombre2.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblNombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-page-empty.png"))); // NOI18N
        lblNombre2.setText("Nacimiento:");
        getContentPane().add(lblNombre2);
        lblNombre2.setBounds(170, 190, 120, 24);

        lblOKNacimiento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOKNacimiento);
        lblOKNacimiento.setBounds(560, 190, 60, 24);

        jDate.setOpaque(false);
        getContentPane().add(jDate);
        jDate.setBounds(290, 180, 270, 40);

        lblPais.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        lblPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/international-delivery.png"))); // NOI18N
        lblPais.setText("País:");
        getContentPane().add(lblPais);
        lblPais.setBounds(170, 240, 80, 24);

        lblOkPais.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        getContentPane().add(lblOkPais);
        lblOkPais.setBounds(560, 220, 60, 24);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 50, 600, 12);

        getContentPane().add(comboPaises);
        comboPaises.setBounds(290, 230, 270, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chainimage-free-foods-and-drinks-powerpoint-backgroundswallpapers-download-ppt.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-110, -430, 770, 920);

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
        }    }//GEN-LAST:event_btnChooserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooser;
    private javax.swing.JButton btnPreferencias;
    private javax.swing.JButton btnRegistroUsuario;
    private javax.swing.JComboBox<String> comboPaises;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblOKApellido;
    private javax.swing.JLabel lblOKNacimiento;
    private javax.swing.JLabel lblOkNombre;
    private javax.swing.JLabel lblOkPais;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPais1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCampoNombre;
    // End of variables declaration//GEN-END:variables
}
