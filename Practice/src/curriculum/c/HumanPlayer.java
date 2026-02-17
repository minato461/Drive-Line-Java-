package curriculum.c;

import java.util.Scanner;
public class HumanPlayer extends Participant{
	private Scanner sc;
	
	// 親クラスのコンストラクタを呼び出す
	public HumanPlayer(String name, Scanner sc) {
		super(name);
		this.sc = sc;
	}
	
	@Override
	public int showHand() {
		int hand;
		while (true) {
			System.out.print("じゃんけんポン！ [グー(0), チョキ(1), パー(2) を入力] ");
			hand = sc.nextInt();
			// 0, 1, 2 のいずれかであれば、ループを抜ける
			if (hand >= 0 && hand <= 2) {
				break; 
			}
			
			// 範囲外だった場合は、メッセージを出してループの最初に戻る
			System.out.println("0〜2の数字を入力してください");
			System.out.println();
		}
		
		this.setHand(hand);
		return hand;
	}

}
