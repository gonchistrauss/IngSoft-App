
package interfaz;
import dominio.Sistema;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class menuPrincipal extends javax.swing.JFrame {
    private Sistema modelo;
    
    public menuPrincipal(Sistema sis) {
        this.modelo = sis;
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistroUsuario = new javax.swing.JButton();
        btnRegistroProfesional = new javax.swing.JButton();
        labelFoodIng = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();
        btnIngreso1 = new javax.swing.JButton();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FoodIng");
        setMinimumSize(new java.awt.Dimension(650, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 440));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnRegistroUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistroUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnRegistroUsuario.setText("Configuración");
        btnRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroUsuario);
        btnRegistroUsuario.setBounds(40, 350, 180, 50);

        btnRegistroProfesional.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistroProfesional.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnRegistroProfesional.setText("Soy profesional");
        getContentPane().add(btnRegistroProfesional);
        btnRegistroProfesional.setBounds(450, 140, 180, 50);

        labelFoodIng.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        labelFoodIng.setText("FoodIng");
        getContentPane().add(labelFoodIng);
        labelFoodIng.setBounds(350, 20, 170, 40);

        btnIngreso.setBackground(new java.awt.Color(102, 102, 102));
        btnIngreso.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnIngreso.setText("Registro");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngreso);
        btnIngreso.setBounds(340, 80, 180, 50);

        btnIngreso1.setBackground(new java.awt.Color(102, 102, 102));
        btnIngreso1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnIngreso1.setText("Soy usuario");
        getContentPane().add(btnIngreso1);
        btnIngreso1.setBounds(240, 140, 180, 50);

        labelBackground.setIcon(new javax.swing.ImageIcon("/Users/gonzalostrauss/Downloads/rsz_nutrition.jpg")); // NOI18N
        getContentPane().add(labelBackground);
        labelBackground.setBounds(0, 0, 650, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            FileOutputStream file = new FileOutputStream("fooding.app");

            BufferedOutputStream buffer = new BufferedOutputStream(file);

            ObjectOutputStream obj = new ObjectOutputStream(buffer);

            obj.writeObject(modelo);

            obj.flush();
            obj.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException e) {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnIngreso1;
    private javax.swing.JButton btnRegistroProfesional;
    private javax.swing.JButton btnRegistroUsuario;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelFoodIng;
    // End of variables declaration//GEN-END:variables
}
