public class Complejidad {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejemplos sobre la teoria de la complejidad !");

        System.out.println();
        new ComplejidadConstante().ejemplo();
        System.out.println();
        new ComplejidadLineal().ejemplo();
        System.out.println();
        new ComplejidadCuadratica().ejemplo();
        System.out.println();
        new ComplejidadLogaritmica().ejemplo();
        System.out.println();
        new ComplejidadNLogN().ejemplo();

    }
}
