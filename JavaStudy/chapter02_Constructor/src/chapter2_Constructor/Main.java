package chapter2_Constructor;

public class Main {

	public static void main(String[] args) {
		// インスタンスの生成
			//コンストラクタはインスタンス生成時点で自動で呼び出される処理。
        	//メソッドは指定しないと呼ばれない。
        ConstructorSample cs = new ConstructorSample();
        
        
        // 引数ありのコンストラクタとなしのコンストラクタは併用は可能
        // 順番を入れ替えても問題はなし
        ConstructorSample css = new ConstructorSample("Hoge System Engineer ");

	}

}
