/**
* Complejidad: O(n²)
* Razón: Se utilizan dos ciclos anidados, por lo que
* el número de operaciones crece multiplicando n × n.
*/


public class ComplejidadCuadratica {
    
    public void ejemplo() {
        System.out.println("Ejemplo Complejidad Cadratica --> O(n²):");

        int[] numeros = {1,2,3};

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[i] + " " + numeros[j]);
            }
        }
    }

}
