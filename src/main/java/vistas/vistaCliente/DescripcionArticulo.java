package vistas.vistaCliente;

import clienteApi.CarritoComprasCliente;
import clienteApi.DetalleCarritoCliente;
import clienteApi.FavoritoCliente;
import clienteApi.ProductoCliente;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.CarritoCompras;
import modelo.DetalleCarrito;
import modelo.Favorito;
import modelo.Producto;
import modelo.Usuario;

public class DescripcionArticulo extends javax.swing.JFrame {

    // ATRIBUTOS 
    private final Usuario usuarioLogueado;
    private final CarritoComprasCliente carritoComprasCliente;
    private final DetalleCarritoCliente detalleCarritoCliente;
    private final ProductoCliente productoCliente;
    private final FavoritoCliente favoritoCliente;
    private Integer idProducto;

    // CONSTRUCTOR 
    public DescripcionArticulo(Usuario usuarioLogueado, Integer idProducto) {
        initComponents();
        setLocationRelativeTo(this);
        this.usuarioLogueado = usuarioLogueado;
        this.carritoComprasCliente = new CarritoComprasCliente();
        this.detalleCarritoCliente = new DetalleCarritoCliente();
        this.idProducto = idProducto;
        this.productoCliente = new ProductoCliente();
        this.favoritoCliente = new FavoritoCliente();
        diligenciarInfoProducto(idProducto);

    }

    // METODO PARA CARGAR LA IMAGEN DESDE LA URL ALOJADA EN CLOUDINARY
    public void cargarImagenDesdeUrl(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage imagen = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(imagen); //convertir a ImageIcon
            imagenProducto.setIcon(icon);
        } catch (IOException e) {
            System.err.println("Error cargando imagen: " + e.getMessage());
        }
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
        jLabel5 = new javax.swing.JLabel();
        btnFavorito = new javax.swing.JButton();
        txtMaterial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtIdProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JComboBox<>();
        txtTalla = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

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

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Color:");

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

        btnRegresar.setText("Volver");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("COMPOSICIÓN:");

        jLabel6.setText("ART. NÚM: ");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        txtIdProducto.setText("1");

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Cantidad: ");

        txtCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        txtTalla.setEditable(false);

