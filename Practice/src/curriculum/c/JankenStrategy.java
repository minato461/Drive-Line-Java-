package curriculum.c;

public interface JankenStrategy {
	// ジャンケンの定数化：グー(0)、チョキ(1)、パー(2)
	public static final int ROCK = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;
	
	// 手を決定して返すための抽象メゾッド
	int showHand();

}
