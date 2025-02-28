
package vistaVendedor;

import java.awt.BorderLayout;
import javax.swing.UIManager;
import vistaPrincipal.*;

public class VistaGestionPedidos extends javax.swing.JFrame {
  
    public VistaGestionPedidos() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("GESTION DE PEDIDOS");
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
        menuRealizados = new javax.swing.JMenu();
        jmenuAlistamientoPedidos = new javax.swing.JMenuItem();
        menuDisponible = new javax.swing.JMenu();
        jmenuPedidoParaEntregar = new javax.swing.JMenuItem();
        menuNoReclamado = new javax.swing.JMenu();
        jmenuPedidosNoReclamados = new javax.swing.JMenuItem();
        menuFacturado = new javax.swing.JMenu();
        jmenuPedidosFacturados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setPreferredSize(new java.awt.Dimension(930, 521));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pedidosVenta.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoTitulo.jpeg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BIENVENIDO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("NOMBRE DEL VENDEDOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 544, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
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

        menuRealizados.setText("Realizados");

        jmenuAlistamientoPedidos.setText("Pedidos para Empacar");
        jmenuAlistamientoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuAlistamientoPedidosActionPerformed(evt);
            }
        });
        menuRealizados.add(jmenuAlistamientoPedidos);

        jMenuBar1.add(menuRealizados);

        menuDisponible.setText("Disponibles");

        jmenuPedidoParaEntregar.setText("Pedidos para Entregar");
        jmenuPedidoParaEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuPedidoParaEntregarActionPerformed(evt);
            }
        });
        menuDisponible.add(jmenuPedidoParaEntregar);

        jMenuBar1.add(menuDisponible);

        menuNoReclamado.setText("No Reclamados");

        jmenuPedidosNoReclamados.setText("Pedidos para Devolver a Inventario");
        jmenuPedidosNoReclamados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuPedidosNoReclamadosActionPerformed(evt);
            }
        });
        menuNoReclamado.add(jmenuPedidosNoReclamados);

        jMenuBar1.add(menuNoReclamado);

        menuFacturado.setText("Facturados");

        jmenuPedidosFacturados.setText("Pedidos Facturados");
        jmenuPedidosFacturados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuPedidosFacturadosActionPerformed(evt);
            }
        });
        menuFacturado.add(jmenuPedidosFacturados);

        jMenuBar1.add(menuFacturado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
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

    private void jmenuAlistamientoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuAlistamientoPedidosActionPerformed
        PedidosRealizados vr = new PedidosRealizados();
        vr.setSize(1200,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuAlistamientoPedidosActionPerformed

    private void jmenuPedidoParaEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuPedidoParaEntregarActionPerformed
        PedidosDisponibles vr = new PedidosDisponibles();
        vr.setSize(1200,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuPedidoParaEntregarActionPerformed

    private void jmenuPedidosFacturadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuPedidosFacturadosActionPerformed
        PedidosFacturados vr = new PedidosFacturados();
        vr.setSize(1200,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuPedidosFacturadosActionPerformed

    private void jmenuPedidosNoReclamadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuPedidosNoReclamadosActionPerformed
        PedidosNoEntregados vr = new PedidosNoEntregados();
        vr.setSize(1200,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_jmenuPedidosNoReclamadosActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGestionPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jmenuAlistamientoPedidos;
    private javax.swing.JMenuItem jmenuCheckOut;
    private javax.swing.JMenuItem jmenuPedidoParaEntregar;
    private javax.swing.JMenuItem jmenuPedidosFacturados;
    private javax.swing.JMenuItem jmenuPedidosNoReclamados;
    private javax.swing.JMenu menuDisponible;
    private javax.swing.JMenu menuFacturado;
    private javax.swing.JMenu menuNoReclamado;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuRealizados;
    // End of variables declaration//GEN-END:variables
}
