package interfaz;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import Listas.*;

public class frame extends JFrame {
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Create the frame
	public frame() {
		setTitle("Train Simulator 1885");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(260, 60, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton NewButton1 = new JButton("Ejecutar");
		NewButton1.setBounds(45, 440, 127, 55);
		NewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lista lista=new Lista();
				lista.Agregar(1, "locomotora");
				lista.Agregar(10, "2");
				lista.Agregar(30, "3");
				lista.Imprimir( );
				System.out.println(lista.Tamano());
				lista.Eliminar();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(NewButton1);
		
		JLabel lblBienvenidoA = new JLabel("Bienvenido al servicio de trenes Steam Railway Company");
		lblBienvenidoA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 19));
		lblBienvenidoA.setBounds(156, 11, 466, 28);
		contentPane.add(lblBienvenidoA);
	}
}

