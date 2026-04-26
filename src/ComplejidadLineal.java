/**
* Complejidad: O(n)
* Razón: El tiempo de ejecución depende de la cantidad
* de elementos en el arreglo, porque recorre uno por uno.
*/


public class ComplejidadLineal {
    public void ejemplo() {
        System.out.println("Ejemplo Complejidad Lineal -->  O(n):");

        int[] numeros = {1,2,3,4,5};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
