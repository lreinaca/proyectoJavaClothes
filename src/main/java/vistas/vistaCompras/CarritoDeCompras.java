package vistas.vistaCompras;

import clienteApi.CarritoComprasCliente;
import clienteApi.DetalleCarritoCliente;
import clienteApi.PedidoCliente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleCarrito;
import modelo.Pedido;
import modelo.Producto;
import modelo.Usuario;

/**
 *
 * @author Rossi
 */
public final class CarritoDeCompras extends javax.swing.JPanel {

    //ATRIBUTOS 
    private final Usuario usuarioLogueado;
    private final CarritoComprasCliente carritoComprasCliente;
    private final DetalleCarritoCliente detalleCarritoApi;
    private final PedidoCliente pedidoCliente;
    private String nombreProductoSeleccionado;
    private int idProductoSeleccionado;
    private double totalGeneral = 0.0;

    // CONSTRUCTOR 
    public CarritoDeCompras(Usuario usuarioLogueado) {
        initComponents();
        this.usuarioLogueado = usuarioLogueado;
        this.carritoComprasCliente = new CarritoComprasCliente();
        this.detalleCarritoApi = new DetalleCarritoCliente();
        this.pedidoCliente = new PedidoCliente();
        listarProductos();
        seleccionarProducto();
        crearOConsultarCarrito();
        listarTotalAPagar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetalleCarrito = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        btnValorAPagar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mi Carrito de compras");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(204, 204, 204));

        tbDetalleCarrito.setBackground(new java.awt.Color(204, 204, 255));
        tbDetalleCarrito.setForeground(new java.awt.Color(102, 102, 102));
        tbDetalleCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto:", "Color:", "Talla:", "Cantidad:", "Precio:"
            }
        ));
        jScrollPane1.setViewportView(tbDetalleCarrito);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        tbPedido.setBackground(new java.awt.Color(204, 204, 255));
        tbPedido.setForeground(new java.awt.Color(102, 102, 102));
        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Valor Unitario", "Total"
            }
        ));
        jScrollPane2.setViewportView(tbPedido);

        btnFinalizar.setBackground(new java.awt.Color(0, 153, 255));
        btnFinalizar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(51, 51, 51));
        btnFinalizar.setText("Generar Pedido");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnValorAPagar.setBackground(new java.awt.Color(0, 153, 255));
        btnValorAPagar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnValorAPagar.setForeground(new java.awt.Color(51, 51, 51));
        btnValorAPagar.setText("Ver Valor a Pagar");
        btnValorAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorAPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnValorAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValorAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(51, 0, 255));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Para Editar o Eliminar un Producto : ");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Seleccione el producto en la TABLA Historial de productos.");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Historial de productos:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Pedido:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 51, 51));
        btnEditar.setText("Editar Producto");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1131, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    // METODO PARA CONSULTAR O CREAR EL CARRITO DE COMPRAS 
    public void crearOConsultarCarrito() {
        try {
            // Cada usuario Va a tener un único carrito de compras asociado a su id 
            String authToken = usuarioLogueado.getToken();
            carritoComprasCliente.createCarritoCompras(authToken);
        } catch (Exception e) {
            manejarError(e);

        }
    }

    // METODO PARA MANEJO DE ERRORES EN CREAR CARRITO 
    private void manejarError(Exception e) {
        System.err.println("Error al procesar carrito: " + e.getMessage());
        e.printStackTrace();

        if (e.getMessage().contains("401") || e.getMessage().contains("Unauthorized")) {
            JOptionPane.showMessageDialog(null, "Sesión expirada. Por favor, inicia sesión nuevamente.");
        } else if (e.getMessage().contains("404")) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar producto. Intente nuevamente.");
        }
    }

    // METODO PARA LLENAR LA TABLA DE LOS PRODUCTOS 
    private void listarProductos() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Id", "Nombre_Producto", "Color",
            "Talla", "Cantidad", "Precio",});
        // Formatter para pesos colombianos
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        formatoPesos.setMaximumFractionDigits(0);

        try {
            List<DetalleCarrito> detallesCarrito = detalleCarritoApi.listarTodosLosDetalleCarrito(usuarioLogueado.getUsua_id());

            for (DetalleCarrito detalle : detallesCarrito) {
                Producto producto = detalle.getProducto();

                model.addRow(new Object[]{
                    detalle.getDetalle_carrito_id(),
                    producto.getNombre(),
                    producto.getColor(),
                    producto.getTalla(),
                    detalle.getCantidad(),
                    formatoPesos.format(producto.getPrecio()),});
            }
            tbDetalleCarrito.setModel(model);

            // Ajustar el ancho de las columnas
            tbDetalleCarrito.getColumnModel().getColumn(0).setPreferredWidth(50); // ID Detalle Carrito
            tbDetalleCarrito.getColumnModel().getColumn(1).setPreferredWidth(150); // Nombre_Producto
            tbDetalleCarrito.getColumnModel().getColumn(2).setPreferredWidth(80);  // Color
            tbDetalleCarrito.getColumnModel().getColumn(3).setPreferredWidth(50);  // Talla
            tbDetalleCarrito.getColumnModel().getColumn(4).setPreferredWidth(50); // Cantidad
            tbDetalleCarrito.getColumnModel().getColumn(5).setPreferredWidth(85);  // Precio

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // METODO PARA LLENAR LA TABLA DE PREFACTURA
    private void listarTotalAPagar() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "Producto", "Valor_unitario", "Total",});
        // Formatter para pesos colombianos
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        formatoPesos.setMaximumFractionDigits(0);
        try {
            List<DetalleCarrito> detallesCarrito = detalleCarritoApi.listarTodosLosDetalleCarrito(usuarioLogueado.getUsua_id());

            for (DetalleCarrito detalle : detallesCarrito) {
                Producto producto = detalle.getProducto();
                double total = detalle.getCantidad() * detalle.getProducto().getPrecio();

                model.addRow(new Object[]{
                    producto.getNombre(),
                    formatoPesos.format(producto.getPrecio()),
                    formatoPesos.format(total),});
            }
            tbPedido.setModel(model);

            // Ajustar el ancho de las columnas
            tbPedido.getColumnModel().getColumn(0).setPreferredWidth(150); // Nombre_Producto
            tbPedido.getColumnModel().getColumn(1).setPreferredWidth(75); // Precio
            tbPedido.getColumnModel().getColumn(2).setPreferredWidth(75);  // Total

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    // METODO PARA CAPTURAR EL PRODUCTO SELECCIONADO 
    private void seleccionarProducto() {
        tbDetalleCarrito.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tbDetalleCarrito.rowAtPoint(e.getPoint());

                if (fila >= 0) {
                    nombreProductoSeleccionado = tbDetalleCarrito.getValueAt(fila, 1).toString();
                    idProductoSeleccionado = (int) tbDetalleCarrito.getValueAt(fila, 0);
                    JOptionPane.showMessageDialog(null, "Seleccionaste: " + nombreProductoSeleccionado
                            + "\n ID Detalle Carrito " + idProductoSeleccionado);
                }
            }
        });
    }

    // FINALIZAR LA COMPRA - CONVERTIR EL CARRITO DE COMPRAS EN PEDIDO
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {
            Pedido pedidoCreado = pedidoCliente.createPedido(usuarioLogueado.getToken());
            ConfirmacionDePedidos vista = new ConfirmacionDePedidos(usuarioLogueado, pedidoCreado, totalGeneral);
            vista.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(CarritoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnFinalizarActionPerformed

    // BOTON PARA ELIMINAR UN PRODUCTO DEL CARRITO 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            // Validar que hay un producto seleccionado
            if (idProductoSeleccionado <= 0 || nombreProductoSeleccionado == null) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, selecciona un producto de la tabla primero",
                        "Producto no seleccionado",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            detalleCarritoApi.deleteDetalleCarritoPorProducto(idProductoSeleccionado);
            JOptionPane.showMessageDialog(null,
                    "Eliminado de tu Carrito:\n" + nombreProductoSeleccionado);

            // Limpiar selección después de eliminar
            idProductoSeleccionado = 0;
            nombreProductoSeleccionado = null;

            listarProductos();
            listarTotalAPagar();
        } catch (Exception ex) {
            Logger.getLogger(CarritoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // BOTON PARA EDITAR LA CANTIDAD DE UN PRODUCTO 
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            // Validar que hay un producto seleccionado
            if (idProductoSeleccionado <= 0 || nombreProductoSeleccionado == null) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, selecciona un producto de la tabla primero",
                        "Producto no seleccionado",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            DetalleCarrito detalle = new DetalleCarrito();
            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva Cantidad de Producto Deseada"));
            detalle.setCantidad(nuevaCantidad);
            detalleCarritoApi.updateDetalleCarrito(idProductoSeleccionado, detalle);
            JOptionPane.showMessageDialog(null,
                    "La cantidad de " + nombreProductoSeleccionado
                    + "\nfue actualizada a: " + nuevaCantidad,
                    "Cantidad Actualizada",
                    JOptionPane.INFORMATION_MESSAGE);

            // Limpiar selección después de eliminar
            idProductoSeleccionado = 0;
            nombreProductoSeleccionado = null;

            listarProductos();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    // BOTON PARA CALCULAR EL VALOR TOTAL DE LA COMPRA
    private void btnValorAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorAPagarActionPerformed
        
        // Formatter para pesos colombianos
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        formatoPesos.setMaximumFractionDigits(0);

        try {
            List<DetalleCarrito> detallesCarrito = detalleCarritoApi.listarTodosLosDetalleCarrito(usuarioLogueado.getUsua_id());

            for (DetalleCarrito detalle : detallesCarrito) {
                int cantidad = detalle.getCantidad();
                double precio = detalle.getProducto().getPrecio();
                totalGeneral += cantidad * precio;
            }

            JOptionPane.showMessageDialog(null,
                    "El Total a Pagar es:\n" + formatoPesos.format(totalGeneral),
                    "Total de la Compra",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al calcular el total: " + e.getMessage());
        }
    }//GEN-LAST:event_btnValorAPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnValorAPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbDetalleCarrito;
    private javax.swing.JTable tbPedido;
    // End of variables declaration//GEN-END:variables
}
