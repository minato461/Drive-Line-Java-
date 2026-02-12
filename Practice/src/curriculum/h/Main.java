package curriculum.h;

public class Main {
	public static void main(String[] args) {
		// 正社員オブジェクトの生成
		FullTimeEmployee ft = new FullTimeEmployee("E001", "佐藤太郎");
		
		// パート社員オブジェクトの生成
		PartTimeEmployee pt = new PartTimeEmployee("E002", "田中花子");
		
		// 給与を計算して出力
		System.out.println("正社員の給与: " + ft.calculateDailyWage(9) + " 円");
		System.out.println("パート社員の給与: " + pt.calculateDailyWage(9) + " 円");
	}
}
