package manish.criti.practice;

public class ConverTime {
	static int hr, minute;
	private static int finalEquivalentTimeInMinutes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String time = "23:15";
		String time="2DBARCODE,Y";
		//time.split(",");
		int count = 0;

		for (String str : time.split(",")) {
			System.out.println(str);
			switch (count) {
			case 0:
				hr = Integer.parseInt(str);
				minute = hr * 60;
				count++;
				break;

			case 1:
				minute = minute + Integer.parseInt(str);
				finalEquivalentTimeInMinutes = minute;
				count++;
				break;

			default:
				break;
			}
			System.out.println(str);
			// System.out.println("day-->"+day+";month-->"+month+";year-->"+year);

		}

		System.out.println("total minutes for " + time + "is ---->"
				+ finalEquivalentTimeInMinutes);

	}

}
