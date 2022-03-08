package peaksoft;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Жуманын кунун жазыныз, ошол кундун расписаниесин билиш учун.");

        DaysOfAWeek daysOfAWeek = DaysOfAWeek.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));

        switch (daysOfAWeek) {
            case MONDAY -> System.out.println("Дүйшөмбүдо биз лекцияда отурабыз");
            case TUESDAY -> System.out.println("Шейшембиде биз софт скиллс сабагын окуйбуз");
            case WEDNESDAY -> System.out.println("Шаршембиде биз лекцияда отурабыз");
            case THURSDAY -> System.out.println("Бейшембиде биз чет-тил сабагын окуйбуз");
            case FRIDAY -> System.out.println("Жумада биз лекцияда отурабыз");
            case SATURDAY -> System.out.println("Ишембиде сабак болбойт");
            case SUNDAY -> System.out.println("Жекшембиде сабак болбойт");
        }












    }
}
