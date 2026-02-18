package curriculum.d;

public abstract class Character {
	private String name;
	private int hp;
	private int at;
	private int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	// カプセル化による新しいメゾッド
	public void receiveDamage(int damage) {
		this.hp -= damage;
		if(this.hp < 0) {
			this.hp = 0;
		}
		System.out.println(this.name + "に" + damage + "のダメージ！");
	    System.out.println(this.name + "のHP：" + this.hp);
	}
	
	// 攻撃メゾッド
	public void attack(Character opponent) {
		System.out.println(this.name + "の攻撃！");
		// 新しいメゾッドを呼び出す
		opponent.receiveDamage(this.at);
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
	public int getAt() {
		return at;
	}
	public int getSp() {
		return sp;
	}

}
