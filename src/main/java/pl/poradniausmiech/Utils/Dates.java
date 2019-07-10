package pl.poradniausmiech.Utils;

import java.sql.Timestamp;
import java.util.Date;

public class Dates {

    public static String currentDate () {

        return "a";
    }

    public static Timestamp getCurrentDateForDbModifications ()
    {
        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        return ts;
    }
}
