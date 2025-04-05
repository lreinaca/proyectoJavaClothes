
package vistas.vistaAdministrador;

import java.awt.BorderLayout;
import javax.swing.UIManager;
import vistas.vistaPrincipal.VistaPrincipal;

public class VistaAdministracionProductos extends javax.swing.JFrame {
  
    public VistaAdministracionProductos() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("ADMINISTRACION DE INVENTARIOS");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPerfil = new javax.swing.JMenu();
        jmenuCheckOut = new javax.swing.JMenuItem();
        menuInventario = new javax.swing.JMenu();
        jmenuStock = new javax.swing.JMenuItem();
        jmenuNuevoProducto = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        jmenuPedidoParaEntregar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setPreferredSize(new java.awt.Dimension(930, 521));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/principalAdmin.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoTitulo.jpeg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BIENVENIDO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("NOMBRE DEL ADMINISTRADOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(77, 77, 77))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel5)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(182, 182, 182))
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        menuPerfil.setBackground(new java.awt.Color(153, 153, 255));
        menuPerfil.setForeground(new java.awt.Color(60, 63, 65));
        menuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/iconPerfil.png"))); // NOI18N
        menuPerfil.setFocusPainted(true);
        menuPerfil.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        menuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfilActionPerformed(evt);
            }
        });

        jmenuCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmenuCheckOut.setText("Cerrar sesión");
        jmenuCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCheckOutActionPerformed(evt);
            }
        });
        menuPerfil.add(jmenuCheckOut);

        jMenuBar1.add(menuPerfil);

        menuInventario.setText("Inventario");

        jmenuStock.setText("Ver Stock");
        jmenuStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuStockActionPerformed(evt);
            }
        });
        menuInventario.add(jmenuStock);

        jmenuNuevoProducto.setText("Agregar Nuevo Producto");
        jmenuNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuNuevoProductoActionPerformed(evt);
            }
        });
        menuInventario.add(jmenuNuevoProducto);

        jMenuBar1.add(menuInventario);

        menuVentas.setText("Ventas");

        jmenuPedidoParaEntregar.setText("Generar Reporte de Ventas");
        jmenuPedidoParaEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuPedidoParaEntregarActionPerformed(evt);
            }
        });
        menuVentas.add(jmenuPedidoParaEntregar);

        jMenuBar1.add(menuVentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfilActionPerformed

    }//GEN-LAST:event_menuPerfilActionPerformed

    private void jmenuCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCheckOutActionPerformed
        //CIERRE DE  SESIÓN
        VistaPrincipal vista = new VistaPrincipal();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuCheckOutActionPerformed

    private void jmenuStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuStockActionPerformed
        Inventario vr = new Inventario();
        vr.setSize(1200,600);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuStockActionPerformed

    private void jmenuPedidoParaEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuPedidoParaEntregarActionPerformed
        ReporteVentas vr = new ReporteVentas();
        vr.setSize(1200,600);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuPedidoParaEntregarActionPerformed

    private void jmenuNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuNuevoProductoActionPerformed
        NuevoProducto vr = new NuevoProducto();
        vr.setSize(1200,600);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuNuevoProductoActionPerformed

//    public static void main(String args[]) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaAdministracionProductos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jmenuCheckOut;
    private javax.swing.JMenuItem jmenuNuevoProducto;
    private javax.swing.JMenuItem jmenuPedidoParaEntregar;
    private javax.swing.JMenuItem jmenuStock;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}
