package TallerClase3;

public class Libro {
    private String titulo;
    private String autor;
    private double precio; 

    public Libro(String titulo, String autor, double precio){

        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
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
        public double getPrecio() {
            return precio;
        }
        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void mostrarInformacion() {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Precio: $" + String.format("%, .0f", precio) + " COP");
            System.out.println("-------------------------------");
        }
}
