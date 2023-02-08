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
	ImageIcon computersmile=new ImageIcon("C:\\Users\\skyee\\Desktop\\pics/smile.jpg");
	ImageIcon computersad=new ImageIcon("C:\\Users\\skyee\\Desktop\\pics/sad.png");
	
	
	ImageIcon rolloverIcon =new ImageIcon();
	JButton btn=new JButton(normalIcon);
	JButton btnl=new JButton(normalIconl);
	JButton btnll=new JButton(normalIconll);
	JLabel computerhand=new JLabel(normalIcon);
	JLabel computerhandl=new JLabel(normalIconl);
	JLabel computerhandll=new JLabel(normalIconll);
	JLabel computerimage=new JLabel(computersmile);
	JLabel text=new JLabel("AI");
	Container c=getContentPane();
	JLabel img=new JLabel();
	JLabel la=new JLabel("컴퓨터와의 흥미진진한 가위바위보 대결!!");
	JLabel per =new JLabel("");
 public QUEUE() {
		setTitle("가위 바위 보");
		setSize(600,600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Font font = new Font("궁서", Font.BOLD + Font.ITALIC, 15);
		la.setForeground(Color.BLUE);
				la.setHorizontalAlignment(SwingConstants.CENTER);
				la.setFont(font);

		c.setLayout(null);
		btn.setLocation(50,300);
		btn.setSize(107,124);
		btnl.setLocation(225,300);
		btnl.setSize(97,151);
		btnll.setLocation(400,300);
		btnll.setSize(100,128);
		c.add(btn);
		c.add(btnl);
		c.add(per);
		c.add(btnll);
		c.add(la);
		c.add(text);
		c.add(computerimage);
		computerimage.setLocation(0,50);
		computerimage.setSize(150,150);
		text.setLocation(55,0);
		text.setFont(font);
		text.setSize(20,20);
		la.setLocation(100,50);
		la.setSize(400,400);
		per.setLocation(400,50);
		per.setSize(100,100);
		c.add(computerhand);
		c.add(computerhandl);
		c.add(computerhandll);
		
		btn.addActionListener(new myActionListener());
		btnl.addActionListener(new myActionListener());
		btnll.addActionListener(new myActionListener());
		
	
	}	
class myActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton te= (JButton)e.getSource();
		int a=(int)(Math.random()*3);
		int n=0;
		int win=0;
		if(e.getSource()==btn) {
			n++;
			a=(int)(Math.random()*3);
			if(a==0) {
				System.out.println(a);
				computerhand.setSize(107,124);
				computerhand.setLocation(225,100);
				computerhand.setIcon(normalIcon);
				la.setText("무승부!");
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
			}
			else if(a==1) {
				System.out.println(win);
				computerhandl.setSize(107,124);
				computerhandl.setLocation(225,100);
				computerhand.setIcon(normalIconl);
				la.setText("당신이 이겼습니다");
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
				win++;
				computerimage.setIcon(computersad);
			}
			else if(a==2) {
				System.out.println(0);
				computerhandll.setSize(107,124);
				computerhandll.setLocation(225,100);
				computerhand.setIcon(normalIconll);
				la.setText("당신이 졌습니다");
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
				computerimage.setIcon(computersmile);
			}
		}
		else if(e.getSource()==btnl) {
			n++;
			a=(int)(Math.random()*3);
			if(a==0) {
				System.out.println(a);
				computerhand.setSize(107,124);
				computerhand.setLocation(225,100);
				computerhand.setIcon(normalIcon);
				la.setText("당신이 졌습니다");
				computerimage.setIcon(computersmile);
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
			}
			else if(a==1) {
				System.out.println(a);
				computerhandl.setSize(107,124);
				computerhandl.setLocation(225,100);
				computerhand.setIcon(normalIconl);
				la.setText("무승부");
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
			}
			else if(a==2) {
				System.out.println(0);
				computerhandll.setSize(107,124);
				computerhandll.setLocation(225,100);
				computerhand.setIcon(normalIconll);
				la.setText("당신이 이겼습니다");
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
				computerimage.setIcon(computersad);
				win++;
			}
		}
		else if(e.getSource()==btnll) {
			n++;
			a=(int)(Math.random()*3);
			if(a==0) {
				System.out.println(a);
				computerhand.setSize(107,124);
				computerhand.setLocation(225,100);
				computerhand.setIcon(normalIcon);
				la.setText("당신이 이겼습니다");
				computerimage.setIcon(computersad);
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
				win++;
			}
			else if(a==1) {
				System.out.println(a);
				computerhandl.setSize(107,124);
				computerhandl.setLocation(225,100);
				computerhand.setIcon(normalIconl);
				la.setText("당신이 졌습니다");
				computerimage.setIcon(computersmile);
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
			}
			else if(a==2) {
				System.out.println(0);
				computerhandll.setSize(107,124);
				computerhandll.setLocation(225,100);
				computerhand.setIcon(normalIconll);
				la.setText("무승부");
				String t=Integer.toString((win/n)*100);
				per.setText(t+"%");
			}
		}
	}
}
public static void main(String[] args) {
	
	new QUEUE();
		
	}
}
