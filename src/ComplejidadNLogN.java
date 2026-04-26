/**
* Complejidad: O(n log n)
* Razón: El método sort ordena los elementos con una complejidad
* de n log n, ya que divide y ordena el arreglo eficientemente.
*/

import java.util.Arrays;

public class ComplejidadNLogN {
    public void ejemplo() {
        System.out.println("Ejemplo Complejidad NlogN --> O(n log n):");

        int[] numeros = {5,2,8,1,9};

        Arrays.sort(numeros);

        for(int n : numeros) {
            System.out.println(n);
        }
    }
}
