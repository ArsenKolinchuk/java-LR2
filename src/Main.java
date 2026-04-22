import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int n = 10;
        double[] x = new double[n];
        double[] y = new double[n];

        Random random = new Random();

        System.out.println("Генерація значень:");

        // заповнення масиву
        for (int i = 0; i < n; i++) {
            x[i] = random.nextDouble();
            y[i] = Math.cos(x[i]);

            System.out.println("i=" + i +
                    " x=" + x[i] +
                    " cos(x)=" + y[i]);
        }

        System.out.println("\nПошук максимального значення:");

        double max = y[0];
        System.out.println("Початковий max = " + max);

        for (int i = 1; i < n; i++) {

            System.out.println("Порівнюємо max=" + max + " з y[" + i + "]=" + y[i]);

            if (y[i] > max) {
                max = y[i];
                System.out.println("Новий max = " + max);
            }
        }

        System.out.println("\nРЕЗУЛЬТАТ:");
        System.out.println("Найбільше значення cos(x): " + max);
    }
}
