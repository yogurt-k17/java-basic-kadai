package kadai_018;

abstract class Kato_Chapter18 {
	//フィールドの宣言
	public String familyName = "加藤";;
	public String givenName;
	public String address = "東京都中野区〇×";

	//メソッド
	public void commonIntroduce() {

		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");

	}

	public abstract void eachIntroduce();

	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();

	}

}
