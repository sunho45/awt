import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QUEUE extends JFrame {
	/**
	 * 
	 */
	private JButton btn=new JButton("DEW");

	public QUEUE() {
		setTitle("설문 조사");//프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 윈도우를 닫으면 프로그램을 종료핟로고 설정
		
		Container c=getContentPane();// 컨텐트 팬을 알아낸다
		c.setLayout(null);
		
		c.addMouseListener(  new MyMouseAdapter());
		setSize(300,300);
		setVisible(true);
		c.add(btn);
		
		btn.setLocation(30,90);
		btn.setSize(100,50);
		
		
	}
	
	class MyMouseAdapter extends MouseAdapter{

		
		
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			btn.setLocation(x, y);
		}

		

		
		
		
		
		
		
	
	}
	
	
	

	
public static void main(String[] args) {
		
		
		new QUEUE();
	
	







		
	}
	
}
