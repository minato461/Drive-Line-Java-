package curriculum.c;

import java.util.Scanner;
public class HumanPlayer extends Participant{
	// 親クラスのコンストラクタを呼び出す
	public HumanPlayer(String name) {
		super(name);
	}
	
	@Override
	public int showHand() {
		// Scannerの準備
		Scanner sc = new Scanner(System.in);
		
		System.out.print("じゃんけんポン！ [グー(0), チョキ(1), パー(2) を入力]");
		
		int hand = sc.nextInt();
		this.setHand(hand);
		return hand;
	}

}
