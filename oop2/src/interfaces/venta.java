/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author FRANCIS
 */
public class venta extends javax.swing.JPanel {

    /**
     * Creates new form venta
     */
    public venta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelModelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelModelo.setText("Modelo");
        jPanel1.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

        cbLista.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaActionPerformed(evt);
            }
        });
        jPanel1.add(cbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 30));

        labelPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelPrecio.setText("Precio(S/)");
        jPanel1.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 20));

        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPrecio.setEnabled(false);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, -1));

        labelCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelCantidad.setText("Cantidad");
        jPanel1.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 20));

        txtCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, -1));

        txtBoleta.setColumns(20);
        txtBoleta.setRows(5);
        scroll.setViewportView(txtBoleta);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 370, 200));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, 30));

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
    }//GEN-LAST:event_cbListaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Los pructos han sido vendido");
    }//GEN-LAST:event_jLabel1MouseClicked


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
