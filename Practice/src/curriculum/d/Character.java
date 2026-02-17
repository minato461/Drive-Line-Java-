package curriculum.d;

public abstract class Character {
	protected String name;
	protected int hp;
	protected int at;
	protected int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	// 攻撃メゾッド
	public void attack(Character opponent) {
		System.out.println(this.name + "の攻撃！");
		opponent.hp -= this.at;
		System.out.println(opponent.name + "に" + this.at + "のダメージ！");
		
		// HP:0以下を0に調整
		if (opponent.hp < 0) {
			opponent.hp = 0;
		}
		System.out.println(opponent.name + "HP：" + opponent.hp);
		System.out.println("------");
	}
	
	// 生死判定
	public boolean isAlive() {
		return this.hp > 0;
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}

}
