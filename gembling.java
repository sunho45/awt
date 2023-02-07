import java.util.*;
import java.math.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
public class QUEUE extends JFrame {
	JButton btn=new JButton("겜블링");
	JTextField a=new JTextField("0");
	JTextField b=new JTextField("0");
	JTextField d=new JTextField("0");
	JLabel j=new JLabel("겜블링 스타트 버튼을 클릭해주세요");
	Font font = new Font("궁서", Font.BOLD + Font.ITALIC, 25);
	public QUEUE(){
		setTitle("gembling");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(660,330);
		btn.setSize(100,50);
		btn.setLocation(280, 200);
		btn.addActionListener(new myActionListener());
		Container c= getContentPane();
		c.setLayout(null);
		c.add(btn);
		c.add(a);
		a.setSize(80, 100);
		a.setBackground(Color.pink);
		a.setForeground(Color.yellow);
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setFont(font);
		a.setLocation(100, 50);
		c.add(b);
		b.setSize(80, 100);
		b.setLocation(300, 50);
		b.setForeground(Color.yellow);
		b.setBackground(Color.pink);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setFont(font);
		c.add(d);
		d.setSize(80, 100);
		d.setLocation(500, 50);
		d.setForeground(Color.yellow);
		d.setHorizontalAlignment(SwingConstants.CENTER);
		d.setBackground(Color.pink);
		d.setFont(font);
		c.add(j);
		j.setSize(200, 100);
		j.setLocation(400, 150);
	}
	
class myActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton te= (JButton)e.getSource();
		if(te.getText().equals("겜블링")) {
			int t=(int)(Math.random()*8);
			int tl=(int)(Math.random()*8);
			int tll=(int)(Math.random()*8);
			a.setText(Integer.toString(t));
			
			d.setText(Integer.toString(tll));
			
			
			b.setText(Integer.toString(tl));
			btn.setText("겜블링");
			if(t==tll&&t==tl) {
				j.setText("당신은 운이 좋군요");
			}
			else {
				j.setText("야레야레");
			}
			
			
		}
		
	}
	
}
			
			
	
public static void main(String[] args) {
	
	new QUEUE();
		
	}
	
}
