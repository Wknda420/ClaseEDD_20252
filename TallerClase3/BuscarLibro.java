package TallerClase3;

public class BuscarLibro {
    public static void main(String[] args) {
        Libro[] misLibros = new Libro[3];
        
        misLibros[0] = new Libro("Cien años de soledad", "Garcia Marquez", 35000);
        misLibros[1] = new Libro("Harry Potter", "J.K Rowling", 50000);
        misLibros[2] = new Libro("Don Quijote", "Cervantes", 60000);

        String libroBuscado = "Harry Potter";
        boolean encontrado = false;

        for (Libro libro: misLibros) {
            if (libro.getTitulo().equals(libroBuscado)) {
                System.out.println("¡Libro encontrado!");
                libro.mostrarInformacion();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El libro '" + libroBuscado + "' no se encuentra");
        }
    }
}
