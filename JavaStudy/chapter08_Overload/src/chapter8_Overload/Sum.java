package chapter8_Overload;

//オーバーロード
//同じ名前のメソッドやコンストラクタだが、型の違う引数や型の数が違う引数を複数定義すること。
public class Sum {
	 
    public int plus(int a) {
        return a + 1;
    }
 
    public int plus(int a, int b) {
        return a + b;
    }
 
    public int plus(int a, int b, int c) {
        return a + b + c;
    }
}
