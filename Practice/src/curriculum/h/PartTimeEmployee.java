package curriculum.h;

//Employeeを継承(extends)する
public class PartTimeEmployee extends Employee {
	// 定数の設定
	private static final int HOURLY_RATE = 1000;
	
	// コンストラクタの設定：親(super)クラスから呼び出す
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	// 親の抽象メゾッドを具体化する（オーバーライド）
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}

}
