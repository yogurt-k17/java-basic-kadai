package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//じゃんけんの手を配列（map）に格納
	HashMap<String, String> hands = new HashMap<>();

	//コンストラクタで初期化
	public Jyanken_Chapter28() {
		hands.put("p", "パー");
		hands.put("r", "グー");
		hands.put("s", "チョキ");
	}

	//メソッド（自分のじゃんけんの手を入力する）
	public String getMyChoice() {

		//scannerオブジェクトの生成
		Scanner scanner = new Scanner(System.in);
		//入力した内容を取得
		String input = scanner.next();
		//		scanner.close();

		//入力した手が配列にあるか判定
		//拡張for文で要素を全て取り出す
		for (Map.Entry<String, String> entry : hands.entrySet()) {
			//配列のキーと入力したキーが等しくないかの判定
			if (!entry.getKey().equals(input)) {

			} else {
				//等しければ値を取得して返す
				input = entry.getValue();
				return input;
			}
		}
		//等しくない場合、入力に戻る
		System.out.println("入力エラー");
		return getMyChoice();

	}

	//メソッド（対戦相手のじゃんけんの手を乱数で選ぶ）
	public String getRandom() {
		//じゃんけんの手を配列に格納
		String[] opponentChoice = { "p", "r", "s" };
		//インデックスを乱数で生成
		int index = (int) (Math.random() * 3); //(int)longからintのキャスト
		//拡張for文で要素を全て取り出す
		for (Map.Entry<String, String> entry : hands.entrySet()) {
			//配列のキーと生成したインデックスが等しいか判定
			if (entry.getKey().equals(opponentChoice[index])) {
				//等しければ値を取得	
				opponentChoice[index] = entry.getValue();
			}
		}
		return opponentChoice[index];

	}

	//メソッド（じゃんけんを行う）
	public void playGame() {
		String myChoice = getMyChoice();
		String opponent = getRandom();

		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + opponent);

		if (myChoice.equals(opponent)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("グー") && opponent.equals("チョキ")) ||
				(myChoice.equals("チョキ") && opponent.equals("パー")) ||
				(myChoice.equals("パー") && opponent.equals("グー"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}

	}
}
