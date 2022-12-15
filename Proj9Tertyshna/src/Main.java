import java.util.Scanner;

public class Main {
  /*  //TODO План занятия:
      1.   do ..while
      2. Практика
    */
    /*
    Теория:





    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("DO");
        }
        while (10 < 9); // false
        // printHello();//

        Solver solver = new Solver();
        System.out.println("Корень: " + solver.linearEquation(2, 10));

        System.out.println("Введите первый параметр: ");
        int a = scanner.nextInt();
        System.out.println("Введите второй параметр: ");
        int b = scanner.nextInt();
        System.out.println("Введите третьий параметр: ");
        int c = scanner.nextInt();


        if (solver.isRoots(solver.findDiscriminant(a, b, c))) {
            if (solver.isTwoRoots(solver.findDiscriminant(a, b, c))) {
                double[] arr = solver.doubleRoot(a, b, solver.findDiscriminant(a, b, c));
                System.out.println("Первый корень: " + arr[0]);
                System.out.println("Второй корень: " + arr[1]);

            } else {
                System.out.println("Один корень: " + solver.SingleRoot(a, b, solver.findDiscriminant(a, b, c)));
            }
        } else {
            System.out.println("Корней нет");
        }

    }
}
