import javax.swing.*; 
 public class Ventana extends JFrame{

    private Tablero tablero;

    public Ventana(){
        setTitle("Pong");
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        tablero = new Tablero();
        add(tablero);
     }

     

 }