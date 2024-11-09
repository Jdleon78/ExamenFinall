public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String tipoPasta; 

    public Libro(String titulo, String autor, String tipoPasta) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipoPasta = tipoPasta; 
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTipoPastaId() {
        return tipoPastaId;
    }

    public void setTipoPastaId(int tipoPastaId) {
        this.tipoPastaId = tipoPastaId;
    }

    public String getTipoPastaDescripcion() {
        return tipoPastaDescripcion;
    }

    public void setTipoPastaDescripcion(String tipoPastaDescripcion) {
        this.tipoPastaDescripcion = tipoPastaDescripcion;
    }

}
