//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int days = 10; // изначальное количество дней в Париже

        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            for (; days > 0; ) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней.");
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }
    }
}