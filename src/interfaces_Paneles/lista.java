package interfaces_Paneles;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import metodo.Conexion;

/**
 *
 * @author FRANCIS
 */
public class lista extends javax.swing.JPanel {
                     
    Conexion conexion = new Conexion();
    Connection conn;
    
    public lista() {
        initComponents();
        conn = conexion.conectar();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        mostrarTable = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 430));

        fondo.setBackground(new java.awt.Color(14, 26, 36));
        fondo.setMinimumSize(new java.awt.Dimension(400, 430));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mostrarTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarTable.setText("Mostrar");
        mostrarTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mostrarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 30));

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

        fondo.add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

   //Thats a method which help me doing a table with my database values
    private void mostrarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarTableMouseClicked
        // TODO add your handling code here:
        ListarProductosDeBaseDatos();
    }//GEN-LAST:event_mostrarTableMouseClicked

// Metodo para que imprima los datos de la database en formato tabla correctamente
    private void ListarProductosDeBaseDatos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Caracteristicas");
            modelo.addColumn("Valores");
            String sql = "Select * from left4tech.producto";
            Statement declaracion =  conn.createStatement();
            ResultSet resultadoSeteado = declaracion.executeQuery(sql);
            
            int id = 1;
            while(resultadoSeteado.next()){
            modelo.addRow(new Object[]{
                "Producto N°", id});
            modelo.addRow(new Object[]{
                "Modelo", resultadoSeteado.getString("modelo")});
            modelo.addRow(new Object[]{
                "Código Producto", resultadoSeteado.getString("cod_producto")});
            modelo.addRow(new Object[]{
                "Placa", resultadoSeteado.getString("placa")});
            modelo.addRow(new Object[]{
                "Procesador", resultadoSeteado.getString("procesador")});
            modelo.addRow(new Object[]{
                "Ram", resultadoSeteado.getString("ram")});
            modelo.addRow(new Object[]{
                "Tarjeta Gráfica", resultadoSeteado.getString("tarjeta_grafica")});
            modelo.addRow(new Object[]{
                "Almacenamiento", resultadoSeteado.getString("almacenamiento")});
            modelo.addRow(new Object[]{
                "Stock", resultadoSeteado.getString("stock")});
            modelo.addRow(new Object[]{
                "Precio", "S/ " + resultadoSeteado.getString("precio")});
            modelo.addRow(new Object[]{
                });
            modelo.addRow(new Object[]{
                });
            
            id++;
            } 
            table.setModel(modelo);
            
        } catch (SQLException ex) {
           System.out.println("Error al mostrar los productos: " +ex.getMessage());
        }
        
    }   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mostrarTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
