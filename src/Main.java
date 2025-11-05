//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание №1 ");


        int firstFriday = 3;
        for (int i = 1; i <= 31; i++) {
            if (i % 7 == firstFriday) {
                System.out.println(" Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет. ");
            }
            if (i % 7 != firstFriday) {
                System.out.println(" Сегодня не пятница, " + i + "-е число, отдыхай. ");
            }
        }


        System.out.println(" Задание №2.1 ");


        int theEntireDistance = 42_195;
        int distance = 500;
        do {
            theEntireDistance = theEntireDistance - distance;
            System.out.println(" Держитесь! Осталось " + theEntireDistance + " метров. ");
        } while (theEntireDistance >= 0);


        System.out.println(" Задание №2.2 ");


        for (int i = 42_195; i >= 0; i = i - distance) {
            System.out.println(" Держитесь осталось " + i + " метров. ");
            System.out.println(i);

        }


        System.out.println(" Задание №3.1 ");


        int budget = 2000;
        int day = 0;
        while (budget >= 100) {
            day++;
            System.out.println(" День: " + day);
            System.out.println(" Оставшийся бюджет: " + budget);
            if (day % 5 == 0) {
                System.out.println(" Бесплатный день. ");
                System.out.println("");
                continue;
            }
            budget = budget - 100;
            System.out.println("");
        }


        System.out.println(" Задание №3.2 ");


        int money = 1000;
        int days = 0;
        for (; money >= 100; ) {
            days++;
            if (days % 5 == 0) {
                System.out.println(" Бесплатный день: " + days + " Бюджет: " + money);
                continue;
            }
            money = money - 100;
            System.out.println(" День: " + days + " Бюджет: " + money);
        }


        System.out.println(" Задание №4 ");


        int month = 0;
        double total = 25_000;
        while (total < 12_000_000) {
            month++;
            if (month % 6 == 0) {
                total = total * 1.07;
            }
            total = total + 15_000;
            if (total >= 12_000_000) {
                break;
            }
            System.out.println(" Месяц: " + month + " Накопления: " + String.format("%2f.", total));
        }
        System.out.println(" Цель достигнута! ");
        System.out.println(" Потребовалось месяцев: " + month);
        System.out.println(" Накопленно средств: " + String.format("%2f.", total));


        System.out.println(" Задание №5 ");


        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge <= 100 && overheats <= 3) {
            minute++;
            charge += 2;
            if (minute % 10 == 0) {
                System.out.println(" Перегрев! Зараядка преостановлена на 2 минуты.");
                minute +=2;
                overheats++;
                continue;
            }
            if (overheats >= 3) {
                System.out.println(" Зараядка прекращена. Текущий заряд: " + charge + "%");
                break;
            }
            System.out.println(" Время зараядки " + minute + " минут. Процентов заряжено: " + charge + "%");
        }
        System.out.println(" Общее время зарядки: " + minute + " минут. Батарея заряжена на " + charge + "%");
    }
}



