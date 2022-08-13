package chapter10_Map;
import java.util.HashMap;
import java.util.Map;
 
public class HashMapAddition {

    public static void main(String[] args) {

        // パターン1
    	
        Map<String, String> sampleHashMap = new HashMap<String, String>();
        //  Mapは putメソッドで追加
        //  putメソッドには引数を２つ指定。
        //  第１引数がキー、第２引数がキーに紐づく値
        sampleHashMap.put("apple", "りんご"); 
        sampleHashMap.put("orange", "みかん");
        sampleHashMap.put("peach", "もも");

        // パターン2
        sampleHashMap = new HashMap<String, String>() {
            {
                put("apple", "りんご");
                put("orange", "みかん");
                put("peach", "もも");
            }
        };
        
        
        // キー値を指定して取得
        System.out.println(sampleHashMap.get("apple"));
        System.out.println(sampleHashMap.get("orange"));
        System.out.println(sampleHashMap.get("peach"));
        System.out.println(sampleHashMap.get("mango"));//存在しない引数には null を返す。 
    }
}
