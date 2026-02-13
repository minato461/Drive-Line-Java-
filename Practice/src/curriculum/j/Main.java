package curriculum.j;

//インポート文
import java.util.ArrayList; // 配列を使ったリスト（クラス）
import java.util.List; // リストという概念（インターフェイス）

public class Main {
	public static void main(String[] args) {
		// Employeeでインターフェイスの実装しているため
		// 社員リスト(List<Employee>)を作成
		List<Employee> employeeList = new ArrayList<>();
		
		// リストに各社員を追加
		employeeList.add(new FullTimeEmployee("F001", "田中"));
		employeeList.add(new ContractEmployee("C001", "鈴木"));
		
		// for-eachループで各社員の給料を出力
		// 共通のEmployee型で実装
		for (Employee emp : employeeList) {
			int hours = 9;
			int cost = emp.costForDay(hours);
			 
			System.out.println(emp.getName() + "さんの日給：" + cost + "円");
		}

	}

}