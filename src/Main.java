public class Main {

    public static void main(String[] args) {


        System.out.println("Задание1");

        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        System.out.println("Задание 2");

        int clientOSNew = 1;
        int clientDeviceYear = 2014;

        if (clientOSNew == 0){
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облечгенную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облечгенную версию приложения для Android по ссылке");
            }else
                System.out.println("Установите  версию приложения для Android по ссылке");
        }


        System.out.println("Задание 3");

        int year = 400;
        if (year % 4 ==0 && year % 100 != 0 || year % 400 ==0){
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }


        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней : " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребутся дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <=100){
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        }


        System.out.println("Задание 5");

        int monthNumber = 12;

        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}