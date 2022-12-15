public class Calculator {

    public void starCalculations(){

        while (true){
            System.out.println("Введите операцию: \n" +
                    "Сложение: + \n +" +
                    "Вычетание: - \n +" +
                    "Умножение: * \n +" +
                    "Деление: / \n +" +
                    "Выход: + e \n +");
            char ch = Main.scanner.next().charAt(0);     // Работаем со статической переменной

            switch (ch){
                case '+':
                    sum();
                    break;

                case '-':
                    sub();
                    break;

                case '*':
                    mul();
                    break;

                case '/':
                    div();
                    break;
                case 'e':
                    div();
                    break;
            }


        }

    }

    private void div() {
        double a = Main.scanner.nextDouble();
        double b = Main.scanner.nextDouble();
        System.out.println("Частное: " + a/b);
    }

    private void mul() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Произведение: " + a*b);
    }

    private void sub() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Разность: " + (a-b));
    }

    private void sum() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Сумма: " + (a+b));
    }
}
