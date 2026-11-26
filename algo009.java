import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class algo009{
    public static void main(String[] args){
        
        //初期処理
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int judge = 5 * n; //審査員は5N人
        List<Integer> scores = new ArrayList<>(judge); 

        //点数をリストに入れる
        for (int i = 0; i < judge; i++){
            scores.add(sc.nextInt());
        }

        //昇順にソート
        Collections.sort(scores);

        //N回ループで最大要素を取り除く
        for (int i = 0; i < n; i++){
            scores.remove(scores.size() - 1);
        }
        //N回ループで最小要素を取り除く
        for (int i = 0; i < n; i++){
            scores.remove(0);
        }

        //残った要素から平均点を求める
        int sum = 0;
        for (int score : scores){
            sum += score;
        }

        double average = (double) sum / (3.0 * n);
        System.out.printf("%.15f\n",average);
    }
}