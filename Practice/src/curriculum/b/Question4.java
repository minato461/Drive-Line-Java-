 package curriculum.b;

//コンソール入力対応のため(Scannerを使用するため)
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// Q1
		System.out.println("~Q1~");
		// 配列の宣言、生成、値の格納
		int[] num1 = {1, 2, 3, 4, 5};
		// 配列の要素を順番に表示
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		// Q2
		System.out.println("~Q2~");
		// 配列の宣言、生成、値の格納
		int[] num2 = {10, 20, 30, 40, 50};
		// 配列の要素を逆順に表示
		for (int i = num2.length -1; i >= 0 ; i--) {
			System.out.println(num2[i]);
		}
		
		// Q3
		System.out.println("~Q3~");
		// 配列の宣言、生成、値の格納
		int[] num3 = {3, 5, 7, 9, 11};
		// 配列の全要素の合計値を計算
		int total = 0;
		for (int i : num3) {
			total += i;
		}
		System.out.println("合計：" + total); 
		
		// Q4
		System.out.println("~Q4~");
		// 配列の宣言、生成、値の格納
		int[] num4 = {12, 7, 9, 21, 5, 18};
		// 配列の最大値と最小値を求める
		int max = num4[0];
		int min = num4[0];
		
		for (int i = 0; i < num4.length; i++) {
			if(num4[i] > max) {
				max = num4[i];
			}
			if(num4[i] < min) {
				min = num4[i];
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		
		// Q5
		System.out.println("~Q5~");
		// 配列の宣言、生成、値の格納
		int[] num5 = {1, 2, 3, 4, 5};
		// 配列の全ての要素を2倍
		for (int i = 0; i < num5.length; i++) {
			num5[i] = num5[i] * 2;
		}
		for (int num : num5) {
			System.out.println(num);
		}
		
		// Q6
		System.out.println("~Q6~");
		Scanner scanner = new Scanner(System.in);
		// 配列の宣言、生成、値の格納
		int[] num6 = {4, 7, 10, 15, 20};
		
		// ユーザー入力
		System.out.println("数値を入力してください：");
		int target = scanner.nextInt();
		
		// 見つかったかどうかを記録
		boolean isFound = false;
		
		// 配列の確認
		for (int num : num6) {
			if (num == target) {
				isFound = true;
				break;
			}
		}
		
		// 入力した数が配列に含まれているかを判定
		if (isFound) {
			System.out.println(target + "は配列に含まれています");
		}else {
			System.out.println(target + "は配列に含まれていません");
		}
		
		scanner.close();
		
		// Q7〜10までやったら削除

	}

}
