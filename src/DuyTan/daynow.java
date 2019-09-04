package DuyTan;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class daynow {

    public static void main(String[] args) {

/*
        Date date = new Date();
        System.out.printf("%s %tB %<te, %<tY",
                "Date la:", date);

 */

        LocalDate DateNow = LocalDate.of(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
        LocalDate Datesd = LocalDate.of(2019, 4, 9);
        Period ngayTB = Period.between(DateNow, Datesd);

        System.out.printf("su chenh lech\n" + ngayTB.getYears() + "\n" +
                ngayTB.getMonths() + "\n" + ngayTB.getDays());
    }


}
