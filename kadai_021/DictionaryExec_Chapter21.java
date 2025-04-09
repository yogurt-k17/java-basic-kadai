package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//辞書クラスのインスタンスを作成
		Dictionary_Chapter21 Dic = new Dictionary_Chapter21();

		//英単語の追加
		Dic.addData("apple", "りんご");
		Dic.addData("peach", "桃");
		Dic.addData("banana", "バナナ");
		Dic.addData("lemon", "レモン");
		Dic.addData("pear", "梨");
		Dic.addData("kiwi", "キウイ");
		Dic.addData("strawberry", "いちご");
		Dic.addData("grape", "ぶどう");
		Dic.addData("muscat", "マスカット");
		Dic.addData("cherry", "さくらんぼ");

		//英単語の呼び出し
		Dic.getData("apple");
		Dic.getData("banana");
		Dic.getData("grape");
		Dic.getData("orange");
	}
}