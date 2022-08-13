package chapter3_Method;

public class Main {

	public static void main(String[] args) {
		// 底辺(base)と高さ(height)の変数を指定
        int base = 10;
        int height = 5;

        // Studyクラスのインスタンスを生成して、Studyクラス型の変数studyに保持する
        Study study = new Study();

        // 生成したインスタンスから、StudyクラスのprintTriangleAreaメソッドを呼び出す
        study.printTriangleArea(base, height);

    }
}
