package kadai_028;

import java.util.ArrayList;
import java.util.HashMap;

public class Jyanken_Chapter28 {
	//じゃんけんの手を配列に格納
	HashMap<String, String> choices = new HashMap<>();

	//コンストラクタで初期化
	public Jyanken_Chapter28() {
		choices.put("p", "パー");
		choices.put("r", "グー");
		choices.put("s", "チョキ");
	}

	//メソッド（自分のじゃんけんの手を入力する）
	public String getMyChoice(String choice) {
		
		
	}

	//入力した手が配列にあるか判定
	//for文を使って要素を順番に取り出す
	for(

	int i = 0;i<choices.size();i++)
	{

		//入力した手が配列にある場合
		if (choices.get(i) == choice) {
			System.out.println(choices.get(i));

			//正しいじゃんけんの手でない場合
		} else {
			System.out.println("入力エラー");
		}
	}return(choice);
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(long num) {
		 num = Math.round(Math.random() * 3);
		//for文を使って要素を順番に取り出す
		for (int i = 0; i < choices.size(); i++) {
			//乱数と一致した要素を取り出す
			if (choices.get(i) == num) {
				System.out.println(choices.get(i));
		}

		return (num);
	}

}
