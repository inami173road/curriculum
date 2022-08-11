package cat;

public class Main {
	public static void main(String[] args) {
		// こちらで3歳と設定していますが、、、
		Cat pepe = new Cat("ぺぺ", 3);  
		pepe.agePlus();
		// ↓ageはカプセル化されてないために,このように不正な代入が行われる可能性がある！
		pepe.age = 0;    
		// ↓catクラスでprivateとされているので代入はできない。（これで不正なアクセスを防げる）
		pepe.name = "タマ";
		pepe.showName();
		pepe.showAge();
	}
}
