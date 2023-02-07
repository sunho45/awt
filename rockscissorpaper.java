import java.util.*;
import java.math.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
public class QUEUE extends JFrame {
	ImageIcon normalIcon=new ImageIcon("C:\\Users\\skyee\\Desktop\\pics/rock.png");
	ImageIcon normalIconl=new ImageIcon("C:\\Users\\skyee\\Desktop\\pics/scissor.png");
	ImageIcon normalIconll=new ImageIcon("C:\\Users\\skyee\\Desktop\\pics/paper.png");
	
	ImageIcon rolloverIcon =new ImageIcon();
	JButton btn=new JButton(normalIcon);
	JButton btnl=new JButton(normalIconl);
	JButton btnll=new JButton(normalIconll);
	JLabel img=new JLabel();
	public QUEUE() {
		setTitle("가위 바위 보");
		setSize(600,600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container c=getContentPane();
		c.setLayout(null);
		btn.setLocation(50,300);
		btn.setSize(107,124);
		btnl.setLocation(225,300);
		btnl.setSize(97,151);
		btnll.setLocation(400,300);
		btnll.setSize(100,128);
		c.add(btn);
		c.add(btnl);
		
		c.add(btnll);
		
	
	}	
class myActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton te= (JButton)e.getSource();
		if(te.get(btn)) {
			
		}
		
	}
