package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//HashMapの宣言
	HashMap<String, String> wordsMap = new HashMap<String, String>();

	//単語の追加メソッド
	public void addData(String en, String jp) {
		wordsMap.put(en, jp);

	}

	//辞書検索のﾒｿｯﾄﾞ
	public void getData(String en) {

		//keyset()を使ってキーのみ取り出し繰り返す
		//for (String key : wordsMap.keySet()) {

		//指定したキーが存在するか確認
		if (wordsMap.containsKey(en)) {

			//キーから値だけを取得
			String value = wordsMap.get(en);
			System.out.println(en + "の意味は" + value);

		} else {
			System.out.println(en + "は辞書に存在しません");
		}

		//}

	}

}
