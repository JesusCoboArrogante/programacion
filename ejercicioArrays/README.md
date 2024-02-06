~~1. - Dado un vector de número enteros, obtener funciones que nos devuelvan:~~
~~a) imprima el vector~~
~~b) máximo del vector~~
~~c) mínimo del vector~~
~~d) media del vector~~
~~e) ordenación por burbuja~~
~~f) ordenación por selección~~
~~g) ordenación por insercción~~
~~h) ordenación por quicksort~~
~~i) búsqueda de un elemento lineal~~
~~j) búsqueda de un elemento de manera binaria recursiva~~

~~2. Dada una matriz, imprimirla obtener el máximo, el mínimo y la media. Buscar si un elemento existe en dicha matriz. Mostrar el elemento que más se repite.~~

~~3. Realiza un programa que dado dos vectores sea capaz de realiza las operaciones de vectores de física: suma, resta, producto escalar.~~

~~4. Realiza un programa que dado dos matrices, sea capaz de hayar la suma, la resta, multiplicación y el determinante de una matriz como maximizo de 3x3.~~

~~5. Haz un programa que invierta el orden de un vector.~~

~~6. Realizar un programa que le pida al usuario una cadena y le pregunte por otra. Debe comprobar si la segunda cadena está incluida en la primera.~~

~~7. Realiza un programa que dado un vector de números, nos diga si es capicúa.~~

~~8. Realiza un programa que dada una palabra nos diga si es palíndromo u no.~~

~~9. Haz un programa que invierta el orden de una matriz.~~

~~10. Haz un programa que invierta el orden de una cadena.~~

~~11. Realiza un programa que nos sirva para generar la combinación de la primitiva, sin repetir un número.~~

~~12. Realiza un programa que pida un valor entero, lo coloque en la primera posición de unvector e inicie el resto de elementos sumando uno al anterior. Ejemplo, si introducimos un 9 en la primera posición el resto de componentes quedaría: 10, 11, 12, 13...~~

~~13. Repite el ejercicio en otro módulo de forma que se inicie el primer elemento y el resto de componentes del vector sean el anterior más el índice actual. Ejemplo, si introducimos un 2 el primero el resto quedaría: 2, 3, 5, 8, 12, 17, 23...~~

~~14. ¿Dónde está la mosca? Vamos a intentar cazar una mosca. La mosca será un valor que se introduce en una posición de un vector; el jugador no ve el panel pero si ve las casillas a las que puede golpear. Si la mosca está en esa posición se acaba el juego, mosca cazada. Si la mosca no está en esa posición pueden ocurrir dos cosas: que la mosca esté en casillas
adyacentes en cuyo caso la mosca revolotea y se sitúa en otra casilla o que la mosca no esté en casillas adyacentes, en este caso la mosca permanece donde está.~~

~~15. Realizaremos el juego de las parejas. Se inicia un vector de n casillas (siendo n un número par) y se colocan al azar parejas de números. Ese panel se oculta al jugador al que se le mostrará un panel vacío del que irá destapando de 2 en 2. Si los números destapados coinciden se quedan visibles si no se muestran un segundo y luego se ocultan. El jugador tratará de recordar qué números eran para encontrar a su pareja.~~

~~16. Simularemos el lanzamiento de una piedra a un río. Se pedirá al usuario donde quiere lanzar la piedra (posición del vector) y la intensidad de la piedra (un número entero menor o igual que la dimensión máxima del vector). Cuando se lance, se almacena en esa casilla la pedrá y en las adyacentes se irán simulando las ondas con números que se van decrementando.
Ejemplo, si damos una pedrá del 4 en la posición 6: {0,0,1,2,3,4,3,2,1,0,0,0} Después, cada segundo, se irá calmando el río restándole uno a las posiciones con número. La simulación se parará cuando el río vuelva a estar en calma; todo a cero.~~

17. Realiza el juego de los barquitos pero con un vector. Sólo se pondrán submarinos (barcos de una casilla). El juego consiste en lo siguiente:
- Los paneles serán de 20 posiciones.
- Se pondrán 4 barcos: el ordenador coloca los suyos al azar y el jugador humano es preguntado. Los barcos no pueden estar colocados de forma adyacente. - Después, por turnos tira cada uno de los jugadores. El ordenador al azar y el humano es preguntado.
- El juego termina cuando uno de los dos acaba con la flota del otro.
Lógicamente se llevarán dos paneles para cada jugador: uno para su flota y otro para sus tiradas. Se irá mostrando el de sus tiradas. Al final del juego se muestran todos los paneles.

18. Realizaremos el juego del buscaminas con un vector. Para aquellos que no hayan jugado nunca (ni siquiera mientras estoy explicando algo) os recuerdo que el juego consiste en destapar todas las casillas de un vector menos las minas; si pisamos una mina el juego acaba y hemos perdido. El juego nos proporcionará pistas, de forma que si destapamos una casilla y no hay una mina, esta casilla nos indicará cuantas minas hay adyacentes a esa posición. Por lo tanto el ordenador debe preparar un panel de 20 casillas para nosotros en el que colocará 6 minas y las pistas correspondientes. Ejemplo: {0,1,*,1,1,*,*,2,*,1,0,0,0} Este panel permanecerá oculto y es el jugador el que debe tratar de descubrirlo.

19. Realiza el juego del Black Jack para jugar con el ordenador. El jugador parte con un saldo de 500€. Se parte de una apuesta inicial siempre positiva y siempre menor que su cantidad de saldo. Debes crear un vector con todas las cartas de la baraja. Se debe barajar de forma aleatoria. Se van sacado cartas y se almacenan en el vector del

