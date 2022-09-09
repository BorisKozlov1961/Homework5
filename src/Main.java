public class Main {
    public static void main(String[] args) {
//Задание 1
        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

//Задание 2
        System.out.println("Задание2");
        int clientOS1 = 0;

        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015){
            switch (clientOS1) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else
            switch (clientOS1){
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }


//Задание 3

        int year = 2020;

        if (year %100==0 && year %400 == 0){
            System.out.println(year + " год является високосным");
        }
        else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year +" год является високосным");
        }
        else if (year % 100 == 0){
            System.out.println(year + "  год не является високосным");
        }
        else
            System.out.println(year + " год не является високосным");

//Задание 4

    int deliveryDistance = 61;

        if (deliveryDistance<=20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else System.out.println("Потребуется дней: 3");

//Задание 5

    int monthNumber = 7;
    if (monthNumber < 13) {
        switch (monthNumber) {
            case (1):
            case (2):
            case (12):
                System.out.println("Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Осень");
                break;
            }
        } else System.out.println("Такого месяца не существует");
    }
}

