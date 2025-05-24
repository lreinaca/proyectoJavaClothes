package clienteApi;

import java.util.List;
import modelo.DetalleCarrito;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.DetalleCarritoApiService;

public class DetalleCarritoCliente {

    // ATRIBUTOS
    private static final String BASE_URL = "http://localhost:8089";
    private static DetalleCarritoApiService apiService;

    // CONSTRUCTOR 
    public DetalleCarritoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(DetalleCarritoApiService.class);
    }

    // METODO PARA ENCONTRAR UN  DETALLE CARRITO POR SU ID
    public DetalleCarrito findDetalleCarritoById(int idDetalleCarrito, int cantidad) throws Exception {
        Response<DetalleCarrito> response = apiService.getDetalleCarritoById(idDetalleCarrito, cantidad).execute();
        if (response.isSuccessful()) {
            DetalleCarrito detalleCarrito = response.body();
            System.out.println("Detalle Carrito Encontrado: " + response.body());
            return detalleCarrito;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("El Detalle Carrito no fue Encontrado");
        }

    }

    // METODO PARA EDITAR UN DETALLE CARRITO POR SU ID
    public void updateDetalleCarrito(int idDetalleCarrito, DetalleCarrito detalleCarrito) throws Exception {
        Response<DetalleCarrito> response = apiService.updateDetalleCarrito(idDetalleCarrito, detalleCarrito).execute();
        if (response.isSuccessful()) {
            System.out.println("Detalle Carrito actualizado: " + response.body());

        } else {
            System.out.println("Error al actualizar Detalle Carrito: " + response.code());
            throw new Exception("Error al actualizar el Detalle Carrito");
        }

    }

    //METODO PARA CREAR UN NUEVO Detalle Carrito
    public DetalleCarrito createDetalleCarrito(DetalleCarrito detalleCarrito, String token) throws Exception {
        String authThoken = "Bearer "+token;
        Response<DetalleCarrito> response = apiService.createDetalleCarrito(detalleCarrito,authThoken).execute();
        if (response.isSuccessful()) {
            DetalleCarrito detalleCarritoCreado = response.body();
            System.out.println("Detalle Carrito creado: " + response.body());
            return detalleCarritoCreado;

        } else {
            System.out.println("Error al crear Detalle Carrito: " + response.code());
            throw new Exception("Error al actualizar el Detalle Carrito");
        }

    }
    
    
    // METODO PARA ENCONTRAR LOS DETALLES DEL CARRITOCOMPRAS POR EL ID DEL USUARIO 
    public List<DetalleCarrito> listarTodosLosDetalleCarrito(Integer idUsuario) throws Exception {
        Response<List<DetalleCarrito>> response = apiService.getAllDetalleCarritoByUsuarioId(idUsuario).execute();
        if (response.isSuccessful()) {
            List<DetalleCarrito> detalleCarrito = response.body();
            return detalleCarrito;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error en el cargue de Información de Detalle Carrito");
        }
    }

   
    // METODO PARA ELIMINAR UN  CARRITO COMPRAS POR EL ID DEL DETALLE DEL CARRITO 
    public void deleteDetalleCarritoPorProducto(int detalleCarritoID) throws Exception {
        Response<Void> response = apiService.deleteDetalleCarrito(detalleCarritoID).execute();
        if (response.isSuccessful()) {
            System.out.println("Detalle Carrito Compras Eliminado " + response.body());
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("El Detalle Carrito Compras no fue eliminado");
        }
    }
    
    
    // DetalleCompraClienteDTO compraCliente = new DetalleCompraClienteDTO(carritoCompras, idProducto);

}
