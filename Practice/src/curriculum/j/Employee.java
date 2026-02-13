package curriculum.j;

// インターフェイスの実装
public abstract class Employee implements Billable {
	private String id;
	private String name;
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	// Billableのメゾッドをここでは実装せず、サブクラスにオーバーライド
	@Override
	public abstract int costForDay(int hoursWorked);

}
