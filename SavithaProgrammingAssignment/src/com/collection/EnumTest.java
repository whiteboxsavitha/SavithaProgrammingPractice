package com.collection;
public class EnumTest
{
public enum Months {
		JANUARY(1),
		FEBRUARY(2),
	     MARCH(3),
	     APRIL(4),
	     MAY(5),
	     JUNE(6),
	     JULY(7),
	     AUGUST(8),
	     SEPTEMBER(9),
	     OCTOBER(10),
	     NOVEMBER(11),
	     DECEMEBER(12);
		private int value;
		private Months(int value)
		{
			this.value = value;
		}
}

public static void main(String[] args) {
	for (Months m: Months.values())
	{
		System.out.println("The Months : " +  m  + " The value : " + m.value);
	}
}
/*	
public void displaymonths()
{
	switch(m){
	case 	JANUARY:
		System.out.println("the Month is Janurary" );
		break;
	case	FEBRUARY:
		System.out.println("the Month is feb" );
		break;

	case 	MARCH:
		System.out.println("the Month is march" );
		break;

	case	APRIL:
		System.out.println("the Month is april" );
		break;
	case	MAY:
		System.out.println("the Month is may" );
		break;
	case	JUNE:
		System.out.println("the Month is June" );
		break;
	case	JULY:
		System.out.println("the Month is July" );
		break;
	case	AUGUST:
		System.out.println("the Month is Aug" );
		break;
	case	SEPTEMBER:
		System.out.println("the Month is Sep" );
		break;
	case	OCTOBER:
		System.out.println("the Month is Oct" );
		break;
	case	NOVEMBER:
		System.out.println("the Month is novy" );
		break;
	case	DECEMEBER:
		System.out.println("the Month is dec" );
		break;
	default:
		System.out.println("nothing Choose");
	}
}
public static void main(String[] args) {
EnumTest jan = new EnumTest(Months.JANUARY);
	jan.displaymonths();
	EnumTest feb = new EnumTest(Months.FEBRUARY);
	feb.displaymonths();
	EnumTest mar = new EnumTest(Months.MARCH);
	mar.displaymonths();
	EnumTest apr = new EnumTest(Months.APRIL);
	apr.displaymonths();
	EnumTest may = new EnumTest(Months.MAY);
	may.displaymonths();
	EnumTest june = new EnumTest(Months.JUNE);
	june.displaymonths();
	EnumTest  jul= new EnumTest(Months.JULY);
	jul.displaymonths();
	EnumTest aug = new EnumTest(Months.AUGUST);
	aug.displaymonths();
	EnumTest sep = new EnumTest(Months.SEPTEMBER);
	sep.displaymonths();
	EnumTest oct = new EnumTest(Months.OCTOBER);
	oct.displaymonths();
	EnumTest nov= new EnumTest(Months.NOVEMBER);
	nov.displaymonths();
	EnumTest dec = new EnumTest(Months.DECEMEBER);
	dec.displaymonths();
*/




}






