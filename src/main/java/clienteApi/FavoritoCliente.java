package clienteApi;
import java.util.List;
import modelo.Favorito;
import modelo.Producto;

import modelo.Usuario;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.FavoritoApiService;
public class FavoritoCliente {
     // ATRIBUTOS
    private static final String BASE_URL = "http://localhost:8089";
    private static FavoritoApiService apiService;

    // CONSTRUCTOR 
    public FavoritoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(FavoritoApiService.class);
    }

    // METODO PARA OBTENER TODOS LOS FAVORITOS
    public List<Favorito> listarTodosLosFavorito() throws Exception {

        Response<List<Favorito>> response = apiService.getAllFavorito().execute();
        if (response.isSuccessful()) {
         List<Favorito> favorito = response.body();
            favorito.forEach(usuario -> System.out.println(usuario));
            return favorito;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error en el cargue de Información de Favorito");
        }
    }

    // METODO PARA ENCONTRAR UN FAVAORITO POR SU ID
    public Favorito findFavoritoById(int idFavorito, Usuario usuario, Producto producto) throws Exception {
        Response<Favorito> response = apiService.getFavoritoById(idFavorito, usuario, producto).execute();
        if (response.isSuccessful()) {
            Favorito favorito = response.body();
            System.out.println("Favorito Encontrado: " + response.body());
            return favorito;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("El Favorito no fue Encontrado");
        }
    }
    
    public List<Favorito> findFavoritoByCliente(int idUsuario) throws Exception { 
        Response<List<Favorito>> response = apiService.getfavoritosByCliente(idUsuario).execute(); //ejecutamos llamada al API
        if (response.isSuccessful()) {
            List<Favorito> favoritos = response.body();
            System.out.println("Favoritos encontrados: "+ favoritos.size());
            return favoritos;
        }else{
            System.out.println("Error al buscar favoritos. Código: " + response.code());
            throw new Exception("No fue posible encontrar los favoritos del cliente. Código: "+ response.code()); 
        }
    }

    // METODO PARA EDITAR UN FAVORITO POR SU ID
    public void updateFavorito(int idFavorito, Usuario usuario, Producto producto, Favorito favorito) throws Exception {
        Response<Favorito> response = apiService.updateCarritoCompras(idFavorito, usuario, producto, favorito).execute();
        if (response.isSuccessful()) {
            System.out.println("Favorito actualizado: " + response.body());

        } else {
            System.out.println("Error al actualizar Favorito: " + response.code());
            throw new Exception("Error al actualizar el Favorito");
        }

    }

    //METODO PARA CREAR UN NUEVO FAVORITO
    public Favorito createFavorito(Favorito favorito) throws Exception {
        Response<Favorito> response = apiService.createFavorito(favorito).execute();
        
         System.out.println("=== RESPUESTA DEL SERVIDOR ===");
    System.out.println("Código: " + response.code());
    System.out.println("Es exitoso: " + response.isSuccessful());
     if (!response.isSuccessful() && response.errorBody() != null) {
        System.out.println("Error: " + response.errorBody().string());
    }
    
    if (response.isSuccessful()) {
        return response.body();     
    } else {
        throw new Exception("Error al crear favorito. Código: " + response.code()); 
    }
    
//        if (response.isSuccessful()) {
//            Favorito favoritoCreado = response.body();
//            System.out.println("Favorito creado: " + response.body());
//            return favoritoCreado;     
//        } else {
//            System.out.println("Error al crear Favorito: " + response.code());
//            throw new Exception("Error al actualizar el Favorito"); 
//        }

    }
    
}
