package chapter2_Constructor;

public class MainEmployee {

	public static void main(String[] args) {
		// 呼び出し（new した後で、引数へ与えられた値を元に EmployeeBean が生成されます）
		EmployeeBean employeeBean = new EmployeeBean("00000", "技術部", "コンストラクタ", "XXX-XXXX-XXXX", "java@ぶるー");

		// 使用時
		System.out.println(employeeBean.getName());
	}
}
