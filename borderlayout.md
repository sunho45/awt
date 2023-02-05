```
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
		contentPane.setLayout(new BorderLayout(30,20));// 수평간격이 30 수직간격을 40 LEFT로 정렬 
		contentPane.setBackground(Color.GRAY);// 컨텐트팬의 색을 주황색으로
		
		contentPane.add(new JButton("OK"),BorderLayout.CENTER); //OK추가
		contentPane.add(new JButton("div"),BorderLayout.WEST); //OK추가
		contentPane.add(new JButton("OK"),BorderLayout.EAST); //OK추가
		contentPane.add(new JButton("div"),BorderLayout.NORTH); //OK추가
		contentPane.add(new JButton("div"),BorderLayout.SOUTH); //OK추가
		
		
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
	}
	
public static void main(String[] args) {
		
		
		new QUEUE();
	
	







		
	}
	
}

```
다음과 같이 나온다.

![image](https://user-images.githubusercontent.com/100903674/216833878-0811ec7a-e6b2-4622-971c-6ea52d306f70.png)

