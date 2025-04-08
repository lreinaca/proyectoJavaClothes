package clienteApi;

import dto.DetalleCompraClienteDTO;
import java.util.List;
import modelo.CarritoCompras;
import modelo.Usuario;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.CarritoComprasApiService;

public class CarritoComprasCliente {

    // ATRIBUTOS
    private static final String BASE_URL = "http://localhost:8080";
    private static CarritoComprasApiService apiService;

    // CONSTRUCTOR 
    public CarritoComprasCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(CarritoComprasApiService.class);
    }

    // METODO PARA OBTENER TODOS LOS CARRITOSOMPRAS
    public List<CarritoCompras> listarTodosLosCarritoCompras() throws Exception {

        Response<List<CarritoCompras>> response = apiService.getAllCarritoCompras().execute();
        if (response.isSuccessful()) {
            List<CarritoCompras> carritoCompras = response.body();
            carritoCompras.forEach(usuario -> System.out.println(usuario));
            return carritoCompras;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error en el cargue de Información de Carrito Compras");
        }
    }

    // METODO PARA ENCONTRAR UN  CARRITOCOMPRAS POR EL ID DEL USUARIO 
    public CarritoCompras findCarritoComprasById(Integer idCarritoCompras, Usuario usuario) throws Exception {
        Response<CarritoCompras> response = apiService.getCarritoComprasById(idCarritoCompras, usuario.getIdUsuario()).execute();
        if (response.isSuccessful()) {
            CarritoCompras carritoCompras = response.body();
            System.out.println("Carrito Compras Encontrado: " + response.body());
            return carritoCompras;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("El CarritoCompras no fue Encontrado");
        }

    }

    // METODO PARA EDITAR UN CARRITO COMPRAS POR SU ID
    public void updateCarritoCompras(CarritoCompras carritoCompras, Integer idProducto) throws Exception {
        DetalleCompraClienteDTO compraCliente = new DetalleCompraClienteDTO(carritoCompras, idProducto);
        Response<CarritoCompras> response = apiService.updateCarritoCompras(carritoCompras.getCarritoId(), compraCliente).execute();
        if (response.isSuccessful()) {
            System.out.println("CarritoCompras actualizado: " + response.body());

        } else {
            System.out.println("Error al actualizar CarritoCompras: " + response.code());
            throw new Exception("Error al actualizar el CarritoCompras");
        }

    }

    //METODO PARA CREAR UN NUEVO CARRITO COMPRAS
    public CarritoCompras createCarritoCompras(CarritoCompras carritoCompras, Integer idProducto) throws Exception {
        DetalleCompraClienteDTO compraCliente = new DetalleCompraClienteDTO(carritoCompras, idProducto);
        Response<CarritoCompras> response = apiService.createCarritoCompras(compraCliente).execute();
        if (response.isSuccessful()) {
            CarritoCompras carritoComprasCreado = response.body();
            System.out.println("Carrito Compras creado: " + response.body());
            return carritoComprasCreado;

        } else {
            System.out.println("Error al crear Carrito Compras: " + response.code());
            throw new Exception("Error al actualizar el Carrito Compras");
        }

    }

}
