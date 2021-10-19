###### Danna González 20100203
# JAVA :symbols:
## ¿Qué es un hilo en Java? :thinking:
 
> Un **hilo** es un flujo de control dentro de un programa. Creando varios hilos podremos realizar varias tareas simultáneamente. Cada **hilo** tendrá sólo un contexto de ejecución (contador de programa, pila de ejecución). 

## Creación de hilos
----------------------------------------------------
En Java los hilos están encapsulados en la clase Thread. Para crear un hilo tenemos dos posibilidades:

- Heredar de Thread redefiniendo el método run().
- Crear una clase que implemente la interfaz Runnable que nos obliga a definir el método run().
En ambos casos debemos definir un método run() que será el que contenga el código del hilo. Desde dentro de este método podremos llamar a cualquier otro método de cualquier objeto, pero este método run() será el método que se invoque cuando iniciemos la ejecución de un hilo. El hilo terminará su ejecución cuando termine de ejecutarse este método run().
##### **Para crear nuestro hilo mediante herencia haremos lo siguiente:**
```
1 public class EjemploHilo extends Thread  
2 {      
3     public void run()() 
4     {
5         // Código del hilo      
6     }  
7 }
```
![HiloJava](https://lh3.googleusercontent.com/proxy/CyLSlFcEpsPvRgKSKs6XhVUyUVANRLX8hoURPL2GX46hMF1lBYwH432-8FMAhy7bhw2Es6gbih8_kNgzF5iFh0vxirAfj37ehn9kakI)

-

## ¿Cómo los implementamos (Extendiendo la clae Thread       Implementando la interfaz Runnable) :interrobang:
-------------------------------------------------------------
#### Creación de un Thread :speech_balloon:

Hay dos modos de conseguir hilos de ejecución (threads) en Java. Una es implementando el interfaz Runnable, la otra es extender la clase Thread.
El primer método de crear un hilo de ejecución es simplemente extender la clase Thread:

class **MiThread extends Thread** {
    public void run() {
        . . .
   ...........................}

El ejemplo anterior crea una nueva clase MiThread que extiende la clase Thread y sobreescribe el método Thread.run() por su propia implementación. El método run() es donde se realizará todo el trabajo de la clase. Extendiendo la clase Thread, se pueden heredar los métodos y variables de la clase padre. En este caso, solamente se puede extender o derivar una vez de la clase padre. Esta limitación de Java puede ser superada a través de la implementación de Runnable:

public class **MiThread implements Runnable** {
    Thread t;
   ..... public void run() {
..... // Ejecución del thread una vez creado
...........}
....}
En este caso necesitamos crear una instancia de Thread antes de que el sistema pueda ejecutar el proceso como un hilo. Además, el método abstracto run() está definido en el interfaz Runnable y tiene que ser implementado. La única diferencia entre los dos métodos es que este último es mucho más flexible. En el ejemplo anterior, todavía está la oportunidad de extender la clase MiThread, si fuese necesario. La mayoría de las clases creadas que necesiten ejecutarse como un hilo, implementarán el interfaz Runnable, ya que probablemente extenderán alguna de su funcionalidad a otras clases.

No pensar que el interfaz Runnable está haciendo alguna cosa cuando la tarea se está ejecutando. Solamente contiene métodos abstractos, con lo cual es una clase para dar idea sobre el diseño de la clase Thread. De hecho, si se observan los fuentes de Java, se puede comprobar que solamente contiene un método abstracto:

package java.lang;
public interface Runnable {
..... public abstract void run() ;
    }
Y esto es todo lo que hay sobre el interfaz Runnable. Como se ve, un interfaz sólo proporciona un diseño para las clases que vayan a ser implementadas. En el caso de Runnable, fuerza a la definición del método run(), por lo tanto, la mayor parte del trabajo se hace en la clase Thread. Un vistazo un poco más profundo a la definición de la clase Thread da idea de lo que realmente está pasando: 

public class **Thread implements Runnable** {
    ...
..... public void run() {
.......... if( tarea != null )
    .................tarea.run() ;
............. }
......... }
    ...
    }

----------------------------------------------------------
### 	:information_source: El interface Runnable
El **_interface Runnable_** solamente declara una función miembro denominada run, que han de definir las clases que implementen este interface.

public interface Runnable {
    public abstract void run();
}
En nuestro caso, la clase que describe el applet RelojApplet deriva de Applet por lo que no puede derivar también de Thread (no existe la herencia múltiple en Java), sino que tiene que implementar el interface Runnable y definir la función run.

### 	:information_source: Arranque de un Thread 

Las aplicaciones ejecutan main() tras arrancar. Esta es la razón de que main() sea el lugar natural para crear y arrancar otros hilos. La línea de código:

    t1 = new TestTh( "Thread 1",(int)(Math.random()*2000) );
Crea un nuevo hilo de ejecución. Los dos argumentos pasados representan el nombre del hilo y el tiempo que se desea que espere antes de imprimir el mensaje.

Al tener control directo sobre los hilos, hay que arrancarlos explícitamente. En el ejemplo con:

    t1.start();
start(), en realidad es un método oculto en el hilo de ejecución que llama a run().