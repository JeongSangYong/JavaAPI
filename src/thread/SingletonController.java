package thread;

public class SingletonController {
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstacne();
		Singleton singleton2 = Singleton.getInstacne();
		
		Sample sample = new Sample();
		Sample sample2 = new Sample();
		if (singleton == singleton2) {
			System.out.println("싱글톤 같다.");
		} else {
			System.out.println("싱글톤 다르다.");
		}
		if (sample == sample2) {
			System.out.println("샘플 객체같다.");
		} else {
			System.out.println("샘플 객체다르다.");
		}
	}
}
