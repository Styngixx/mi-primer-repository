package interfaces_Paneles;

import clases.ArregloBoleta;
import clases.Boleta;
import clases.descuento;
import clases.obsequiosDatos;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodo.Conexion;

/**
 *
 * @author FRANCIS
 */
public class venta extends javax.swing.JPanel {
    Conexion conexion = new Conexion();
    Connection conn;
    int contador = 0;
    ArregloBoleta resumen = new ArregloBoleta();
    Boleta bolet = new Boleta();
    
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
        txtStock = new javax.swing.JTextField();
        labelStock = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        panelVender = new javax.swing.JPanel();
        labelVender = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelCantidad = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(400, 430));

        jPanel1.setBackground(new java.awt.Color(14, 26, 36));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 430));
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

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtStock.setOpaque(true);
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 180, 30));

        labelStock.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelStock.setForeground(new java.awt.Color(255, 255, 255));
        labelStock.setText("Stock");
        jPanel1.add(labelStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        txtCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, 30));

        panelVender.setBackground(new java.awt.Color(0, 65, 86));
        panelVender.setForeground(new java.awt.Color(255, 255, 255));

        labelVender.setBackground(new java.awt.Color(14, 26, 36));
        labelVender.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        labelVender.setForeground(new java.awt.Color(255, 255, 255));
        labelVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVender.setText("Vender");
        labelVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVenderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVenderLayout = new javax.swing.GroupLayout(panelVender);
        panelVender.setLayout(panelVenderLayout);
        panelVenderLayout.setHorizontalGroup(
            panelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVenderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelVender, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelVenderLayout.setVerticalGroup(
            panelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVenderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelVender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, 30));

        table.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Scroll.setViewportView(table);

        jPanel1.add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 350, 200));

        labelCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad");
        jPanel1.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 30));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPrecio.setOpaque(true);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
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
                txtStock.setText(resultadoSeteado.getString("stock"));
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
    
    private void labelVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVenderMouseClicked
        // TODO add your handling code here:
        logistica();
        voucher();         
    }//GEN-LAST:event_labelVenderMouseClicked
    
    //resta la cantidad ingresada con el stock establecido
    private void logistica(){
    try{
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int stock = Integer.parseInt(txtStock.getText());
        
        if(cantidad > stock){
        JOptionPane.showMessageDialog(this, "Error en la cantidad ingresada",
                    "Valor incorrecto", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        int nuevoStock = stock - cantidad;
        txtStock.setText(String.valueOf(nuevoStock)); 

        
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Error inesperado",
                "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            }
       }       
    
    
    //printea el voucher
    private void voucher() {
        try {
        if (!obsequiosDatos.osequiosConfigurados()) {
            JOptionPane.showMessageDialog(this, "Debe configurar los obsequios primero",
                    "Obsequios no configurados", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double precio = Double.parseDouble(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(this,
                    "ERROR: Verifique los campos de cantidad contengan valores válidos",
                    "ERROR EN DATOS", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double importeCompra = precio * cantidad;
        String obsequioSeleccionado = obsequiosDatos.getObsequioPorCantidad(cantidad);
        double porcentajeDescuento = descuento.getDescuentoPorCantidad(cantidad);
        double importeDescuento = importeCompra * porcentajeDescuento;
        importeDescuento = Redondeo(importeDescuento);
        double importeTotal = importeCompra - importeDescuento;
        importeTotal = Redondeo(importeTotal);
        
     
        // Limpiar las filas anteriores
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(0); // Limpiar las filas antes de agregar nuevas
        modelo.addColumn("Descripción");
        modelo.addColumn("");
        int code = 9;
 
        modelo.addRow(new Object[]{"Boleta N°", "B01"+ code});
        modelo.addRow(new Object[]{"Modelo", cbLista.getSelectedItem()});
        modelo.addRow(new Object[]{"Precio", txtPrecio.getText()});
        modelo.addRow(new Object[]{"Cantidad", txtCantidad.getText()});
        modelo.addRow(new Object[]{"Importe Neto", importeCompra});
        modelo.addRow(new Object[]{"Importe Descuento", importeDescuento});
        modelo.addRow(new Object[]{"Importe a pagar", importeTotal});
        modelo.addRow(new Object[]{"Obsequio", obsequioSeleccionado});
        table.setModel(modelo);

        
            Boleta Boleta = new Boleta(precio, cantidad, porcentajeDescuento);
            resumen.agregarBoleta(Boleta);
            
            contador++;
             comprobarContador(contador);
             
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ERROR: Verifique los campos de cantidad contengan valores válidos",
                "ERROR EN DATOS", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(this, "Error inesperado",
                "Algo salió mal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        void mensaje(String e){
        JOptionPane.showMessageDialog(null, e);
    }   
    
    private void comprobarContador(int contador){
             if (contador % 5 == 0) {           
                mensaje("********* RESUMEN DE VENTAS N°"+contador+" *********\n"+
                        "Total acumulado a pagar: S/ " + resumen.sumarImportePagar()+"\n"+
                        "Porcentaje de la cuota diaria : "+resumen.PorcentajeDiario()+"%"+"\n");    
            } 
    }


       private double Redondeo (double x){
           return ( Math.round(x * 100)/100.0 );
       }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JComboBox<String> cbLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelVender;
    private javax.swing.JPanel panelVender;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
