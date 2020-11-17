package day1117.awt;

import java.awt.Button;
import java.awt.Frame;

/**
 * 윈도우 프로그래밍 (Component Programming)
 * @author owner
 */

//1. 윈도우 Component를 상속 받는다. (사용자 에게 보여주기 위해서)
@SuppressWarnings("serial") //암호를 사용하지 않겠다. (추후 I/O 수업때 배울 예정)
public class HellowAWT extends Frame {

	//2.생성자를 작성한다.
	public HellowAWT() {
		//부모생성자를 호출한다. title을 입력해 부모 class의 생성자를 호출한다.
		//프로그램이 만들어 졌을 때 프로그램의 title을 의미
		super("안녕하세요. AWT!");
		
		//3.컴포넌트 생성
		Button btn = new Button("나는 버튼 ^o^");
		
		//4.컴포넌트 배치
		add(btn);
		
		//5.Window의 크기를 설정한다.
		setSize(200,100);
		
		//6.사용자에게 보여주기
		setVisible(true);
		
		//아직 프로그램을 닫는 이벤트처리는 배우지 않았다 (~11.17)
		
	}//HellowAWT

	public static void main(String[] args) {

			new HellowAWT();
			
	}//main

}//class
