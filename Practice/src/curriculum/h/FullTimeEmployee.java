package curriculum.h;

// Employeeを継承(extends)する
public class FullTimeEmployee extends Employee {
	// 定数の設定
	private static final int HOURLY_RATE = 1200;
	
	// コンストラクタの設定：親(super)クラスから呼び出す
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	// 親の抽象メゾッドを具体化する（オーバーライド）
	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		}else {
			int basicWage = 8 * HOURLY_RATE;
			int overtimeHours = hoursWorked - 8;
			int overtimeWage = (int)(overtimeHours * HOURLY_RATE * 1.25);
			
			return basicWage + overtimeWage;
		}
	}

}
