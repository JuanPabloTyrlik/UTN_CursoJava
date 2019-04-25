package clase3;

class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int pags;

    public Libro() {
    }

    Libro(String isbn, String titulo, String autor, int pags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    String getTitulo() {
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

    int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

    public String toString() {
        return "El libro '"+titulo+"' con ISBN "+isbn+" creado por el autor "+autor+" tiene "+pags+" páginas";
    }
}
