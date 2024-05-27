public class hometask {
    public static void main(String[] args) {
        System.out.println(1); // задача 1
        int money = 15_000;
        double total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = (total + money) * 1.01;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month ++;
        }
        System.out.println();

        System.out.println(2);//задача 2
        int number = 0;
        while (number < 10) {
            number ++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println(3);//задача 3
        int population = 12_000_000;
        int birthRate ;
        int deathRate;

        for(int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population += birthRate - deathRate;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();

        System.out.println(4);//задача 4
        int vasyaMoney = 15_000;
        double vasyaProcent = 1.07;
        int vasyaMounth = 1;
        while (vasyaMoney <= 12_000_000) {
            vasyaMoney *= vasyaProcent;
            vasyaMounth ++;
            System.out.println("Месяц " + vasyaMounth + ". Накоплено: " + vasyaMoney);
        }
        System.out.println();

        System.out.println(5);//задача 5
        int vasyaMoney2 = 15_000;
        double vasyaProcent2 = 1.07;
        int vasyaMounth2 = 0;
        while (vasyaMoney2 <= 12_000_000) {
            vasyaMoney2 *= vasyaProcent2;
            vasyaMounth2 += 6;
            System.out.println("Месяц " + vasyaMounth2 + ". Накоплено: " + vasyaMoney2);
        }
        System.out.println();

        System.out.println(6); //задача 6
        int vasyaMoney3 = 15_000;
        double vasyaProcent3 = 1.07;
        int allYear = 9 * 12;
        for (int i = 1; i <= allYear; i++) {
            vasyaMoney3 *= vasyaProcent3;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Накоплено: " + vasyaMoney3);
            }
        }
        System.out.println();

        System.out.println(7); //задача 7
        int fridayNumber = 5;
        int monthDays = 31;
        for (int i = fridayNumber; i <= monthDays; i += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", i);
        }
        System.out.println();

        System.out.println(8); //задача 8
        int period = 79;
        int currentYear = 2024;
        int lowerBord = currentYear - 200;
        int upperBorder = currentYear + 100;
        for (int i = 0; i <= upperBorder; i ++) {
            if (i > lowerBord && i % period == 0) {
                System.out.println(i);
            }
        }
        System.out.println("конец");
    }
    }
