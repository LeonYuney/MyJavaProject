import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Leon_branch");

        // Вызов метода для получения ввода
        int result = getCountInput();
        System.out.println("Результат: " + result);
    }

    private static int getCountInput() {
        // Создаем объект Scanner для считывания ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 6: ");
        int a = scanner.nextInt(); // Считываем число

        // Проверяем, введено ли число 6
        if (a != 6) {
            System.out.println("Вы ввели не 6. Попробуйте снова.");
            return 1; // Возвращаем -1 для обозначения ошибки
        }

        // Выполняем цикл от 0 до a (включительно)
        for (int i = 0; i < a; i++) {
            System.out.print(a / 2 + " "); // Выводим a / 2
            if (a < 0) {
                break; // Если a отрицательное, выходим из цикла
            }
        }
        return 0; // Возвращаем результат деления
    }
}