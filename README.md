# Practica : Teoria de la complejidad 

## 1. Definición de algoritmo y su importancia en la resolución de problemas.

*Un algoritmo es un conjunto de pasos ordenados y finitos que sirven para resolver un problema o hacer una tarea. Cada paso está claro y bien definido, para que no haya confusión. Los algoritmos son importantes porque ayudan a resolver problemas de forma automática, obteniendo siempre resultados correctos si se usan los mismos datos de entrada*


### 1.1 Uso de los recursos computacionales 
> ¿Por qué es importante minimizar el uso de recursos como el tiempo de CPU y la memoria RAM?

*Usar menos CPU y memoria RAM ayuda a que la computadora funcione rápido y sin fallos. Si un programa usa demasiado, el sistema se vuelve lento o se bloquea. Por eso, es mejor usar solo los recursos necesarios.*



### 1.2 Costes en los algoritmos
> ¿Qué es el coste temporal y el coste espacial en un algoritmo?

*`Coste Temporal`*

*Cuantifica el número de operaciones o pasos que realiza un algoritmo para finalizar, indicando qué tan rápido es.*

*`Coste Espacial`*

*Mide la cantidad total de memoria (RAM) requerida para la ejecución, incluyendo estructuras de datos adicionales y el espacio de la pila de recursión.*

---
## 2. ¿Qué es la Teoría de la Complejidad?

*La Teoría de la Complejidad es una rama de la informática que se encarga de clasificar los problemas algorítmicos según su dificultad inherente y los recursos necesarios para resolverlos. No se trata de si un código es difícil de leer, sino de qué tan bien escala a medida que aumentan los datos de entrada.*

---
## 3. Factores de contenido 

*`Factores Propios`*


 *Son los que el programador puede controlar y analizar matemáticamente:*

1. *La estructura del algoritmo (bucles anidados, recursividad).*

2. *El tamaño de los datos de entrada (n).*

3. *El tipo de datos.*

*`Factores Circunstanciales`*

*Son cosas que no dependen del algoritmo y pueden cambiar el tiempo que tarda en ejecutarse:*

1. *La velocidad de la computadora (CPU)*
2. *El lenguaje de programación que se usa*
3. *Qué tan ocupado está el sistema en ese momento*


*`Analisis Teorico`*

*Consiste en ejecutar el programa con diferentes cantidades de datos y medir cuánto tiempo tarda.*
*

1. ` Problema`:  *depende de la computadora y solo sirve para esos casos probados*

*`Analisis Experimental`*

 *Consiste en usar matemáticas para predecir cómo se comporta el algoritmo.*
 1. `Ventaja`: *no depende de la computadora y sirve para cualquier cantidad de datos.*
 ---
## 4.  Notación Big O 

>4.1 *¿Qué es la Notación `Big O`?*

*La notación `O(g(n))` describe el límite superior del tiempo de ejecución. Nos dice cuál es el "escenario de pesadilla": el algoritmo nunca será más lento que esto.*

>4.2 Mejor caso 

*Es el tiempo mínimo que necesita un algoritmo para terminar.*
*Pasa cuando todo sale de la mejor manera posible (por ejemplo, encuentras el dato a la primera).*

>4.3 Peor Caso

*Es el tiempo máximo que puede tardar un algoritmo.*
*Se usa mucho porque asegura que el programa nunca será más lento que ese límite, pase lo que pase.*

>4.4 Caso Pomedio

*Es el tiempo que se espera que tarde un algoritmo en condiciones normales con datos aleatorios. Representa su comportamiento típico y es el más realista, aunque difícil de calcular con precisión.*

## 5 Cada una de las notaciones O(n),O(logn)........

*La teoría de la complejidad es una parte de la informática que estudia qué tan difícil es resolver un problema con un algoritmo.
Se fija en cuánto tiempo y recursos necesita, especialmente cuando la cantidad de datos aumenta.
No importa si el código es difícil de leer, sino qué tan rápido o eficiente funciona al crecer los datos.* 


| Notación     | Nombre                | Ejemplo                                                                 |
|--------------|----------------------|-------------------------------------------------------------------------|
| O(1)         | Constante            | Acceder a un elemento de un array por su índice                        |
| O(log n)     | Logarítmica          | Búsqueda binaria (dividir el problema a la mitad en cada paso)         |
| O(n)         | Lineal               | Recorrer una lista una sola vez para encontrar un valor                |
| O(n log n)   | Lineal-Logarítmica   | Algoritmos de ordenación como Merge Sort o Quick Sort                  |
| O(n^2)       | Cuadrática           | Dos bucles anidados (ejemplo: ordenación por burbuja)                  |
| O(2^n)       | Exponencial          | Algoritmos de fuerza bruta o Fibonacci recursivo sin optimizar         |


## Conclusiones 
*En conclusión de esta práctica podemos decir que la teoría que se nos mandó a investigar(Teoría de la complejidad) nos ayuda a analizar y pensar mejor la eficiencia de un algoritmo dependiendo del tiempo  y la memoria que este llegue a  utilizar.*

`¿Qué complejidad costo más y por qué?`

*La complejidad que más costó fue la 0(n²) porque esta utiliza ciclos que son anidados, por consiguiente mientras más datos existan, más veces se va a repetir una operación.
Haciendo que esta tarde más tiempo para llegar a ejecutarse.*

`¿Qué aprendieron  del análisis?`

*Gracias a este análisis llegamos a comprender que tan eficiente llega a ser un algoritmo dependiendo del tiempo que se tarda en ejecutar las operaciones que se llega a realizar.
Por otro lado comprendimos que la notación big (0) nos ayuda a comparar los diferentes algoritmos y ver cual nos beneficia más.*

`¿Qué les sorprendió más al ver el código?`

*Lo que más nos llegó a sorprender de cada código fue que al realizar cambios en la parte del código llega a ser más lento su rendimiento, como por ejemplo, Algún algoritmo que se realiza con un solo ciclo es más eficiente que los que están anidados ya que llega a tener un menor tiempo de ejecución.*



## Capturas de los Resultados de los ejemplos Popuestos 

`Complejidad Constante`

![alt text](<assets/Captura de pantalla 2026-04-26 021236.png>)

`Complejidad Lineal`

![alt text](<assets/Captura de pantalla 2026-04-26 021506.png>)

`Complejidad Cuadratica `

![alt text](<assets/Captura de pantalla 2026-04-26 021619.png>)

`Complejidad Logaritmica `

![alt text](<assets/Captura de pantalla 2026-04-26 021726.png>)

`Complejidad NlogN`

![alt text](<assets/Captura de pantalla 2026-04-26 021812.png>)
