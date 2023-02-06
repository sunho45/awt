import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QUEUE extends JFrame {
	private final int FLYING_UNIT=10;
	
	private JLabel btn=new JLabel("DEW");

	public QUEUE() {
		setTitle("My color Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(350,350);
		Container c=getContentPane();
	c.addMouseListener(new MyKeyListener());
	
	
	}
	
	class MyKeyListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			int r=(int) (Math.random()*256);
			int g=(int) (Math.random()*256);
			int b=(int) (Math.random()*256);
			Component c=(Component)e.getSource();
			c.setBackground(new Color(r,g,b));
			
		
		
		}
		
	
			
			
			
			}
			
			
			
	
public static void main(String[] args) {
		
		
		new QUEUE();
	}
	
}
