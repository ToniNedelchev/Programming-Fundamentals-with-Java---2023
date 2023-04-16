package Lab.Arrays;

import java.util.Scanner;

public class T1_DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Прочитане на входните данни.
        int dayOfTheWeekNumber = Integer.parseInt(scanner.nextLine()); // -> Променлива за съхранение на номера на деня от седмицата.

        // 1 -> Monday.
        // 2 -> Tuesday.
        // 3 -> Wednesday.
        // 4 -> Thursday.
        // 5 -> Friday.
        // 6 -> Saturday.
        // 7 -> Sunday.

        // 2. Създаване на текстов масив с дните от седмицата.
        String[] dayOfWeekArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // 3. Проверка дали денят е валиден или не (при валиден ден отпечатваме денят съответстващ на дадения номер
        //    а при невалиден ден отпечатваме "Invalid day!").
        if (dayOfTheWeekNumber >= 1 && dayOfTheWeekNumber <= 7) {

            System.out.println(dayOfWeekArr[dayOfTheWeekNumber - 1]);

        } else {

            System.out.println("Invalid day!");

        }
    }
}
