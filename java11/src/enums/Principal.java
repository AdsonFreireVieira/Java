package enums;

public class Principal {

	public static void main(String[] args) {
		Season s = Season.SUMMER;

		// System.out.println(Season.SUMMER);

		// System.out.println(s == Season.SUMMER);

		for (Season season : Season.values()) {

			// System.out.println(season.name() + " "+ season.ordinal());

			// System.out.println(season.valueOf("SUMMER"));
		}

		Season summer = Season.SUMMER;

		switch (summer) {
		case WINTER: {

			System.out.println("Winter");
			break;
		}
		case SUMMER: {
			System.out.println("Summer is");
			break;
		}

		default:
			System.out.println("ERRO");
		}

		switch (summer) {

		}

		System.out.println("begin");

		OnlyONE firstCall = OnlyONE.ONCE;

		OnlyONE secondCall = OnlyONE.ONCE;

		System.out.println("End");

	}
}
