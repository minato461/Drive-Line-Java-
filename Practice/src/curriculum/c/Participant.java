package curriculum.c;

public abstract class Participant implements JankenStrategy {
	private String name;
	private int hand;
	
	// コンストラクタ 
	public Participant(String name) {
		this.name = name;
	}
	
	// 名前、出した手を取得するメゾッド
	public String getName() {
		return name;
	}
	public int getHand() {
		return hand;
	}
	
	// 出した手をセットするメゾッド
	public void setHand(int hand) {
		this.hand = hand;
	}

}
