package check;
import constants.Constants;

public class Check {
	private static String firstName = "伊波";
	private static String lastName = "涼治";
	
	private static void printName(String f,String l) {
		System.out.println("printNameメソッド →" + f + l); 
	}
	
	public static void main(String[] args) {
		printName(firstName ,lastName);
		
		// 他のパッケージで定義した定数はインポートすれば引数として扱える。
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE );
		RobotPet rob = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		pet.introduce();
		rob.introduce();

		
	}

}
