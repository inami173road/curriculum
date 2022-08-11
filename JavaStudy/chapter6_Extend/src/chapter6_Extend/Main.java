package chapter6_Extend;

public class Main {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		System.out.println(a1.a);
		System.out.println(b1.a);
		System.out.println(c1.a);
		
//		Aクラス、Bクラス、Cクラスの共通部分をスーパークラスで抜き出すことで修正しやすくなる。
	}
}
