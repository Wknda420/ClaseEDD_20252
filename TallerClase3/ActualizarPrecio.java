package TallerClase3;

public class ActualizarPrecio {
    public static void main(String[] args) {
        Libro[] misLibros = new Libro[3];
         misLibros[0] = new Libro("Poesia Completa", "Alejandra Pizarnik", 43000);
         misLibros[3] = new Libro("Harry Potter y la piedra filosofal", "J.K Rowling", 50000);
         misLibros[4] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 60000);

         System.out.println("Precios Originales:");
         for (Libro libro : misLibros) {
            libro.mostrarInformacion();
         }

         for()
    }
}
