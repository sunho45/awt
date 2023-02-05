# awt

타이틀 달기
```
setTitle("ContentPane");// 프레임 타이틀 달기
```

실행창 사이즈 설정

```
setSize(300,300)

```
실행창 프레임 출력
```
setVisbile(true);
```
프로그램 윈도우를 닫으면 프로그램을 종료핟로고 설정
```
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

```
컨텐트 팬을 알아낸다.
```
Container contentPane =getContentPane();



```

컨텐트팬의 색을 설정
```
contentPane.setBackground(Color.ORANGE);// 컨텐트팬의 색을 주황색으로
		

```
버튼 생성
```
contentPane.add(new JButton("OK");

```
배치 설정
```

		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));// 수평간격이 30 수직간격을 40 LEFT로 정렬
```

튜토리얼대로 하면

![image](https://user-images.githubusercontent.com/100903674/216833453-4e95f471-d70b-4f34-a78f-8c78799195dc.png)
경계대로 버튼을 지정하려면

```
contentPane.setLayout(new BorderLayout(30,20));


```
버튼 지정
```
contentPane.add(new JButton("OK"),BorderLayout.CENTER); 중앙지역에 버튼 추가
		contentPane.add(new JButton("div"),BorderLayout.WEST); 서쪽에 버튼 
		contentPane.add(new JButton("OK"),BorderLayout.EAST); //OK추가
		contentPane.add(new JButton("div"),BorderLayout.NORTH); //OK추가
		contentPane.add(new JButton("div"),BorderLayout.SOUTH);
```
격자형태로 버튼 지정
```
contentPane.setLayout(new GridLayout(4,3));//4*3격자로 창을 분류해 배치


```

4*3 형태로 배치하면

![image](https://user-images.githubusercontent.com/100903674/216835989-2c022528-b11d-4692-9bf5-738863bf855c.png)

텍스트 출력
```
contentPane.add(new JLabel("너의 이름은?")); 
```

입력테스트 추가
```
contentPane.add(new JTextField(" ")); 
```

![image](https://user-images.githubusercontent.com/100903674/216836490-fdbfff3d-92df-4dec-b80d-1bb16c26d5f5.png)

컨텐트 팬이 키 입력을 받을 수 있도록 포커스 강제 지정

```
c.setFocusable(true);
		c.requestFocus();
	



```
```



```

컨텐트팬에 마우스 리스더 달기
```
c.addMouseListener(new MyMouseListener());

```

컨텐트팬에 키 리스너 달기
```
c.addKeyListener(new MyKeyListener());
```
입력받은 키 코드 알아내기
```
int key=e.getKeyCode();
```
