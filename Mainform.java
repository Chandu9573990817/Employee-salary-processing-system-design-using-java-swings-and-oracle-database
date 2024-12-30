import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainForm extends JFrame implements ActionListener
{
	JMenuBar jmb;
	JMenu jm;
	JMenuItem jmi1,jmi2;
	public MainForm()
	{
		
		jmb=new JMenuBar();
		jm=new JMenu("File");
		jmi1=new JMenuItem("Employee Form");
		jmi2=new JMenuItem("Exit");
		
		jm.add(jmi1);
		jm.addSeparator();
		jm.add(jmi2);
		jmb.add(jm);
		setJMenuBar(jmb);
		
		ImageIcon x=new ImageIcon("C:/Users/21pa1/Desktop/BankImage.jpg");
		JLabel img=new JLabel(x);
		add(img);
		
		setTitle("Employee salary processing system..");
		setBounds(50,50,700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		
	}
	
	public static void main(String args[])
	{
		MainForm m1=new MainForm();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==jmi1)
		{
			EmployeeForm e1=new EmployeeForm();
		}
		
		else if(e.getSource()==jmi2)
		{
			dispose();
			System.exit(1);
		}
	}
}
