package servicio;

import clase.Pelicula;

import java.util.List;

public interface ImplementServicioFiltradoPeliculas {
    public void filtrarPorGenero(String genero);
    public void filtrarPorDirector(String director);
}
