package thread;

public class Singleton {

	//필드
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton(){//싱글톤에서는 생성자를 private으로 은닉화 시킨다.
		System.out.println("인스턴스 생성");
	}
	
	//멤버메소드
	public static Singleton getInstacne(){
		//Singleton singleton = null;
		//지역변수 선언안하고 필드에 있는 인스턴스 변수를 가르킴
		return singleton;
	}
}
