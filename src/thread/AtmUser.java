package thread;

import org.omg.Messaging.SyncScopeHelper;

public class AtmUser implements Runnable{
	//필드에 사용자타입의 클래스가 있고, 아래 멤버메소드 영역에 있는 메소드가
	//파라미터로 이 클래스 타입의 변수를 받을 경우 이를 의존관계라 하며 
	//AtmUser가 Atm을 사용한다라고 표현
	
	//객체지향에서는 클래스들 끼리 관계를 맺어서 사용방법을 정의한다.
	//관계는 상속, 구현, 의존, 연관등이 존재한다.
	//상속은 IsA
	//의존을 use관계라고 한다.
	Atm atm;
	String name;
	
	public AtmUser(Atm atm, String name) {
		this.atm = atm;
		this.name = name;
	}
	@Override
	public void run() {
		// 쓰레드에서 동기화를 사용할 경우
		// get/set을 사용하지 않고
		// 무조건 run()사용
		atm.inchul(name);
	}
	
}
