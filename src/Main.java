public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int targetAmount = 2459000;
        int totalSavings = 0;
        int savingsPerMonth = 15000;
        int countOfMonths = 0;

        while (totalSavings <= targetAmount) {
            totalSavings += savingsPerMonth;
            countOfMonths++;
            System.out.println("Месяц " + countOfMonths + " сумма накоплений равна " + totalSavings);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int yearCounter = 1;
        int growthPerYear = (population / 1000) * (birthRate - deathRate);

        while (yearCounter <= 10) {
            population += growthPerYear;
            System.out.println("Год " + yearCounter + ", численность неселения составляет " + population);
            yearCounter++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int firstDeposit = 15000;
        double interestRatePerMonth = 0.07;
        int targetAmount = 12_000_000;
        double savingAccount = firstDeposit;
        int monthCounter = 0;

        while (savingAccount <= targetAmount) {
            savingAccount += (savingAccount * interestRatePerMonth);
            monthCounter++;
            System.out.println("Месяц " + monthCounter + ", накоплено " + savingAccount + " рублей.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int firstDeposit = 15000;
        double interestRatePerMonth = 0.07;
        int targetAmount = 12_000_000;
        double savingAccount = firstDeposit;
        int monthCounter = 0;

        while (savingAccount <= targetAmount) {
            savingAccount += (savingAccount * interestRatePerMonth);
            monthCounter++;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", накоплено " + savingAccount + " рублей.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int firstDeposit = 15000;
        double interestRatePerMonth = 0.07;
        double savingAccount = firstDeposit;
        int monthsToSave = 9 * 12;
        int monthCounter = 1;

        while (monthCounter <= monthsToSave) {
            savingAccount += (savingAccount * interestRatePerMonth);
            monthCounter++;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", накоплено " + savingAccount + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число.");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int startDate = 2023 - 200;
        int endDate = 2023 + 100;
        int period = 79;
        int beginning = 0;

        while (beginning <= endDate) {
            if (beginning >= startDate) {
                System.out.println(beginning);
            }
            beginning += period;
        }
    }
}