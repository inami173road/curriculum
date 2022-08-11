/**
 * Main.java
 *
 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   User.java: 問①
 *   Main.java: 問①から問②
 * 指定された値と変数名を守って記述してください。
 *
 */

package study;

public class Main {
 
    public static void main(String[] args) {
 
        // ① 以下のルールに従いUserクラスのインスタンスを生成してください。
        // 変数名:「user」
    	User user = new User("hoge", 123, "hoge123");
        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
    	user.printAccountInfo();
    	
    	//引数を渡してインスタンス化した時点でMainクラス内にコンストラクタへ変数が定義されている。
    	//printAccountInfoメソッドはコンストラクタを参照するメソッドなので、そのまま記述すれば出力される。
    }
}