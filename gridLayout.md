import javax.swing.*;
import java.awt.*;
public class QUEUE extends JFrame {
	/**
	 * 
	 */
	

	public QUEUE() {
		setTitle("나의 휴대전화");//프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 윈도우를 닫으면 프로그램을 종료핟로고 설정
		
		Container contentPane=getContentPane();// 컨텐트 팬을 알아낸다
		contentPane.setLayout(new GridLayout(4,3));//4*3격자로 창을 분류해 배치
		contentPane.setBackground(Color.GRAY);// 컨텐트팬의 색을 주황색으로
		
		contentPane.add(new JButton("1")); //OK추가
		contentPane.add(new JButton("2")); //OK추가
		contentPane.add(new JButton("3")); //OK추가
		contentPane.add(new JButton("4")); //OK추가
		contentPane.add(new JButton("5")); //OK추가

		contentPane.add(new JButton("6")); //OK추가
		contentPane.add(new JButton("7")); //OK추가
		contentPane.add(new JButton("8")); //OK추가
		contentPane.add(new JButton("9")); //OK추가
		contentPane.add(new JButton("0")); //O
	
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
	}
	
public static void main(String[] args) {
		
		
		new QUEUE();
	
	







		
	}
	
}
