package interfaces_Paneles;

import clases.descuento;
import clases.obsequiosDatos;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import metodo.Conexion;

/**
 *
 * @author FRANCIS
 */
public class venta extends javax.swing.JPanel {
    Conexion conexion = new Conexion();
    Connection conn;
    
    public venta() {
        initComponents();
        conn= conexion.conectar();
        cargarLista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        cbLista = new javax.swing.JComboBox<>();
        labelPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        labelCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        txtBoleta = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(14, 26, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelModelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(255, 255, 255));
        labelModelo.setText("Modelo");
        jPanel1.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        cbLista.setBackground(new java.awt.Color(153, 153, 153));
        cbLista.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaActionPerformed(evt);
            }
        });
        jPanel1.add(cbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 280, 30));

        labelPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio(S/)");
        jPanel1.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 30));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPrecio.setOpaque(true);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, 30));

        labelCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad");
        jPanel1.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 180, 30));

        txtBoleta.setEditable(false);
        txtBoleta.setBackground(new java.awt.Color(255, 255, 255));
        txtBoleta.setColumns(20);
        txtBoleta.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        txtBoleta.setForeground(new java.awt.Color(0, 0, 0));
        txtBoleta.setRows(5);
        txtBoleta.setWrapStyleWord(true);
        scroll.setViewportView(txtBoleta);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, 270));

        jPanel2.setBackground(new java.awt.Color(0, 65, 86));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(14, 26, 36));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vender");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaActionPerformed
        // TODO add your handling code here:
        try{
            String seleccionado = (String) cbLista.getSelectedItem();
            String sql = "SELECT * FROM left4tech.producto WHERE modelo = ?";
            PreparedStatement InstanciaPreparada = conn.prepareStatement(sql);
            InstanciaPreparada.setString(1, seleccionado);    
            ResultSet resultadoSeteado;
            resultadoSeteado = InstanciaPreparada.executeQuery();
                        
                while(resultadoSeteado.next()){
                txtPrecio.setText(resultadoSeteado.getString("precio"));
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
              
    }//GEN-LAST:event_cbListaActionPerformed

        private void cargarLista(){
        try {
            String sql = "SELECT modelo FROM left4tech.producto";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbLista.removeAllItems();
            while(rs.next()){
                cbLista.addItem(rs.getString("modelo"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        voucher();                 
    }//GEN-LAST:event_jLabel1MouseClicked

       private void voucher(){
         
         try{
           if(!obsequiosDatos.osequiosConfigurados()){
           JOptionPane.showMessageDialog(this, "Debe configurar los obsequios primero",
                   "Obsequios no configirados", JOptionPane.WARNING_MESSAGE);
           return;
           }

          double precio= Double.parseDouble(txtPrecio.getText());
          int cantidad = Integer.parseInt(txtCantidad.getText());
         if(cantidad == 0){
                   JOptionPane.showMessageDialog(this, "ERROR: Verifique los campos de cantidad contengan valores válidos",
                     "ERROR EN DATOS", JOptionPane.ERROR_MESSAGE);
           }
          String importeCompra = String.valueOf(precio * cantidad);
            
          String obsequioSeleccionado = obsequiosDatos.getObsequioPorCantidad(cantidad);
           double porcentajeDescuento = descuento.getDescuentoPorCantidad(cantidad);
           double importeDescuento;
           importeDescuento = (Double.parseDouble(importeCompra) * porcentajeDescuento);
           importeDescuento = Redondeo(importeDescuento);
            double importeTotal;
             importeTotal = (Double.parseDouble(importeCompra)  - importeDescuento);
             importeTotal = Redondeo(importeTotal);

            txtBoleta.setText("");              
            txtBoleta.append("Modelo                    :"+ cbLista.getSelectedItem());
            txtBoleta.append("\nPrecio                    : "+ txtPrecio.getText());
            txtBoleta.append("\nCantidad                    : "+ txtCantidad.getText());
            txtBoleta.append("\nImporte Neto                    : "+ importeCompra);
            txtBoleta.append("\nImporte Descuento                    : " + importeDescuento);
            txtBoleta.append("\nImporte a Pagar                   : " + importeTotal);
            txtBoleta.append("\nObsequio                    : " + obsequioSeleccionado);
            
         }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this, "ERROR: Verifique los campos de cantidad contengan valores válidos",
                     "ERROR EN DATOS", JOptionPane.ERROR_MESSAGE);
         }catch(HeadlessException e){
             JOptionPane.showMessageDialog(this, "Error inesperado",
                     "Algo salió mal", JOptionPane.ERROR_MESSAGE);
         } 
    }

       private double Redondeo (double x){
           return ( Math.round(x * 100)/100.0 );
       }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea txtBoleta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
