package no.rachelmh.leapYear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        {
            // If a year is multiple of 400, then it is a leap year
            if (year % 400 == 0)
                return true;

            // Else If a year is multiple of 100, then it is not a leap year
            else if (year % 100 == 0)
                return false;

            // Else If a year is multiple of 4, then it is a leap year
            else if (year % 4 == 0)
                return true;

            else
                return false;
        }

}

   public void checker(){
        System.out.println("okay");
   }
}

