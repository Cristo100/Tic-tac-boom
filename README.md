# Tic-tac-boom

# Entrega 1 (15/11/23)
Para tener el juego de forma accesible y presentable se desarrollo dentro de JFrame form una representacion del juego exacata a lo solicitado para la actividad,
teniendo las 81 opciones en el que un jugador puede apretar junto a las alternativas de reiniciar el juego y salir de la ventana.

![image](https://github.com/Cristo100/Tic-tac-boom/assets/135175850/ff53b9a8-b04b-425c-8267-decaef81df63)

### Creacion de matrices:
Al momento de crear el juego, se tuvieron en cuenta 3 matrices:
1- las matrices base (gatito), son las matrices en los que se determinaran los movimientos de los jugadores a base de botones.
2- la gran matriz (gatote) que consiste en una union de las 9 matrices base en los que se desarrolla el juego en su totalidad.
3- la matriz ganadora, este es el que determina quien tiene una matriz base completa "conquistada" para ganar el juego de la gran matriz (gatote).<br>

### Librerias:
Respecto a las librerias importadas para el trabajo:

**javax.swing:** para identificar JButton de forma especifica dentro de los metodos<br>
**java.awt:** para editar las propiedades de los controles.<br>
**java.lang.reflect.Field:** Para tener un rango establecido por nombre dentro de los controles.<br>

### Metodos:
#### verifica_ganador(int[][] matriz):
Entre las acciones importantes dentro de una matriz base es saber si al momento de hacer algun cambio cause la victoria para alguno de
los jugadores, por lo que se identifican los posibles caso de victoria y se cambian los valores dependiendo del ganador (en nuestro caso es 0 si se puede jugar, 1 si gano X y 2 si ganó O).

#### verificacion():
Una vez revisado que hubo un ganador en una de las matrices base gracias a "verifica_ganador(int[][] matriz)", se anuncia este ganador y a la vez se verifica si hubo un "ganador definitivo" dentro de la gran matriz utilizando dentro de este metodo "verifica_ganador(matriz_ganadora)" haciendo que si ese es el caso se anuncie por la ventana y niegue que se puedan hacer nuevas puntuaciones al convertir "juego_ganado" a verdadero.

#### coordenada(javax.swing.JButton button, int[][] matriz, int x, int y, int gany, int ganx):
Cada boton que simboliza una opcion para marcar su signo dentro del juego posee este metodo que ejectuda el cambio de propiedades al boton para notar la diferencia de puntuaciones, ademas de cambiar el turno, modificar los valores de las matrices dentro de la gran matriz, impedir que se siga jugando dentro de un 3 en raya ya ocupado y llamar al metodo "verificacion()" para ver si hay una victoria cada vez que se hace una jugada.

#### reinicio_total():
Este metodo es utilizado en el boton de reinicio para hacer que todas las variables y matrices vuelvan a su estado inicial previo al juego. Esto incluye la matriz ganadora, configuracion de botones y matrices base.<br>

![image](https://github.com/Cristo100/Tic-tac-boom/assets/135175850/6bb70054-537a-4bac-a020-0207e2918167)


# Entrega 2 (22/11/23)
### Implementacion de clases.
Con un 3 en raya ya funcional, se implementó el uso de clases como en el diseño, teniendo separando la ventana, los 9 juegos individuales (gatito) y la gran matriz (gatote). En ventana se crean 9 objetos gatito y un objeto gatote, luego se incluye lo previamente creado a la gran matriz para tener definido las coordenadas del juego completo. Por el momento, gatote posee la mayoria de metodos, proximamente habra un orden respecto a la posicion y llamamente de estos (por ejemplo, verificacion() es respecto a una matriz 3x3, por lo que deberia estar en la clase gatito)

## Guardar y cargar
### Nuevas Bibliotecas:
Para que la implementacion de guardar y cargar el juego sea exitosa, se importaron nuevas bibliotecas.
<br>
**java.io.File:** manipular información sobre archivos y directorios en el sistema de archivos.
<br>
**java.io.FileWriter:** Escribir caracteres en un archivo.
<br>
**java.io.IOException:** Manejar errores relacionados con operaciones de lectura o escritura (tiene una funcionalidad respecto a las excepciones.)
<br>
**java.io.PrintWriter:** Se utiliza para escribir datos formateados a archivos de texto.
<br>
**java.util.Scanner:** Lectura de la entrada estándar del teclado, archivos o cadenas de texto.


### Guardar:
Dentro de la ventana, se creó el método cargaEstado(),  guarda el turno actual y el estado de cada cuadro del juego en un archivo de texto. Utiliza una matriz bidimensional (3x3) para representar el estado de cada cuadro, donde cada posición indica si la casilla está vacía, ocupada por el jugador 1 o el jugador 2, u otro estado relevante. La información se estructura para facilitar la recuperación y reanudación del juego desde el estado guardado. Igual se creó un botón invoca el método guardarEstado para guardar el estado actual del juego en un archivo llamado "guardado.txt".

### Cargar:
Dentro de la ventana, se creó el método cargaEstado(), este carga el estado previamente guardado del juego desde el archivo de texto. Lee la información almacenada, actualiza el turno y la matriz de cada cuadro en la matriz bidimensional gran_matriz. Después, actualiza la interfaz gráfica y fuerza su actualización.
<br><br>
De momento el guardar y cargar funcionan exitosamente a excepcion de la modificacion del color de los botones dentro del juego, se puede ver que existe un registro tras cargar en las matrices donde ya hubo un ganador e intentar hacer una jugada sobre ellos.


# Entrega 3 (29/11/23):

Entre el contenido que se debia completar es la modificacion de las propiedades de los botones respecto al contenido de la gran matriz. Al inicio los botones tenian el metodo coordenadas que permitia dicho boton ser modificado, pero al momento de cargar una partida no se presionaba ningun boton para identificar que propiedad cambiar (se podria decir que los botones estaban conectado)

Para corregir esto se modifico el metodo coordenadas para que no se genere un cambio de color en la matriz mencionada (de hecho se retiro toda variable relacionada a color dentro de esta clase) y se crearon 2 nuevos metodos dentro de ventana.

## COLORES
### actualizarColorBoton(int btn, int valor):
Este metodo se encarga de crear un numero y trabajar con una variable de valor, similar a coordenadas este utiliza la logica de que si valor es igual a uno este se pinta de rojo y si es 2 se pinta de azul. De igual manera que en el metodo de guardado, se uso la biblioteca relacionada a campos para crear tener el grupo de botones con los que se trabajaran en orden.

### actualizarColorBoton(int btn, int valor):
Para que actualizarColorBoton() inspeccione cada posible opcion de jugada que se ha hecho en el programa, se hizo un ciclo con contadores relacionado a la gran matriz, con el ciclo hecho en el que se obtienen los 3 en raya mas pequeños (matrizCuadro). Se repite de la misma forma con los pequeños para poder darle a valor el numero que corresponde con la matriz (int valor = matrizCuadro[l][k];) para finalmente llamarlo con el metodo descrito previamente.<br>


## Contra la computadora:
Para darle la opcion al usuario sobre que modo elejir, se creo una nueva ventana con esas dos opciones. haciendo visible el modo que elijio. Si el modo que elijio es contra la computadora, se habre "ventanabot" que a diferencia de la ventana comun en este se cambio la clase del objeto a "juego = new gatotebot();" <br> <br>

La clase gatotebot tiene la diferencia de que existe un metodo llamado "coordenadabot", que tiene el mismo proposito que coordenadas comun pero lo hace dentro de un while que hace repetir este movimiento hasta que el turno sea verdadero otra vez (esto es debido a que si marca dentro de una casilla ya ocupada no pasaria nada, por lo que se repite hasta que se haga el cambio de turno) para que el bot haga jugadas diferentes se utilizo la biblioteca "java.util.Random" para cambiar las variables X e Y entre el 0 y el 2 (limites dentro de un juego de 3 en linea) y haga una jugada comun. <br> <br>

De esa forma cada boton dentro de ventanabot tiene los metodos coordenadas() y coordenadabot() junto al metodo de actualizar los colores.  <br>  <br>

Entre las cosas que tenemos planeado modificar es la opcion del bot para jugar dentro de otras matrices, que al momento de triunfar en un juego gatito la computadora aun hace un movimiento dentro de esa matriz (aun asi marca como ganador al original) 

Esto se podria evitar si se escriben "if (juego_ganado == true){return;} if (matriz_ganadora[ganx][gany] != 0) {return;}", pero el metodo coordenadabot intentaria hacer jugadas infinitamentes dentro de una matriz que no esta permitido jugar (por eso de momento esta comentado)








