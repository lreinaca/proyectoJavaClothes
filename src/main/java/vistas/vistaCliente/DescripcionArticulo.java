package vistas.vistaCliente;

import clienteApi.CarritoComprasCliente;
import clienteApi.FavoritoCliente;
import clienteApi.ProductoCliente;
import javax.swing.JOptionPane;
import modelo.CarritoCompras;
import modelo.ENUMs.RolUsuario;
import modelo.Favorito;
import modelo.Producto;
import modelo.Usuario;
import service.FavoritoApiService;

public class DescripcionArticulo extends javax.swing.JFrame {

    // ATRIBUTO 
    Usuario usuarioLogueado;
    CarritoComprasCliente carritoComprasCliente;
    ProductoCliente productoCliente;
    FavoritoCliente favoritoCliente;
    Integer idProducto;

    // CONSTRUCTOR 
    public DescripcionArticulo(Usuario usuarioLogueado, Integer idProducto) {
        initComponents();
        setLocationRelativeTo(this);
        this.usuarioLogueado = usuarioLogueado;
        this.carritoComprasCliente = new CarritoComprasCliente();
        this.idProducto = idProducto;
        this.productoCliente = new ProductoCliente();
        this.favoritoCliente = new FavoritoCliente();
        diligenciarInfoProducto(idProducto);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagenProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JComboBox<>();
        btnFavorito = new javax.swing.JButton();
        txtMaterial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtIdProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imagenProducto.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://res.cloudinary.com/djn8thk2s/image/upload/v1745598736/camisaMasc2_dgtnvx.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        txtNombreProducto.setBackground(new java.awt.Color(0, 0, 0));
        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCarrito.setBackground(new java.awt.Color(0, 0, 0));
        btnCarrito.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/iconCompra.png"))); // NOI18N
        btnCarrito.setText("Agregar al carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Talla:");

        txtTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL" }));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Color:");

        txtColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLANCO", "NEGRO", "BEIGE", "CRUDO", "AZUL" }));

        btnFavorito.setBackground(new java.awt.Color(51, 51, 51));
        btnFavorito.setForeground(new java.awt.Color(255, 255, 255));
        btnFavorito.setText("Añadir a favoritos");
        btnFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritoActionPerformed(evt);
            }
        });

        txtMaterial.setForeground(new java.awt.Color(153, 153, 153));
        txtMaterial.setText(".");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("COMPOSICIÓN:");

        jLabel6.setText("ART. NÚM: ");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaterial)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(txtPrecio))
                                    .addComponent(btnCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreProducto)
                                    .addComponent(btnFavorito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(21, 21, 21)
                                        .addComponent(txtTalla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenProducto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtNombreProducto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(btnFavorito)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaterial)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // METODO PARA LLENAR LA INFORMACIÓN EN PANTALLA DEPENDIENDO DEL ID DE PRODUCTO QUE RECIBA
    private void diligenciarInfoProducto(Integer idProducto) {
        Producto productoAMostrar;
        try {
            productoAMostrar = productoCliente.findProductoById(idProducto);
            txtIdProducto.setText(String.valueOf(productoAMostrar.getProductoId()));
            txtPrecio.setText(String.valueOf(productoAMostrar.getPrecio()));
            txtNombreProducto.setText(productoAMostrar.getNombre());
            txtDescripcion.setText(productoAMostrar.getDescripcion());
            txtMaterial.setText(productoAMostrar.getMaterial());
            String talla = productoAMostrar.getTalla();
            txtTalla.setSelectedItem(talla);
            String color = productoAMostrar.getColor();
            txtColor.setSelectedItem(color);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritoActionPerformed
        try{
        JOptionPane.showMessageDialog(null, "Funcionalidad en Construccción");
        if(!(usuarioLogueado==null)){
            idProducto = Integer.parseInt(txtIdProducto.getText());
            int id = 12345;
            Favorito fav = new Favorito(id, usuarioLogueado, productoCliente.findProductoById(idProducto));
            favoritoCliente.createFavorito(fav);
            JOptionPane.showMessageDialog(null, "Añadido a favoritos");
        }else{
            JOptionPane.showMessageDialog(null, "¡Debes registrarte o iniciar sesion si deseas añadir una prenda a favoritos!");
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnFavoritoActionPerformed

    // METODO PARA AGREGAR UN PRODUCTO AL CARRITO DE COMPRAS 
    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        if(!(usuarioLogueado==null)){
        this.usuarioLogueado.getIdUsuario();
        int idCarritoCompras = 1;
        Integer idProducto = Integer.valueOf(txtIdProducto.getText());

        try {
            // 1ero buscar si existe un carrito de compras asociado a el usuario logueado
            CarritoCompras carritoExistente = carritoComprasCliente.findCarritoComprasById(idCarritoCompras, usuarioLogueado);
            carritoExistente.setUsuario(usuarioLogueado);
            carritoComprasCliente.updateCarritoCompras(carritoExistente, idProducto);
            JOptionPane.showMessageDialog(null, """
                                                El producto fue agregado a su carrito.
                                                Regrese al catalogo para agregar otros productos """);
        } catch (Exception e) {
            System.out.println("El carrito no existe, creando uno nuevo");
            CarritoCompras nuevoCarrito = new CarritoCompras(idCarritoCompras, usuarioLogueado);
            JOptionPane.showMessageDialog(null, """
                                                El producto fue agregado a su carrito.
                                                Regrese al catalogo para agregar otros productos """);
            try {
                carritoComprasCliente.createCarritoCompras(nuevoCarrito, idProducto);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Debes registrarte o iniciar sesion si deseas añadir una prenda a favoritos!");

        }

    }//GEN-LAST:event_btnCarritoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnFavorito;
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtColor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JLabel txtMaterial;
    private javax.swing.JLabel txtNombreProducto;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JComboBox<String> txtTalla;
    // End of variables declaration//GEN-END:variables
}
