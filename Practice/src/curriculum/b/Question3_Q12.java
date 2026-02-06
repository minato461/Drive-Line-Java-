package curriculum.b;

public class Question3_Q12 {

	public static void main(String[] args) {
		// 商品一覧の定義
		String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		// 1単語ずつに分割
		String[] name = input.split("、");
		
		// ランダムな整数の準備
		java.util.Random rand = new java.util.Random();
		
		// 拡張for文
		for (String str: name){
			int num = rand.nextInt(12);
			switch (str) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(str + "の残り台数は " + num + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(str + "の残り台数は " + (str.equals("テレビ") ? num : 11-num) + "台です");
				break;
			default:
				System.out.println("『" + str + "』" + "は指定の商品ではありません");
				break;
			}
		}

	}

}
