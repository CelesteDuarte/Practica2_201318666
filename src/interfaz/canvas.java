package interfaz;
import Listas.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class canvas extends JPanel implements ActionListener{
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		this.setBackground(Color.WHITE);
		
		//Locomotora
	    g.setColor(Color.GREEN);
	    int [] vx2 = {570, 600, 570};
	    int [] vy2 = {280, 305, 305};
	    g.fillPolygon (vx2, vy2, 3);
	    
		g.setColor(Color.YELLOW);
		g.fillRect(500, 250, 70, 60);
	    g.setColor (Color.BLACK);
	    g.fillOval (538, 300, 26, 26);
	    g.fillOval (502, 300, 26, 26);
	    
		//vagon 1ra clase
		g.setColor(Color.BLUE);
		g.fillRect(410, 250, 70, 60);
	    g.setColor (Color.BLACK);
	    g.fillOval (448, 300, 26, 26);
	    g.fillOval (412, 300, 26, 26);
	    
	    //vagon 3ra clase
		g.setColor(new Color(200,100,220));
		g.fillRect(320, 250, 70, 60);
	    g.setColor (Color.BLACK);
	    g.fillOval (358, 300, 26, 26);
	    g.fillOval (322, 300, 26, 26);
	    
	    //vagon carbón
	    g.setColor (Color.GRAY);
		g.fillRect(230, 250, 70, 60);    
	    g.setColor (Color.BLACK);
	    g.fillOval (268, 300, 26, 26);
	    g.fillOval (232, 300, 26, 26);
	}
		
		private JButton Retroceder,Avanzar,Salir;
		public canvas(){
        setLayout(null);
        Retroceder=new JButton("Retroceder");
        Retroceder.setBounds(450,500,100,40);
        add(Retroceder);
        Retroceder.addActionListener(this);
        
        Avanzar=new JButton("Avanzar");
        Avanzar.setBounds(550,500,100,40);
        add(Avanzar);
        Avanzar.addActionListener(this);
        
        Salir=new JButton("Salir");
        Salir.setBounds(650,500,100,40);
        add(Salir);
        Salir.addActionListener(this);    
		}
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource()==Retroceder) {
	            setName("Retroceder");
	        }
	        if (e.getSource()==Avanzar) {
	            setName("Avanzar");
	        }
	        if (e.getSource()==Salir) {
	            System.exit(0);
	        }
	    }
	
    
    public static void main(String[]args){
    	JFrame f= new JFrame("Estación");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	canvas p= new canvas();
    	f.add(p);
        f.setSize(800,600);
        f.setVisible(true);
    canvas micanvitas=new canvas();
    micanvitas.setBounds(0,0,350,200);
    micanvitas.setVisible(true);
    }


}