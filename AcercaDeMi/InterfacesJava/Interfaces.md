   ## EVENTOS
En Java los eventos son objetos y se generan como resultado de la interacción del usuario
con la interfase gráfica. 
Estos Objetos-Eventos son subclases de la clase EventObject en el paquete java.util. Todas estas acciones generaran Objetos-Evento:
- El movimiento y hacer click con el ratón.
- Entrada de caracteres con el teclado.
- Seleccionar un elemento de una lista.
- Desplazarse por una página (scroll).
![LogoJava](https://www.jairogarciarincon.com/img/clases/1325.jpg)

## Interfaces:
-------------------------------------------
#### **ActionListener** 
##### **Eventos del usuario en la interfaz (Click en botón, seleccionar elemento de lista/ opción de menú**   
-------------------------------------------
#### **FocusEvent** 
##### **Se genera cuando un elemento gana o pierde el foco**
-------------------------------------------
#### **MouseEvent** 
##### **Mover puntero del raton, o que el puntero entre/salga de un componente, presionar/liberar botón)**
-------------------------------------------
#### **KeyEvent** 
##### **Entrada desde el teclado**
-------------------------------------------
### **ItemEvent** 
##### **Click en checkbox, click en elemento de lista, click en opción de menú**
-------------------------------------------
#### **TextEvent** 
##### **Cambiar el valor de un campo de text**
-------------------------------------------
#### **WindowEvent** 
##### **Activar/Desactivar ventana, cerrarla, minimizar, maximizar**
-------------------------------------------
## *Interfaces Listeners y sus Métodos*
- En el paquete java.awt.event se definen clases "Event Listeners" que pueden recibir tipos de eventos.
- Estos "Event Listeners" se asocian a componentes de la interfaz gráfica "Event Source"
- Los "Listeners" escuchan y esperan a que el evento se produzca para realizar las acciones programadas
- Cuando se produce un evento en alguna fuente de eventos (ratón, botón, ventana)
se envían objetos de tipo "Event Object" a todos los "Event Listeners" registrados
- Cada "Event listener" utiliza la información recibida en este "Event Object"
para realizar las operaciones que tenga programadas.

------------------------------------------------------------
#### ActionListener: 
> actionPerformed(ActionEvent e)

#### KeyListener: 
> keyPressed(KeyEvent e)
  keyReleased(KeyEvent e)
  keyTyped(KeyEvent e)

#### FocusListener:
> focusGained(FocusEvent e)
  focusLost(FocusEvent e)

#### MouseListener
> mouseClicked(MouseEvent e)
  mouseEntered(MouseEvent e)
  mouseExited(MouseEvent e)
  mousePressed(MouseEvent e)
  mouseReleased(MouseEvent e)

#### WindowListener
> windowActivated(WindowEvent)
windowClosed(WindowEvent)
windowClosing(WindowEvent)
windowDeactivated(WindowEvent)

#### AdjustmentListener
> adjustmentValueChanged(AdjustementEvent e)

#### ComponentListener
> componentHidden(ComponentEvent e)
componentMoved(ComponentEvent e)
componentResized(ComponentEvent e)
componentShown(ComponentEvent e)

#### ContainerListener
>componentAdded(ContainerEvent e)
componentRemoved(ContainerEvent e)

#### ItemListener 
> itemStateChanged(ItemEvent e)

#### MouseMotionListener
> mouseDragged(MouseEvent e)
mouseMoved(MouseEvent e)

#### TextListener
> textValueChanged(TextEvent e)


