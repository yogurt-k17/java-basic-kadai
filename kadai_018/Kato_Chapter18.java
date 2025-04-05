package kadai_018;

abstract class Kato_Chapter18 {
	//フィールドの宣言
	public String familyName;
	public String givenName;
	public String address;

	//メソッド
	public void commonIntroduce() {

		this.familyName = "加藤";
		System.out.println("名前は" + familyName + givenName + "です");

	}

	public abstract void eachIntroduce();

	public void execIntroduce() {

	}

}
