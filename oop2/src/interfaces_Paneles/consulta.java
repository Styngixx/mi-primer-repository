package interfaces_Paneles;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import metodo.Conexion;

/**
 *
 * @author FRANCIS
 */
public class consulta extends javax.swing.JPanel {
    Conexion conexion = new Conexion();
    Connection conn;

    public consulta() {
        initComponents();
        conn = conexion.conectar();
        cargarCBLista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        cbLista = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        labelProcesador = new javax.swing.JLabel();
        txtProcesador = new javax.swing.JTextField();
        labelRam = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        labelTarjeta_Grafica = new javax.swing.JLabel();
        txtTarjeta_Grafica = new javax.swing.JTextField();
        labelAlmacenamiento = new javax.swing.JLabel();
        txtAlmacenamiento = new javax.swing.JTextField();
        labelPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        fondo.setBackground(new java.awt.Color(14, 26, 36));
        fondo.setEnabled(false);
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbLista.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLista.setBorder(null);
        cbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaActionPerformed(evt);
            }
        });
        fondo.add(cbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 30));

        labelTitulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Selecciona un modelo:");
        fondo.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        labelPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(255, 255, 255));
        labelPlaca.setText("Placa");
        fondo.add(labelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 58, 20));

        txtPlaca.setEditable(false);
        txtPlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca.setFocusable(false);
        txtPlaca.setOpaque(true);
        fondo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 220, -1));

        labelProcesador.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelProcesador.setForeground(new java.awt.Color(255, 255, 255));
        labelProcesador.setText("Procesador");
        fondo.add(labelProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        txtProcesador.setEditable(false);
        txtProcesador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtProcesador.setForeground(new java.awt.Color(0, 0, 0));
        txtProcesador.setFocusable(false);
        txtProcesador.setOpaque(true);
        fondo.add(txtProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, -1));

        labelRam.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelRam.setForeground(new java.awt.Color(255, 255, 255));
        labelRam.setText("Ram");
        fondo.add(labelRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        txtRam.setEditable(false);
        txtRam.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtRam.setForeground(new java.awt.Color(0, 0, 0));
        txtRam.setOpaque(true);
        fondo.add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, -1));

        labelTarjeta_Grafica.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelTarjeta_Grafica.setForeground(new java.awt.Color(255, 255, 255));
        labelTarjeta_Grafica.setText("Tarjeta Gráfica");
        fondo.add(labelTarjeta_Grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, -1));

        txtTarjeta_Grafica.setEditable(false);
        txtTarjeta_Grafica.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTarjeta_Grafica.setForeground(new java.awt.Color(0, 0, 0));
        txtTarjeta_Grafica.setFocusable(false);
        txtTarjeta_Grafica.setOpaque(true);
        fondo.add(txtTarjeta_Grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, -1));

        labelAlmacenamiento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelAlmacenamiento.setForeground(new java.awt.Color(255, 255, 255));
        labelAlmacenamiento.setText("Almacenamiento");
        fondo.add(labelAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtAlmacenamiento.setEditable(false);
        txtAlmacenamiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAlmacenamiento.setForeground(new java.awt.Color(0, 0, 0));
        txtAlmacenamiento.setFocusable(false);
        txtAlmacenamiento.setOpaque(true);
        fondo.add(txtAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 220, -1));

        labelPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio");
        fondo.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setFocusable(false);
        txtPrecio.setOpaque(true);
        fondo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaActionPerformed
        try {
            // TODO add your handling code here:
            String selecionado = (String) cbLista.getSelectedItem();
            String sql = "Select * from left4tech.producto WHERE modelo =?";
            PreparedStatement instanciaPreparada = conn.prepareStatement(sql);
            instanciaPreparada.setString(1,selecionado);
            ResultSet resultadoSeteado = instanciaPreparada.executeQuery();
            
            
            while (resultadoSeteado.next()){
                txtPlaca.setText(resultadoSeteado.getString("placa"));
                txtProcesador.setText(resultadoSeteado.getString("procesador"));
                txtRam.setText(resultadoSeteado.getString("ram"));
                txtTarjeta_Grafica.setText(resultadoSeteado.getString("tarjeta_grafica"));
                txtAlmacenamiento.setText(resultadoSeteado.getString("almacenamiento"));
                txtPrecio.setText(resultadoSeteado.getString("precio"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbListaActionPerformed
  
    //metodo para que aparezcan los datos de la base de datos en el combo box
    public final void cargarCBLista (){
        try {
            String sql = "SELECT modelo FROM producto";
            Statement declaracion = conn.createStatement();
            ResultSet resultadoSeteado = declaracion.executeQuery(sql);
            cbLista.removeAllItems();
            
            while(resultadoSeteado.next()){
            cbLista.addItem(resultadoSeteado.getString("modelo"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLista;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel labelAlmacenamiento;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelProcesador;
    private javax.swing.JLabel labelRam;
    private javax.swing.JLabel labelTarjeta_Grafica;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtAlmacenamiento;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTarjeta_Grafica;
    // End of variables declaration//GEN-END:variables
}
