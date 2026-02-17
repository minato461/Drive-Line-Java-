package curriculum.c;

import java.util.Random;
public class RandomCPU extends Participant {
	// 親クラスのコンストラクタを呼び出す
	public RandomCPU(String name) {
		super(name);
	}
	
	@Override
	public int showHand() {
		// ランダムな整数の準備
		Random random = new Random();
		int hand = random.nextInt(3);
		this.setHand(hand);
		return hand;
	}

}
