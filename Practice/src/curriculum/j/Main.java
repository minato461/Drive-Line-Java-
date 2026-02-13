package curriculum.j;

//インポート文
import java.util.ArrayList; // 配列を使ったリスト（クラス）
import java.util.List; // リストという概念（インターフェイス）

public class Main {
	public static void main(String[] args) {
		// 社員リスト(List<Billable>)を作成
		List<Billable> billableList = new ArrayList<>();
		
		// リストに各社員を追加
		billableList.add(new FullTimeEmployee("F001", "田中"));
		billableList.add(new ContractEmployee("C001", "鈴木"));
		
		// for-eachループで各社員の給料を出力
		// 共通のBillable型で実装
		for (Billable b : billableList) {
			int hours = 9;
			int cost = b.costForDay(hours);
			
			// Billable型をEmployee型に「キャスト」して名前を取得
			Employee emp = (Employee) b; 
			System.out.println(emp.getName() + "さんの日給：" + cost + "円");
		}

	}

}