# Tic-tac-boom
Para tener el juego de forma accesible y presentable se desarrollo dentro de JFrame form una representacion del juego exacata a lo solicitado para la actividad,
teniendo las 81 opciones en el que un jugador puede apretar junto a las alternativas de reiniciar el juego y salir de la ventana.

![image](https://github.com/Cristo100/Tic-tac-boom/assets/135175850/ff53b9a8-b04b-425c-8267-decaef81df63)

### Creacion de matrices:
Al momento de crear el juego, se tuvieron en cuenta 3 matrices:
1- las matrices base, son las matrices en los que se determinaran los movimientos de los jugadores a base de botones.
2- la gran matriz que consiste en una union de las 9 matrices base en los que se desarrolla el juego en su totalidad.
3- la matriz ganadora, este es el que determina quien tiene una matriz base completa "conquistada" para ganar el juego de la gran matriz.


### Librerias:
Respecto a las librerias importadas para el trabajo:
javax.swing: para identificar JButton de forma especifica dentro de los metodos
java.awt: para editar las propiedades de los controles.
java.lang.reflect.Field: Para tener un rango establecido por nombre dentro de los controles.

### Metodos:
### verifica_ganador:
Entre las acciones importantes dentro de una matriz base es saber si al momento de hacer algun cambio cause la victoria para alguno de
los jugadores, por lo que se identifican los posibles caso de victoria y se cambian los valores dependiendo del ganador (en nuestro caso es 0 si se puede jugar, 1 si gano X y
2 si ganó O), esto 


![image](https://github.com/Cristo100/Tic-tac-boom/assets/135175850/6bb70054-537a-4bac-a020-0207e2918167)
