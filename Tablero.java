import javax.swing.*;
import java.awt.*;

public class Tablero extends JPanel{
    
    public Tablero(){
        setBackground(Color.BLUE);
    }    

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLUE);
        g2.fill(new Rectangle2D.Double(0,0,20,20));
    }
}
