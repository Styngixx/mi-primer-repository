/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;
import java.sql.*;
import java.sql.Statement;
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
    /**
     * Creates new form consulta
     */
    public consulta() {
        initComponents();
        conn = conexion.conectar();
        cargarCBLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        cbLista.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLista.setBorder(null);
        cbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelTitulo.setText("Selecciona un modelo:");

        labelPlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPlaca.setText("Placa");

        txtPlaca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca.setEnabled(false);

        labelProcesador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelProcesador.setText("Procesador");

        txtProcesador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtProcesador.setForeground(new java.awt.Color(0, 0, 0));
        txtProcesador.setEnabled(false);

        labelRam.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelRam.setText("Ram");

        txtRam.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtRam.setForeground(new java.awt.Color(0, 0, 0));
        txtRam.setEnabled(false);

        labelTarjeta_Grafica.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelTarjeta_Grafica.setText("Tarjeta Gráfica");

        txtTarjeta_Grafica.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTarjeta_Grafica.setForeground(new java.awt.Color(0, 0, 0));
        txtTarjeta_Grafica.setEnabled(false);

        labelAlmacenamiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelAlmacenamiento.setText("Almacenamiento");

        txtAlmacenamiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAlmacenamiento.setForeground(new java.awt.Color(0, 0, 0));
        txtAlmacenamiento.setEnabled(false);

        labelPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPrecio.setText("Precio");

        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setEnabled(false);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTarjeta_Grafica, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(labelRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAlmacenamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtProcesador)
                    .addComponent(txtRam)
                    .addComponent(txtTarjeta_Grafica)
                    .addComponent(txtAlmacenamiento)
                    .addComponent(txtPrecio))
                .addGap(55, 55, 55))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(cbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(cbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProcesador))
                .addGap(25, 25, 25)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRam))
                .addGap(23, 23, 23)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTarjeta_Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTarjeta_Grafica))
                .addGap(33, 33, 33)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlmacenamiento))
                .addGap(30, 30, 30)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 430, 440));
    }// </editor-fold>//GEN-END:initComponents

    //metodo para que cuando se escoga un modelo sus caracteristicas
    //se rellenen automaticamente en sus respectivos campos
    private void cbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaActionPerformed
        try {
            // TODO add your handling code here:
            String seleccionado = (String) cbLista.getSelectedItem();
            String sql = "SELECT * FROM left4tech.producto WHERE modelo =?";
            PreparedStatement InstanciaPreparada = conn.prepareStatement(sql);
            InstanciaPreparada.setString(1, seleccionado);
            ResultSet resultadoSeteado = InstanciaPreparada.executeQuery();
            
            while(resultadoSeteado.next()){
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
