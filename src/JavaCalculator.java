import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class JavaCalculator {

	private JFrame ScientificCalculator;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCalculator window = new JavaCalculator();
					window.ScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Creating the Application
	public JavaCalculator() {
		initialize();
	}

	// Initializing
	private void initialize() {
		ScientificCalculator = new JFrame();
		ScientificCalculator.setTitle("Scientific Calculator");
		ScientificCalculator.getContentPane().setBackground(Color.WHITE);
		ScientificCalculator.setResizable(false);
		ScientificCalculator.setBounds(100, 100, 446, 839);
		ScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScientificCalculator.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Scientific Calculator");
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setBounds(12, 13, 404, 29);
		ScientificCalculator.getContentPane().add(label);
		
		textField = new JTextField();
		
		textField.setBackground(SystemColor.menu);
		textField.setFont(new Font("DialogInput", Font.PLAIN, 48));
		textField.setBounds(12, 55, 404, 89);
		ScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnR.setBounds(12, 192, 71, 72);
		ScientificCalculator.getContentPane().add(btnR);
		
		JButton btnx = new JButton("1/x");
		
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnx.setBounds(12, 277, 71, 72);
		ScientificCalculator.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("X^Y");
		
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnXy.setBounds(12, 362, 71, 72);
		ScientificCalculator.getContentPane().add(btnXy);
		
		JButton btnX_1 = new JButton("X^3");
		
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX_1.setBounds(12, 447, 71, 72);
		ScientificCalculator.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("X^2");
		
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX.setBounds(12, 532, 71, 72);
		ScientificCalculator.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				double fact=1;
				while(a!=0 && a<999999999 && a>-999999999)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnN.setBounds(12, 617, 71, 72);
		ScientificCalculator.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPlusMinus.setBounds(12, 702, 71, 72);
		ScientificCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEx.setBounds(95, 192, 71, 72);
		ScientificCalculator.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("Log");
		
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLog.setBounds(95, 277, 71, 72);
		ScientificCalculator.getContentPane().add(btnLog);
		
		JButton btnPercent = new JButton("%");
		
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPercent.setBounds(95, 362, 71, 72);
		ScientificCalculator.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(95, 447, 71, 72);
		ScientificCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(95, 532, 71, 72);
		ScientificCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(95, 617, 71, 72);
		ScientificCalculator.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSin.setBounds(178, 192, 71, 72);
		ScientificCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSinh.setBounds(178, 277, 71, 72);
		ScientificCalculator.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClear.setBounds(178, 362, 71, 72);
		ScientificCalculator.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(178, 447, 71, 72);
		ScientificCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(178, 532, 71, 72);
		ScientificCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(178, 617, 71, 72);
		ScientificCalculator.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(95, 702, 154, 72);
		ScientificCalculator.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("Cos");
		
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCos.setBounds(261, 192, 71, 72);
		ScientificCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCosh.setBounds(261, 277, 71, 72);
		ScientificCalculator.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnBackSpace.setFont(new Font("wingdings", Font.PLAIN, 17));
		btnBackSpace.setBounds(261, 362, 71, 72);
		ScientificCalculator.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(261, 447, 71, 72);
		ScientificCalculator.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(261, 532, 71, 72);
		ScientificCalculator.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(261, 617, 71, 72);
		ScientificCalculator.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDot.setBounds(261, 702, 71, 72);
		ScientificCalculator.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTan.setBounds(344, 192, 71, 72);
		ScientificCalculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTanh.setBounds(344, 277, 71, 72);
		ScientificCalculator.getContentPane().add(btnTanh);
		
		JButton btnAdd = new JButton("+");
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdd.setBounds(344, 362, 71, 72);
		ScientificCalculator.getContentPane().add(btnAdd);
		JButton btnSub = new JButton("-");
		
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSub.setBounds(344, 447, 71, 72);
		ScientificCalculator.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMul.setBounds(344, 532, 71, 72);
		ScientificCalculator.getContentPane().add(btnMul);
		JButton btnDivide = new JButton("/");
		
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDivide.setBounds(344, 617, 71, 72);
		ScientificCalculator.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second= Double.parseDouble(textField.getText());
				if (operation=="+"){
					result = first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="-"){
					result = first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="*"){
					result = first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="/"){
					result = first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="%"){
					result = first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="X^Y")
				{
					double resultt=1;
					for (int i=0;i<second;i++)
					{
						resultt = first*resultt;
					}
					
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEqual.setBounds(344, 702, 71, 72);
		ScientificCalculator.getContentPane().add(btnEqual);
		
	}
}
