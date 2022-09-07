
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="may";
		int year=2022;
		switch(month)
		{
		case "jan","march","may","july","aug","oct","dec"->System.out.println("31 days in this month");
		case "april","june","sep","nov"->System.out.println("30 day in this month");
		case "feb"-> 
		{
			if(year%4==0)
				System.out.println("29 days and leap year");
			else
				System.out.println("28 days not leap year");
				
		}
		default ->System.out.println("envalid month");
		
		}
	}

}
