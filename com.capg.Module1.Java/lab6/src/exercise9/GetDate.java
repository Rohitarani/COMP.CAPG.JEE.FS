package exercise9;
import java.time.*;
public class GetDate 
{
	static int getCalendar()
	{
		LocalDate pdate = LocalDate.of(2018, 07, 01);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pdate, now);
        System.out.printf("\n %d years, %d months and %d days \n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
	return 0;
		
	}
}

