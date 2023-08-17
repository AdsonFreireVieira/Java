package enums;

public class principal {

	public static void main(String[] args) {

		// MON,TUE,WED,THU,FRI,SAT,SUN;

		
		Day d = Day.MON;

		switch (d) {
		
		case MON: {
			System.out.println("Segunda");
			break;
		}
		case TUE: {
			System.out.println("Terça");
			break;
		}
		case WED: {
			System.out.println("Quarta");
		   break;
		}
		case THU: {
			System.out.println("Quinta");
		   break;
		}
		case FRI: {
			System.out.println("Sexta");
		   break;
		}
		default:
             System.out.println("Final de Semana");
             break;
		}

	}

}
