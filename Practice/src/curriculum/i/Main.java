package curriculum.i;

// インポート文
import java.util.ArrayList; // 配列を使ったリスト（クラス）
import java.util.List; // リストという概念（インターフェイス）

public class Main {
	public static void main(String[] args) {
		// 社員リスト(List<Employee>)を作成
		List<Employee> employeeList = new ArrayList<>();
		
		// リストに各社員を追加
		employeeList.add(new FullTimeEmployee("F001", "田中"));
		employeeList.add(new ContractEmployee("C001", "鈴木"));
		employeeList.add(new FullTimeEmployee("F002", "佐藤"));
		employeeList.add(new ContractEmployee("F002","高橋"));
		
		// for-eachループで各社員の給料を出力
		// 共通のEmployee型で実装
		for (Employee emp : employeeList) {
			int hours = 9;
			int wage = emp.calculateDailyWage(hours);
			
			System.out.println(emp.name + "さんの給料：" + wage + "円");
		}

	}

}
