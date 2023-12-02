package Calculadora_basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class job extends JFrame {

	private JPanel contentPane;
	private final JTextField txtPantalla = new JTextField();
	
	double numero1;
	double numero2;
	double resultado;
	String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					job frame = new job();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public job() {
		setBackground(new Color(135, 206, 250));
		setTitle("Calculadora basica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 335);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		txtPantalla.setBounds(10, 11, 279, 29);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnLimpiador = new JButton("C");
		btnLimpiador.setForeground(new Color(255, 255, 255));
		btnLimpiador.setBackground(new Color(128, 0, 0));
		btnLimpiador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnLimpiador.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnLimpiador.setBounds(238, 42, 51, 41);
		contentPane.add(btnLimpiador);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="+";
			}
		});
		btnSuma.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnSuma.setBounds(238, 87, 51, 41);
		contentPane.add(btnSuma);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn3.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn3.setBounds(187, 87, 51, 41);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn2.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn2.setBounds(137, 87, 51, 41);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn1.setBounds(86, 87, 51, 41);
		contentPane.add(btn1);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="-";
			}
		});
		btnResta.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnResta.setBounds(238, 132, 51, 41);
		contentPane.add(btnResta);
		
		JButton btnMiltiplicacion = new JButton("x");
		btnMiltiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="*";
			}
		});
		btnMiltiplicacion.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnMiltiplicacion.setBounds(238, 175, 51, 41);
		contentPane.add(btnMiltiplicacion);
		
		JButton btnDivison = new JButton("/");
		btnDivison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion ="/";
			}
		});
		btnDivison.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnDivison.setBounds(238, 219, 51, 41);
		contentPane.add(btnDivison);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn6.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn6.setBounds(187, 132, 51, 41);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn9.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn9.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn9.setBounds(187, 175, 51, 41);
		contentPane.add(btn9);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionar;
				numero2 = Double.parseDouble(txtPantalla.getText());
				
				if(operacion == "+") {
					resultado = numero1+numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
				else if(operacion == "-") {
					resultado = numero1-numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
				else if(operacion == "*") {
					resultado = numero1*numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
				else if(operacion == "/") {
					resultado = numero1/numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
			}
		});
		btnIgual.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnIgual.setBounds(187, 219, 51, 41);
		contentPane.add(btnIgual);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn5.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn5.setBounds(137, 132, 51, 41);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn8.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn8.setBounds(137, 175, 51, 41);
		contentPane.add(btn8);
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btnCero.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btnCero.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnCero.setBounds(137, 219, 51, 41);
		contentPane.add(btnCero);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn4.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn4.setBounds(86, 132, 51, 41);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btn7.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn7.setBounds(86, 175, 51, 41);
		contentPane.add(btn7);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = txtPantalla.getText() + btnPunto.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btnPunto.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnPunto.setBounds(86, 219, 51, 41);
		contentPane.add(btnPunto);
		
		JButton btnBorrar = new JButton("C");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnBorrar.setBackground(new Color(255, 0, 0));
		btnBorrar.setForeground(new Color(128, 128, 128));
		btnBorrar.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnBorrar.setBounds(32, 87, 51, 173);
		contentPane.add(btnBorrar);
	}
}
