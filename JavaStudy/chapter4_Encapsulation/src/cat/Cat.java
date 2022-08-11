package cat;

public class Cat {
	private String name;
    public int age;
 
    // コンストラクタ
    public Cat(String n, int a) {
        this.name = n;
        this.age = a;
    }
 
    public void showName() {
        System.out.println("名前は、" + this.name + "です。");
    }
 
    public void showAge() {
        System.out.println("年齢は、" + this.age + "才です。");
    }
 
    public void agePlus() {
        age++;
    }
}
