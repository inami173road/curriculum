package chspter10_Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Curriculum {

	public static void main(String[] args) {

		HashSet<String> sampleSet1 = new HashSet<String>();
		//適当に値を入れていく
		//適当だが、一度決めた並びはそのまま。
		//表示されるたびにランダム出力するのではなく、配置の仕方がランダム
		sampleSet1.add("AAA");
		sampleSet1.add("BA");
		sampleSet1.add("ABC");
		sampleSet1.add("ABCDE");
		sampleSet1.add("CD");
		sampleSet1.add("gで");
		System.out.println("HashSetなのでランダムで表示される");
		for (String s1 : sampleSet1) {
			System.out.println(s1);
		}
		System.out.println();

		// 数値を扱いたならば、Integer型にする。
		TreeSet<Integer> sampleSet2 = new TreeSet<Integer>();
		//適当に値を入れていく
		sampleSet2.add(5);
		sampleSet2.add(3);
		sampleSet2.add(8);
		sampleSet2.add(4);
		System.out.println("TreeSetを使っているので、昇降順に表示される");
		for (Integer s2 : sampleSet2) {
			System.out.println(s2);
		}
		System.out.println();
		
		
		LinkedHashSet<String> sampleSet3 = new LinkedHashSet<String>();
		sampleSet3.add("ABCD");
		sampleSet3.add("ABCDEFGHIJK");
		sampleSet3.add("ABCDE");
		sampleSet3.add("ABCDEFGHIJ");
		System.out.println("LinkedHashSetなので追加した順に表示");
		for (String s3 : sampleSet3) {
			System.out.println(s3);
		}
		System.out.println();

		TreeSet<String> sampleSet4 = new TreeSet<String>();
		//適当に値を入れていく
		sampleSet4.add("A");
		sampleSet4.add("D");
		sampleSet4.add("D");
		sampleSet4.add("D");
		sampleSet4.add("B");
		sampleSet4.add("C");
		System.out.println("同じ値は格納できないから「D」は一つとして考えるよ");
		for (String s4 : sampleSet4) {
			System.out.println(s4);
		}
		// ちなみに単に要素数だけ回したい場合は拡張For文の方がミスが少なく簡潔に記述できる。
		// しかしインデックスの指定ができないので何か条件がある場合はFor文が適当。
		
	}
}