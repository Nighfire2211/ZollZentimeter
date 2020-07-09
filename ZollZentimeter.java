package JavaUebung08;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.event.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class ZollZentimeter extends JFrame{

	 private JPanel contentPane;
	 private JTextField tfZoll;
	 private JLabel lblZentimeter;
	 
	    public ZollZentimeter() {
	    	setTitle("Umrechnung von Zoll in Zentimeter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblZoll = new JLabel("Zoll");
		lblZoll.setBounds(10, 11, 46, 14);
		contentPane.add(lblZoll);

		tfZoll = new JTextField();
		tfZoll.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			    umrechnen();
			}
		    }
		});
		tfZoll.setBounds(10, 27, 110, 20);
		contentPane.add(tfZoll);
		tfZoll.setColumns(10);

		JButton btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			umrechnen();
		    }
		});
		btnUmrechnen.setBounds(10, 68, 110, 23);
		contentPane.add(btnUmrechnen);

		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) 
		    {
			System.exit(0);
		    }
		});
		btnEnde.setBounds(200, 68, 89, 23);
		contentPane.add(btnEnde);

		lblZentimeter = new JLabel("");
		lblZentimeter.setBounds(200, 27, 89, 14);
		contentPane.add(lblZentimeter);
	    }

	    private void umrechnen() {
		double z, cm;
		z = Double.parseDouble(tfZoll.getText());
		cm = z * 2.54;
		DecimalFormat f = new DecimalFormat("#0.00");
		lblZentimeter.setText(f.format(cm) + " cm");
		tfZoll.requestFocus();
		tfZoll.selectAll();
	    }
	public static void main(String[] args) 
	{
		
			try 
			{
			    ZollZentimeter frame = new ZollZentimeter();
			    frame.setVisible(true);
			} catch (Exception e) 
			{
			    e.printStackTrace();
			}
	}
		
		

}
