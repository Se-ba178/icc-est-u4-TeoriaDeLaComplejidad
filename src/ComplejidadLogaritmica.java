/**
* Complejidad: O(log n)
* Razón: En cada repetición el valor de n se divide entre 2,
* por lo que el número de operaciones crece lentamente.
*/


public class ComplejidadLogaritmica {
    public void ejemplo() {
        System.out.println("Ejemplo Complejidad Logaritmica --> O(log n):");

        int n = 16;

        while(n > 1) {
            n = n / 2;
            System.out.println(n);
        }
    }
}
