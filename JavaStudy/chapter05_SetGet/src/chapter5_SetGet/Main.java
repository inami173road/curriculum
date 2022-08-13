package chapter5_SetGet;

public class Main {
	public static void main(String[] args) {
		Sample a = new Sample();
		a.setName("A");
		a.getName();
		
		// setNameにセットされた引数はgetNameにて自動的に取得される。
		System.out.println(a.getName());
	}
}