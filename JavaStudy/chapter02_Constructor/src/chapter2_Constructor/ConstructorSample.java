package chapter2_Constructor;

public class ConstructorSample {
	String str = "Hoge Engineer";
	 
	    // コンストラクタ
			//コンストラクタ名は必ずクラス名と同一でなければならない。
	    public ConstructorSample() {  
	        System.out.println(str);
	    }
	    
	    //　引数ありのコンストラクタ
	    public ConstructorSample(String str) {        
	        System.out.println(str);
	    }
}
