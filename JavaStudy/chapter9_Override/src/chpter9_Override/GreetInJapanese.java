package chpter9_Override;

//extends Greet で Greet クラスを継承
public class GreetInJapanese extends Greet {
	// スーパークラスのmorningメソッドをオーバライド（上書き）
	//同じメソッド名なら	
	public void morning() {
		System.out.println("おはようだお\nスーパクラスをオーバーライドしたお\nスーパクラスで書いたメソッドは上書きされた時点で全部クリアになるお\n");
	}
}