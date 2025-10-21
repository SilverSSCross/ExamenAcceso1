package clase;

public class Pelicula {
    private int id;
    private String titulo;
    private String year;
    private String director;
    private String genero;

    public Pelicula(int id, String titulo, String year, String director, String genero) {
        setId(id);
        setTitulo(titulo);
        setYear(year);
        setDirector(director);
        setGenero(genero);
    }

    @Override
    public String toString() {
        return id+","+titulo+","+year+","+director+","+genero+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
