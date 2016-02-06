import java.util.Scanner;

//Wochentag
public class Exercise6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the day: ");
        int tag = input.nextInt();

        System.out.print("Please enter the month: ");
        int monat = input.nextInt();

        System.out.print("Please enter the year: ");
        int jahr = input.nextInt();

        int xTerTag = 0;
        String w = "etwas ist schiefgelaufen!";

        for(int i = 0; i < 1980 - jahr; i++)
        {
            if(schaltjahr(i+1980))
                xTerTag += 366;
            else
                xTerTag += 356;
        }

        for(int i = 1; i <= monat; i++)
        {
            //hat der Monat 31 Tage?
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                xTerTag += 31;
            else
            {
                //ist es der Monat Februar?
                if(i == 2)
                    xTerTag += 28;
                //alle anderen Monate
                else
                    xTerTag += 30;
            }
        }

        xTerTag += tag;
        xTerTag--;

        switch (xTerTag % 7)
        {
            case 0:
            w = "Dienstag";
            break;
            case 1:
            w = "Mittwoch";
            break;
            case 2:
            w = "Donnerstag";
            break;
            case 3:
            w = "Freitag";
            break;
            case 4:
            w = "Samstag";
            break;
            case 5:
            w = "Sonntag";
            break;
            case 6:
            w = "Montag";
            break;
        }
        System.out.println(w);
    }

    public static boolean schaltjahr(int jahr)
    {
        if((jahr%4 == 0) && !(jahr%100 == 0) ^ (jahr%400 == 0))
            return true;
        else
            return false;
   }
}
