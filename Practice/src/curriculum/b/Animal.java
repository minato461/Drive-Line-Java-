package curriculum.b;

public class Animal {
	// privateでフィールド
	/* 動物名(name)：ライオン
	 * 体長(length)：2.1m
	 * 速度(speed)：80km/h */
	private String name;
	private double length;
	private int speed;
	
	// 動物名
	// 外からデータを入れるための窓口（setter）
	public void setName(String name) {
		this.name = name;
	}
	
	// 外にデータを渡すための窓口（getter）
	public String getName() {
		return name;
	}
	
	// 体長
	// 外からデータを入れるための窓口（setter）
	public void setLength(double length) {
		this.length = length;
	}
	
	// 外にデータを渡すための窓口（getter）
	public double getLength() {
		return length;
	}
	
	// 速度
	// 外からデータを入れるための窓口（setter）
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 外にデータを渡すための窓口（getter）
	public int getSpeed() {
		return speed;
	}
	
	
	
}
