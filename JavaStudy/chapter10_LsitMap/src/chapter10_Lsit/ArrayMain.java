package chapter10_Lsit;
//utilパッケージのArrayListクラスをimport
import java.util.ArrayList;
//utilパッケージのListクラスをimport
import java.util.List;

public class ArrayMain {

  public static void main(String args[]) {
      // LinkedListを使用する場合は以下のように書きます
      // List<String> sampleList = new LinkedList<String>(); 
      
	  // 単純に「動的にサイズが拡張される配列」としてコレクションを使用したい ArrayListクラス
	  // 要素数が多くて、且つ要素の挿入・削除を頻繁に行うことが予想 LinkedListクラス
	  
      // パターン1
      List<String> sampleList = new ArrayList<String>();
      sampleList.add("ABC");
      sampleList.add("DEF");

      // パターン2
      sampleList = new ArrayList<String>() {
          {
              add("ABC");
              add("DEF");
          }
      };

      // リストに格納した全要素を順番に出力
      for (int i = 0; i < sampleList.size(); i++) {
          System.out.println(sampleList.get(i)); //値を取り出すときは、 getメソッド を使用。
      }
  }
}