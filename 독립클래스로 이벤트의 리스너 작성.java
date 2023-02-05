import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QUEUE extends JFrame {
	/**
	 * 
	 */
	

	public QUEUE() {
		setTitle("설문 조사");//프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 윈도우를 닫으면 프로그램을 종료핟로고 설정
		
		Container c=getContentPane();// 컨텐트 팬을 알아낸다
		c.setLayout(new FlowLayout());
		JButton btn=new JButton();
		btn.addActionListener(new MyActionListener());
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
	}
	
public static void main(String[] args) {
		
		
		new QUEUE();
	
	







		
	}
	
}
class MyActionListener implements ActionListener{
	


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
