package TallerClase3;

public class EjecutarLibro {
    public static void main(String[] args) {
        Libro[] Arena = new Libro[6];
            Arena [0] = new Libro("Poesia Completa", "Alejandra Pizarnik", 43000);
            Arena [1] = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 35000);
            Arena [2] = new Libro("Cronicas de una muerte anunciada", "Gabriel Garcia Marquez", 38000);
            Arena [3] = new Libro("Harry Potter y la piedra filosofal", "J.K Rowling", 50000);
            Arena [4] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 60000);
            Arena [5] = new Libro("El señor de los anillos", "J.R.R Tolkien", 65000);

            System.out.println("=== LIBROS Y PRECIOS ===");
        for (Libro libro : Arena) {
            libro.mostrarInformacion();
        }
        
        double total = 0;
        for (Libro libro : Arena) {
            total += libro.getPrecio();
        }
        
        System.out.println("Precio total: $" + String.format("%,.0f", total) + " COP");
    }
}