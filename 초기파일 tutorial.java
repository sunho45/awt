import javax.swing.*;
import java.awt.*;
public class QUEUE extends JFrame {
	/**
	 * 
	 */
	

	public QUEUE() {
		setTitle("TEST");//프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 윈도우를 닫으면 프로그램을 종료핟로고 설정
		
		Container contentPane=getContentPane();// 컨텐트 팬을 알아낸다
		contentPane.setBackground(Color.ORANGE);// 컨텐트팬의 색을 주황색으로
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK")); //OK추가
		
		
		
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
	}
	
public static void main(String[] args) {
		
		
		QUEUE test=new QUEUE();
	
	







		
	}
	
}
