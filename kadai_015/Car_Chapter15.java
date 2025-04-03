package kadai_015;

public class Car_Chapter15 {

	// フィールド
	private int gear = 1; //1足～速のギア
	private int speed = 10; //ギアチェンジ後の速度

	//メソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;

		//ギアの値により速度を変える
		switch (afterGear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;

		}

	}

	public void run() {

		// ギアチェンジ後の速度を表示する

		System.out.println("速度は時速" + speed + "kmです");

	}

}
