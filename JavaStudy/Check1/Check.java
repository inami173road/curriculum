/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int data[]={3,1,2,7,5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        // 最初に定義した配列を表示
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        // 最初のfor文は要素の数だけ回す。
        for (int i = 0; i < data.length; i++) {
            // ２回目のfor文は並び替える回数だけ回す。
            for (int j = data.length-1; j > i ;j--) {

                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                // 以下のif文で並び替えを実行
                // 最初のfor文の i が加算されることで、比較する要素が右にずれる。
                if(data[i] > data[i+1]){

                    // 変数boxに一時的に格納
                    int box = data[i+1];

                    // 以下の変数の上書きすることでで添字を入れ変える
                    data[i+1] = data[i];
                    data[i] = box;
                }
            }
        }
        // 並び替えた配列を表示
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
