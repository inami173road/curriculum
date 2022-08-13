package chapter3_Method;

public class Study {
	/**
     * 三角形の面積を求めて出力するメソッド
     * 
     * @param  param 底辺
     * @param  height 高さ
     */
    public void printTriangleArea(int param, int height) {
        int area = param * height / 2;
        System.out.println(area);
    }
}
