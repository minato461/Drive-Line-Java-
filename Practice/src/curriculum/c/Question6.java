package curriculum.c;

import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// Scannerの準備
		Scanner sc = new Scanner(System.in);
		
		// 対戦相手を作る
		HumanPlayer player = new HumanPlayer("プレイヤー", sc);
		RandomCPU cpu = new RandomCPU("CPU");
		
		// 数字を名前に変える配列
		String[] hands = {"グー", "チョキ", "パー"};
		
		// 勝つまで繰り返し処理
		boolean isWin = false;
		System.out.println("じゃんけんゲームを始めます");
		while (!isWin) {
			// 2人の手を表示
			int playerHand = player.showHand();
			int cpuHand = cpu.showHand();
			
			// 互いの手を表示
			System.out.println("あなた：" + hands[playerHand]);
			System.out.println("相手：" + hands[cpuHand]);
			
			// 判定（勝った時だけisWin=ture）
			if (playerHand == cpuHand) {
				System.out.println("あいこです！");
			}else if ((playerHand == 0 && cpuHand == 1) || 
					(playerHand == 1 && cpuHand == 2) || 
					(playerHand == 2 && cpuHand == 0)) {
				System.out.println("あなたの勝ち！");
				isWin = true;
			}else {
				System.out.println("あなたの負け！");
			}
			System.out.println();
		}
		sc.close();
	}

}
