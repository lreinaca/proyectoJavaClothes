package clienteApi;

import com.google.gson.*;
import java.lang.ProcessBuilder.Redirect.Type;
import java.time.LocalDate;
import java.util.List;

import modelo.Pedido;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.PedidoApiService;

/**
 *
 * @author Rossi
 */
public class PedidoCliente {

    private static final String BASE_URL = "http://localhost:8089";
    private static PedidoApiService pedidoApiService;

    public PedidoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .build();

        pedidoApiService = retrofit.create(PedidoApiService.class);
    }

    //buscarPedido
    public void buscarPedido(Pedido pedido) throws Exception {
//        Integer idUsuario = pedido.getCliente().getUsua_id();
//        Response<List<Pedido>> response = pedidoApiService.buscarPedido(idUsuario, pedido.getEstado(), pedido.getFecha()).execute();
//        if (response.isSuccessful()) {
//            List<Pedido> pedidos = response.body();
//            pedidos.forEach(p -> System.out.println("Pedido(s) encontrado: " + p));
//        } else {
//            System.out.println("Error al buscar pedido: " + response.code());
//            throw new Exception("Error al buscar el pedido");
//        }
    }

    // metodo actualizar pedido
    public Pedido updatePedido(String idPedido, Pedido pedido) throws Exception {
        Response<Pedido> response = pedidoApiService.updatePedido(idPedido, pedido).execute();
        if (response.isSuccessful()) {
            Pedido pedidoActualizado = response.body();
            System.out.println("Pedido actualizado: " + response.body());
            return pedidoActualizado;
        } else {
            System.out.println("Error al actualizar pedido: " + response.code());
            throw new Exception("Error al actualizar el pedido");
        }
    }

    //metodo para crear pedido
    public Pedido createPedido(String token) throws Exception {
        String authToken = "Bearer " + token;
        Response<Pedido> response = pedidoApiService.createPedido(authToken).execute();
        if (response.isSuccessful()) {
            Pedido pedidoCreado = response.body();
            System.out.println("Pedido creado: " + response.body());
            return pedidoCreado;
        } else {
            System.out.println("Error al crear pedido: " + response.code());
            throw new Exception("Error al crear el pedido");
        }
    }

    // metodo eliminar Pedido
    public void deletePedido(String idPedido) throws Exception {
        Response<Void> response = pedidoApiService.deletePedido(idPedido).execute();
        if (response.isSuccessful()) {
            System.out.println("Pedido eliminado: " + idPedido);
        } else {
            System.out.println("Error al eliminar pedido: " + response.code());
            throw new Exception("Error al eliminar el pedido");
        }
    }

    // metodo para obtener todos los pedidos
    public List<Pedido> getAllPedidos() throws Exception {
        Response<List<Pedido>> response = pedidoApiService.getAllPedidos().execute();
        if (response.isSuccessful()) {
            List<Pedido> pedidos = response.body();
            pedidos.forEach(p -> System.out.println("Lista de pedidos: " + p));
            return pedidos;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error al obtener la lista de pedidos");
        }
    }

    // metodo para obtener pedido por id
    public Pedido getPedidoById(String idPedido) throws Exception {
        Response<Pedido> response = pedidoApiService.getPedidoById(idPedido).execute();
        if (response.isSuccessful()) {
            Pedido pedido = response.body();
            System.out.println("Pedido encontrado: " + response.body());
            return pedido;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Pedido no encontrado");

        }
    }

    // Metodo para que gson pueda deserializar fechas 
    private Gson createGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) (src, typeOfSrc, context)
                -> new JsonPrimitive(src.toString()));
        builder.registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>) (json, typeOfT, context)
                -> LocalDate.parse(json.getAsString()));
        return builder.create();
    }

}
