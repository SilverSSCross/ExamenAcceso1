import servicio.ServicioFiltradoPeliculas;

public class Main {
    public static void main(String[] args) {
        ServicioFiltradoPeliculas peliculas = new ServicioFiltradoPeliculas();
        //Demostracion filtrar por genero.(Crea el archivo vacio)
        peliculas.filtrarPorGenero("DASD");
        //Demostracion filtrar por genero
        peliculas.filtrarPorGenero("Drama");
        //Demostracion filtrar por director(Crea el archivo vacio)
        peliculas.filtrarPorDirector("Maito");
        //Demostracion filtrar por director
        peliculas.filtrarPorDirector("Christopher Nolan");
    }
}