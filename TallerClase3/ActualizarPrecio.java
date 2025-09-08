package TallerClase3;

public class ActualizarPrecio {
    public static void main(String[] args) {
        Libro[] misLibros = new Libro[3];
         misLibros[0] = new Libro("Poesia Completa", "Alejandra Pizarnik", 43000);
         misLibros[1] = new Libro("Harry Potter y la piedra filosofal", "J.K Rowling", 50000);
         misLibros[2] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 60000);

         System.out.println("Precios Originales:");
         for (Libro libro : misLibros) {
            libro.mostrarInformacion();
         }

         for(Libro libro : misLibros) {
            if(libro.getTitulo().equals("Harry Potter")) {
                libro.setPrecio(60000);
                System.out.println("Precio del libro Harry Potter cambiado!");
            }
         }

         System.out.println("\nPrecios actualizados:");
         for (Libro libro : misLibros) {
            libro.mostrarInformacion();
         }
    }
}
