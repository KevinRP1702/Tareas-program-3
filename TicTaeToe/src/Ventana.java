import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Ventana {

	private JFrame frame;
	public boolean turno = true;
	int movimientos, contX, contO;
	public JButton btnNewButton;
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JButton btnNewButton_4;
	public JButton btnNewButton_5;
	public JButton btnNewButton_6;
	public JButton btnNewButton_7;
	public JButton btnNewButton_8;
	public JButton btnNewButton_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel panel_1 = new JPanel();
	JLabel lblGanadasO = new JLabel("O = 0");
	JLabel lblGanadasX = new JLabel("X = 0");
	
	private void initialize() {
		frame = new JFrame("TIc Tac Toe");
		frame.setBounds(100, 100, 457, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		panel_1.setBounds(0, 52, 434, 261);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3, 0, 0));
		

		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton.setEnabled(false);
			}
		});
		panel_1.add(btnNewButton);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_2.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_2);

		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_3.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_3);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_4.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_4);

		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_5.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_5);

		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_6.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_6);

		btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_7.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_7);

		btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_8.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_8);

		btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btnClick = ((JButton) e.getSource());
				click(btnClick);
				btnNewButton_9.setEnabled(false);
			}
		});

		panel_1.add(btnNewButton_9);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReiniciar.setBounds(0, 309, 441, 36);
		btnReiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				reinicio();
			}
		});
		frame.getContentPane().add(btnReiniciar);
		
		lblGanadasX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGanadasX.setBounds(88, 21, 46, 14);
		frame.getContentPane().add(lblGanadasX);
		
		lblGanadasO.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGanadasO.setBounds(257, 17, 64, 24);
		frame.getContentPane().add(lblGanadasO);
		}

	public void click(JButton btnClick) {
		movimientos++;
		btnClick.setFont(new Font("Arial", Font.BOLD, 20));
		if(turno == true) {
			btnClick.setText("X");
			turno = false;
		}else if(turno == false) {
			btnClick.setText("O");
			turno = true;
		}
		btnClick.setFocusable(false);
		ganador();
	}

	public void ganador() {
		if(btnNewButton.getText() == "O" && btnNewButton_2.getText()== "O" && btnNewButton_3.getText()== "O" || btnNewButton_4.getText() == "O" && btnNewButton_5.getText()== "O" && btnNewButton_6.getText()== "O" || btnNewButton_7.getText() == "O" && btnNewButton_8.getText()== "O" && btnNewButton_9.getText()== "O") {
			JOptionPane.showMessageDialog(null,"Gana el jugador O", "Ganador",JOptionPane.ERROR_MESSAGE);
			 contO++;
		}
		if(btnNewButton.getText() == "X" && btnNewButton_2.getText()== "X" && btnNewButton_3.getText()== "X" || btnNewButton_4.getText() == "X" && btnNewButton_5.getText()== "X" && btnNewButton_6.getText()== "X" || btnNewButton_7.getText() == "X" && btnNewButton_8.getText()== "X" && btnNewButton_9.getText()== "X") {
			JOptionPane.showMessageDialog(null,"Gana el jugador X", "Ganador",JOptionPane.ERROR_MESSAGE);
			 contX++;
		}
		if(btnNewButton.getText() == "O" && btnNewButton_4.getText()== "O" && btnNewButton_7.getText()== "O" || btnNewButton_2.getText() == "O" && btnNewButton_5.getText()== "O" && btnNewButton_8.getText()== "O" || btnNewButton_3.getText() == "O" && btnNewButton_6.getText()== "O" && btnNewButton_9.getText()== "O") {
			JOptionPane.showMessageDialog(null,"Gana el jugador O", "Ganador",JOptionPane.ERROR_MESSAGE);
			 contO++;
		}
		if(btnNewButton.getText() == "X" && btnNewButton_4.getText()== "X" && btnNewButton_7.getText()== "X" || btnNewButton_2.getText() == "X" && btnNewButton_5.getText()== "X" && btnNewButton_8.getText()== "X" || btnNewButton_3.getText() == "X" && btnNewButton_6.getText()== "X" && btnNewButton_9.getText()== "X") {
			JOptionPane.showMessageDialog(null,"Gana el jugador X", "Ganador",JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
			 contX++;
		}

		if(btnNewButton.getText() == "O" && btnNewButton_5.getText() == "O" && btnNewButton_9.getText() == "O") {
			JOptionPane.showMessageDialog(null,"Gana el jugador O", "Ganador",JOptionPane.ERROR_MESSAGE);
			 contO++;
		}

		if(btnNewButton.getText() == "X" && btnNewButton_5.getText() == "X" && btnNewButton_9.getText() == "X") {
			JOptionPane.showMessageDialog(null,"Gana el jugador X", "Ganador",JOptionPane.ERROR_MESSAGE);
			 contX++;
		}

		if(btnNewButton_3.getText() == "O" && btnNewButton_5.getText() == "O" && btnNewButton_7.getText() == "O") {
			JOptionPane.showMessageDialog(null,"Gana el jugador O", "Ganador",JOptionPane.ERROR_MESSAGE);
			 contO++;
		}

		if(btnNewButton_3.getText() == "X" && btnNewButton_5.getText() == "X" && btnNewButton_7.getText() == "X") {
			JOptionPane.showMessageDialog(null,"Gana el jugador X", "Ganador", JOptionPane.ERROR_MESSAGE);
			contX++;
		}

		if(movimientos == 9) {
			JOptionPane.showMessageDialog(null,"Ningún jugador ganó", "Empate", JOptionPane.ERROR_MESSAGE);	
		}
		
		lblGanadasX.setText("X = " + contX);
		lblGanadasO.setText("O = " + contO);
	}
	
	public void reinicio () {
		Component[] elementos = panel_1.getComponents();
		for(int i = 0; i <elementos.length; i++) {
			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
				JButton btn = ((JButton) elementos[i]);
				btn.setEnabled(true);
				btn.setText("");
				movimientos = 0;
			}
		}
	}
}