package guru.qa;

import guru.qa.core.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        new Application().run();
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
