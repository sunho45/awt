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
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		setSize(300,300);
		setVisible(true);
		c.add(btn);
		
		
		
		
	}
	
public static void main(String[] args) {
		
		
		new QUEUE();
	
	







		
	}
	
}
class MyActionListener implements ActionListener{
	


private static final String JButton = null;

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b= (JButton)e.getSource();
	if(b.getText().equals("Action")) {
		
		b.setText("액션");
	}
	else {
			b.setText("ACTION");
		}
		
	
	
}
}
