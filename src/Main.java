//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //Задание 1//
        System.out.println("Задание 1");
        int os = 1;
        if (os == 0) {
            System.out.println("установите версию для приложения IOS по ссылке");
        } else if (os == 1) {
            System.out.println("установите версию для приложения Android по ссылке");
        } else {
            System.out.println("неверное значение");
        }
        // Задание 2//
        System.out.println("Задание 2");
        os = 1;
        int clientDeviceYear = 2016;
        if (os == 00 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для приложения IOS по ссылке");
        } else if (os == 00 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию для приложения IOS по ссылке");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для приложения Android по ссылке");
        } else {
            System.out.println("Установите обычную версию для приложения Android по ссылке");
        }
        //Задание 3//
        System.out.println("Задание 3");
        int year = 2012;
        if (year > 1584 && ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0)) {
            System.out.println(year + " Год является высокосным");
        } else {
            System.out.println(year + " не является высокосным");
        }
        //Задание 4//
        System.out.println("Задание 4");
        int deliveryDistance = 120;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        } else {
            System.out.println("Доставки нет");
        }
        //Задание 5 //
        System.out.println("Задание 5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году 12 месяцев");
        }

    }
}