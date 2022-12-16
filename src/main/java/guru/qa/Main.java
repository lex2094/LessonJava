package guru.qa;

import guru.qa.core.Application;
import guru.qa.core.TaxDateCalculator;
import guru.qa.data.InMemoryEmployeeRepository;
import guru.qa.io.ConsoleIO;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        new Application(
                new ConsoleIO(
                        new InMemoryEmployeeRepository()
                ),
                new TaxDateCalculator()

        ).run();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите имя сотрудника");
//        String name = sc.nextLine();
//        System.out.println("Введите дату отьезда из страны:");
//        String sourceDate = sc.nextLine();
//        System.out.println("Введенная дата: " + sourceDate);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date departureData = sdf.parse(sourceDate);
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(departureData);
//        cal.add(Calendar.DATE, 180);
//        Date dateOfLoseTaxResidence = cal.getTime();
//        System.out.println("Сотрудник "
//                + name +
//                " потеряет налоговое резиденство "
//                + dateOfLoseTaxResidence);
    }
}
