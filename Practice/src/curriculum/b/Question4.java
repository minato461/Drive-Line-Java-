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
		
		
		// Q7
		System.out.println("~Q7~");
		// 2次元配列を用意
		int[][] array7 = {
				{1, 2},
				{3, 4},
				{5, 6}
		};

		// 全て表示(外側と内側で二重ループを使用)
		for (int i = 0; i < array7.length; i++) {
			for (int j = 0; j < array7[i].length; j++) {
				System.out.print(array7[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// Q8
		System.out.println("~Q8~");
		// 2次元配列を用意
		int[][] array8 = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		// 合計表示
		int tt = 0;
		
		for (int i = 0; i < array8.length; i++) {
			for (int j =0; j < array8.length; j++) {
				tt += array8[i][j];
			}
		}
		System.out.println("合計：" + tt);
		
		
		// Q9
		System.out.println("~Q9~");
		// 2次元配列を用意
		int[][] array9 = {
				{12, 15, 8},
				{6, 19, 25},
				{30, 2, 10}
		};
		// 最大値と最小値の表示
		int maxA = array9[0][0];
		int minA = array9[0][0];
		
		for (int i = 0; i < array9.length; i++) {
			for (int j =0; j < array9.length; j++) {
				if(array9[i][j] > maxA) {
					maxA = array9[i][j];
				}
				if(array9[i][j] < minA) {
					minA = array9[i][j];
				}
			}
		}
		System.out.println("最大値：" + maxA);
		System.out.println("最小値：" + minA);
		
		
		// Q10
		System.out.println("~Q10~");
		// 3次元配列を用意
		int[][][] array10 = {
				{ // 1枚目の板のイメージ
					{1, 2},
					{3, 4}
				},
				{ // 2枚目の板のイメージ
					{5, 6},
					{7, 8}
				}
			};
		
		// 全てを表示(3つのfor文)
		for (int[][] area : array10) {      
			// 3次元から2次元(area)を取り出す
			for (int[] row : area) {        
				// 2次元から1次元(row)を取り出す
				for (int value : row) {     
					// 1次元から数値(value)を取り出す
					System.out.print(value + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
