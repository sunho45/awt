import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QUEUE extends JFrame {
	private final int FLYING_UNIT=10;
	
	private JLabel btn=new JLabel("DEW");
	private int a=0;
	private int b=0;
	private int c=0;
	JTextField t=new JTextField(Integer.toString(a)); 
	JTextField tl=new JTextField(Integer.toString(b)); 
	JTextField tll=new JTextField(Integer.toString(c)); 
	
	
	public QUEUE() {
		setTitle("My color Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(350,350);
		Container c=getContentPane();
		t.setSize(30, 50);
		t.setBackground(Color.pink);
		tl.setSize(30, 50);
		tll.setSize(30, 50);
		t.setLocation(50, 10);
		tl.setLocation(150, 10);
		tll.setLocation(250, 10);
		c.add(t);
		c.add(tl);
		c.add(tll);
		
		
		c.setLayout(null);
		
		c.addKeyListener( new MyKeyListener());
		c.setFocusable(true);
		c.requestFocus();
	
	
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int KeyCode= e.getKeyCode();
			if(KeyCode==KeyEvent.VK_ENTER) {
				System.out.println(3);
				 t.setText(Integer.toString((int)(Math.random()*5)));
				 tl.setText(Integer.toString((int)(Math.random()*5)));
				 tll.setText(Integer.toString((int)(Math.random()*5)));
			
			
			
			}
		
		
		}
		
	
			
			
			
			}
			
			
			
	
public static void main(String[] args) {
		
		
		new QUEUE();
	}
	
}
