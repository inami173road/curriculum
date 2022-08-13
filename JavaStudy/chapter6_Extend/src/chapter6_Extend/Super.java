package chapter6_Extend;

public class Super {
//	String a = "hello";
	protected String a;
	protected String b;
	protected String c;
	
	public Super() {
		this.a="a";
		this.b="b";
		this.c="c";
		System.out.println("Superクラスのコンストラクタだお");
		System.out.println( a + b + c);
	}
}