        txtColor.setEditable(false);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Seleccione la Cantidad  a Comprar: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(txtPrecio))
                                    .addComponent(btnCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreProducto)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtColor)
                                            .addComponent(txtCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTalla)))
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
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
                        .addComponent(btnRegresar)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtNombreProducto))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFavorito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtMaterial))
                        .addGap(15, 15, 15))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // METODO PARA LLENAR LA INFORMACIÓN EN PANTALLA DEPENDIENDO DEL ID DE PRODUCTO QUE RECIBA
    private void diligenciarInfoProducto(Integer idProducto) {
        Producto productoAMostrar;
        try {
            productoAMostrar = productoCliente.findProductoById(idProducto); //obtener producto
            if (productoAMostrar != null) {
                txtIdProducto.setText(String.valueOf(productoAMostrar.getProd_id()));
                txtPrecio.setText(String.valueOf(productoAMostrar.getPrecio()));
                txtNombreProducto.setText(productoAMostrar.getNombre());
                txtDescripcion.setText(productoAMostrar.getDescripcion());
                txtMaterial.setText(productoAMostrar.getMaterial());
                txtTalla.setText(productoAMostrar.getTalla());
                txtColor.setText(productoAMostrar.getColor());
                String url_imagen = productoAMostrar.getUrl_imagen();
                cargarImagenDesdeUrl(url_imagen);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    // BOTON PARA REGRESAR AL CATALOGO 
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    // BOTON PARA AGREGAR UN PRODUCTO A LA LISTA DE FAVORITOS 
    private void btnFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritoActionPerformed
        try {
            if (usuarioLogueado == null || usuarioLogueado.getUsua_id() == null) {
                JOptionPane.showMessageDialog(this,
                        "¡Debes registrarte o iniciar sesion si deseas añadir una prenda a favoritos!",
                        "Usuario no identificado", JOptionPane.WARNING_MESSAGE);
                return;
            }

            System.out.println("Id de user logueado: " + usuarioLogueado.getUsua_id()); //debug: verificar user
            idProducto = Integer.parseInt(txtIdProducto.getText()); //obtener id de producto actual
            // Validar que id del producto sea mayor a cero 
            if (idProducto <= 0) {
                JOptionPane.showMessageDialog(this, "ID de producto inválido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Producto producto = productoCliente.findProductoById(idProducto);
            if (producto == null) {
                JOptionPane.showMessageDialog(null, "El producto no está disponible actualmente");
                return;
            }
            List<Favorito> favoritos = favoritoCliente.findFavoritoByCliente(usuarioLogueado.getUsua_id());
            if (favoritos == null) {
                favoritos = new ArrayList<>(); // Asegurar que nunca sea null
            }
            boolean yaExiste = favoritos.stream().anyMatch(f -> f.getProducto().getProd_id() == idProducto);
            if (yaExiste) {
                JOptionPane.showMessageDialog(this, "Este producto ya está en tus favoritos", "¡Aviso!",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Favorito nuevoFavorito = new Favorito();
            nuevoFavorito.setUsuario(usuarioLogueado);
            nuevoFavorito.setProducto(producto);
            Favorito favCreado = favoritoCliente.createFavorito(nuevoFavorito);

            if (favCreado != null) { //si el fav se creó
                JOptionPane.showMessageDialog(this, "Producto añadido a favoritos con éxito"
                        + "\n puedes ver el producto en 'Tus favoritos'", "Favorito agregado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                throw new Exception("No se pudo agregar el producto a favoritos.");
            }
        } catch (Exception e) {
            String mensaje = "Error al agregar a favoritos: " + e.getMessage();
            System.err.println(mensaje); // Para logs de desarrollo
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnFavoritoActionPerformed

// METODO PARA AGREGAR UN PRODUCTO AL CARRITO DE COMPRAS 
    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        // Validar usuario logueado
        if (usuarioLogueado == null) {
            mostrarMensajeLogin();
            return;
        }
        // Validar datos del formulario
        if (!validarDatos()) {
            return;
        }
        try {
            // Cada usuario Va a tener un único carrito de compras asociado a su id 
            String authToken = usuarioLogueado.getToken();
            CarritoCompras carritoCliente = carritoComprasCliente.createCarritoCompras(authToken);

            agregarProductoAlCarrito(carritoCliente, authToken);
        } catch (Exception e) {
            manejarError(e);

        }

    }//GEN-LAST:event_btnCarritoActionPerformed

    private void manejarError(Exception e) {
        System.err.println("Error al procesar carrito: " + e.getMessage());
        e.printStackTrace();
        String mensaje = e.getMessage();

        if (e.getMessage().contains("401") || e.getMessage().contains("Unauthorized")) {
            JOptionPane.showMessageDialog(null, "Sesión expirada. Por favor, inicia sesión nuevamente.");
        } else if (e.getMessage().contains("404")) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        } else {
            // Extraer mensaje del JSON si existe
            String mensajeAMostrar = "Error al agregar producto. Intente nuevamente.";

            if (mensaje.contains("\"mensaje\":\"")) {
                try {
                    int inicio = mensaje.indexOf("\"mensaje\":\"") + 11;
                    int fin = mensaje.indexOf("\"", inicio);
                    mensajeAMostrar = mensaje.substring(inicio, fin);
                } catch (Exception ex) {
                    // Si falla la extracción, usar mensaje genérico
                }
            }
            JOptionPane.showMessageDialog(null, mensajeAMostrar);
        }
    }

    private void agregarProductoAlCarrito(CarritoCompras carrito, String authToken) throws Exception {
        Integer productoID = Integer.valueOf(txtIdProducto.getText());
        Producto producto = new Producto(productoID);
        int cantidad = Integer.parseInt(txtCantidad.getSelectedItem().toString());

        DetalleCarrito detalleCarrito = new DetalleCarrito(cantidad, carrito, producto);
        DetalleCarrito productoAgregado = detalleCarritoCliente.createDetalleCarrito(detalleCarrito, authToken);

        mostrarMensajeExito();
        this.dispose();
    }

    private void mostrarMensajeExito() {
        JOptionPane.showMessageDialog(null,
                "Producto agregado al carrito\n"
                + "Continúe seleccionando productos o\n"
                + "vea su carrito para finalizar la compra");
    }

    private void mostrarMensajeLogin() {
        JOptionPane.showMessageDialog(null,
                "¡Debes registrarte o iniciar sesión para agregar productos al carrito!");
    }

    // METODO PARA VALIDAR QUE INGRESE LOS DATOS CORRECTAMENTE 
    private boolean validarDatos() {
        if (txtIdProducto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto válido.");
            return false;
        }

        if (txtCantidad.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una cantidad.");
            return false;
        }

        try {
            int cantidad = Integer.parseInt(txtCantidad.getSelectedItem().toString());
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida.");
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnFavorito;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtCantidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JLabel txtMaterial;
    private javax.swing.JLabel txtNombreProducto;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
