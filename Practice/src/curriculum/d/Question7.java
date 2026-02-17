package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// プレイヤーの作成
		System.out.println("プレイヤーの名前を入力してください：");
		String playerName = sc.nextLine();
		Player player = new Player(playerName);
		
		// 敵の作成
		Daemon daemon = loadDaemon("src/curriculum/d/daemon_status.txt");
		
		if (daemon == null) {
			System.out.println("敵のデータの読み込みに失敗認め終了します");
			return;
		}
		
		// ステータス表示
		System.out.println("--- バトル開始 ---");
		System.out.println(player.getName() + "のHP：" + player.getHp());
		System.out.println(daemon.getName() + "のHP：" + daemon.getHp());
		
		// バトル実行
		Character first, second;
		if(player.sp > daemon.sp) {
			first = player; second = daemon;
		}else if(daemon.sp > player.sp) {
			first = daemon; second = player;
		}else {
			if(new Random().nextBoolean()) {
				first = player; second = daemon;
			}else {
				first = daemon; second = player;
			}
		}
		
		System.out.println(first.getName() + "の先行です！");
		
		// どちらかのHPが0になるまで無限ループ
		while (player.isAlive() && daemon.isAlive()) {
			first.attack(second);
			// 二番手が倒れたら終了
			if (!second.isAlive()) break;
			
			second.attack(first);
		}
		String winner = player.isAlive() ? player.getName() : daemon.getName();
		System.out.println(winner + "の勝利");
	}
		
	// メゾッド(loadDaemon)：staticをつけてMainから呼び出せるようにする
	public static Daemon loadDaemon(String filePath) {
		// try-with-resource文：使い終わったら自動でファイルを閉じてくれる
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());
			
			return new Daemon(name, hp, at, sp);
		}catch (Exception e) {
			System.out.println("読み込みエラー: " + e.getMessage());
			return null;
		}
	}
	
	// ログ出力
	public static void saveLog(String winnerName) {
		try (PrintWriter pw = new PrintWriter(new FileWriter("battle_log.txt", true))) {
			pw.println("バトルの結果: " + winnerName + " が勝利しました");
		} catch (Exception e) {
			System.out.println();
		}
	}

}

