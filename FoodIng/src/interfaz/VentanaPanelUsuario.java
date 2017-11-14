package interfaz;

import dominio.*;
import utils.Tipos;
import utils.Tipos.Categoria;

public class VentanaPanelUsuario extends javax.swing.JDialog {

    private Sistema modelo;
    private Usuario usuario;

    public VentanaPanelUsuario(Sistema miSis) {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        modelo = miSis;
        usuario = modelo.obtenerSesionActivaUsuario();
        System.out.println(usuario.toString());
        Consulta nuevaConsulta = new Consulta(usuario, Categoria.DIRECTA);
        System.out.println("Consulta:" + nuevaConsulta.toStringDescripcion());
        usuario.agregarConsulta(nuevaConsulta);
        cargarListaConsultas();
    }

    public void cargarListaConsultas() {
        listaConsultas.setListData(usuario.getConsultas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaConsultas = new javax.swing.JList<>();
        panelMensajes = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel de usuario");
        setMinimumSize(new java.awt.Dimension(820, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(listaConsultas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 30, 200, 132);

        jTextPane1.setEditable(false);
        panelMensajes.setViewportView(jTextPane1);

        getContentPane().add(panelMensajes);
        panelMensajes.setBounds(440, 30, 360, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        usuario.setSesionActiva(false);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<Object> listaConsultas;
    private javax.swing.JScrollPane panelMensajes;
    // End of variables declaration//GEN-END:variables
}
