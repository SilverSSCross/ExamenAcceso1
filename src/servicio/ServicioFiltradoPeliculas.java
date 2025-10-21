package servicio;

import clase.Pelicula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServicioFiltradoPeliculas implements ImplementServicioFiltradoPeliculas {
    //private List<Pelicula> peliculas=new ArrayList<>();


    public List<Pelicula> allPeliculas() {
        List<Pelicula> peliculas=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(new File("files/peliculas.csv")))) {
            String linea;
            while ((linea=br.readLine())!=null){
                String[] line=linea.split(",");

                for(int i=0;i<line.length;i++){
                    line[i]=line[i].trim();
                }

                try{
                    Pelicula pelicula= new Pelicula(
                            Integer.parseInt(line[0]),
                            line[1],
                            line[2],
                            line[3],
                            line[4]
                    );
                    peliculas.add(pelicula);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return peliculas;
    }


    @Override
    public void filtrarPorGenero(String genero) {
        List<Pelicula> peliculas=allPeliculas();
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(new File("files/"+genero+".csv")))){

            for(Pelicula pel:peliculas){
                if(pel.getGenero().equals(genero)){
                    bw.write(pel.toString());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void filtrarPorDirector(String director) {
        List<Pelicula> peliculas=allPeliculas();
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(new File("files/"+director+".csv")))){
            for(Pelicula pel:peliculas){
                if(pel.getDirector().equals(director)){
                    bw.write(pel.toString());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
