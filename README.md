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



